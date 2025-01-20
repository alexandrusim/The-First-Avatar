package PAOOgame;

import java.awt.*;

public class EventHandler {

    GamePanel gp;
    EventRect [][][]eventRect;
    boolean canTouchEvent;
    int previousEventX, previousEventY;

    public EventHandler(GamePanel gp) {
        this.gp = gp;

        eventRect = new EventRect[gp.maxMap][gp.maxWorldCol][gp.maxWorldRow];

        int map = 0;
        int col = 0;
        int row = 0;
        while(map < gp.maxMap && col < gp.maxWorldCol && row < gp.maxWorldRow) {
            eventRect[map][col][row] = new EventRect();
            eventRect[map][col][row].x = 23;
            eventRect[map][col][row].y = 23;
            eventRect[map][col][row].width = 2;
            eventRect[map][col][row].height = 2;
            eventRect[map][col][row].eventRectDefaultX = eventRect[map][col][row].x;
            eventRect[map][col][row].eventRectDefaultY = eventRect[map][col][row].y;

            col++;
            if(col == gp.maxWorldCol) {
                col = 0;
                row++;

                if(row == gp.maxWorldRow) {
                    row = 0;
                    map ++;
                }
            }
        }
    }

    public void checkEvent() {

        // Check if the player character is more than 1 tile away from the last event
        int xDistance = Math.abs(gp.player.worldX - previousEventX);
        int yDistance = Math.abs(gp.player.worldY - previousEventY);
        int distance = Math.max(xDistance, yDistance);
        if(distance > gp.tileSize) {
            canTouchEvent = true;
        }

        if(canTouchEvent == true) {
            if (hit(0, 29, 33, "up") == true) {healingPool(gp.dialogueState);}
            else if (hit(0, 33, 29, "left") == true) {healingPool(gp.dialogueState);}
            else if (hit(0, 29, 26, "down") == true) {healingPool(gp.dialogueState);}
            else if (hit(0, 26, 29, "right") == true) {healingPool(gp.dialogueState);}

            else if (hit(0, 49, 28, "any") == true) { // din lvl 0 in 1
                gp.tileM.getTileImage1();
                gp.tileM.loadMap("/maps/LVL1_aer.txt", 1);
                teleport(1, 10, 27);

            }
            else if (hit(1, 10, 27, "any") == true) { // din lvl 1 in 0
               gp.tileM.getTileImage0();
               gp.tileM.loadMap("/maps/LVL0.txt",0);
                teleport(0, 49, 28);
            }

            else if (hit(0, 29, 10, "any") == true) { // din lvl 0 in 2
                gp.tileM.getTileImage2();
                gp.tileM.loadMap("/maps/LVL2.txt", 2);
                teleport(2, 29, 48);
            }
            else if (hit(2, 29, 48, "any") == true) { // din lvl 2 in 0
                gp.tileM.getTileImage0();
                gp.tileM.loadMap("/maps/LVL0.txt", 0);
                teleport(0, 29, 10);
            }

            else if (hit(0, 10, 28, "any") == true) { // din lvl 0 in 3
                gp.tileM.getTileImage3();
                gp.tileM.loadMap("/maps/LVL3.txt", 3);
                teleport(3, 49, 29);
            }
            else if (hit(3, 49, 29, "any") == true) { // din lvl 3 in 0
                gp.tileM.getTileImage0();
                gp.tileM.loadMap("/maps/LVL0.txt", 0);
                teleport(0, 10, 28);
            }

            else if (hit(0, 23, 29, "any") == true && gp.player.ability == 4) { // din lvl 0 in 4
                gp.tileM.getTileImage4();
                gp.tileM.loadMap("/maps/LVL4.txt", 4);
                teleport(4, 15, 30);
            }
        }
    }
    public boolean hit(int map, int col, int row, String reqDirection) {

        boolean hit = false;

        if(map == gp.currentMap) {
            gp.player.solidArea.x = gp.player.worldX + gp.player.solidArea.x;
            gp.player.solidArea.y = gp.player.worldY + gp.player.solidArea.y;
            eventRect[map][col][row].x = col * gp.tileSize + eventRect[map][col][row].x;
            eventRect[map][col][row].y = row * gp.tileSize + eventRect[map][col][row].y;

            if (gp.player.solidArea.intersects(eventRect[map][col][row]) && eventRect[map][col][row].eventDone == false) {
                if (gp.player.direction.contentEquals(reqDirection) || reqDirection.contentEquals("any")) {
                    hit = true;

                    previousEventX = gp.player.worldX;
                    previousEventY = gp.player.worldY;
                }
            }

            gp.player.solidArea.x = gp.player.solidAreaDefaultX;
            gp.player.solidArea.y = gp.player.solidAreaDefaultY;
            eventRect[map][col][row].x = eventRect[map][col][row].eventRectDefaultX;
            eventRect[map][col][row].y = eventRect[map][col][row].eventRectDefaultY;
        }

        return hit;
    }

    public void healingPool(int gameState) {
        if(gp.keyH.spacePressed == true) {
            gp.gameState = gameState;
            gp.ui.currentDialogue = "You heal in the oasis";
            gp.player.life = gp.player.maxLife;
        }
    }

    public void teleport(int map, int col, int row) {

        gp.currentMap = map;
        gp.player.worldX = gp.tileSize * col;
        gp.player.worldY = gp.tileSize * row;
        previousEventX = gp.player.worldX;
        previousEventY = gp.player.worldY;
        canTouchEvent = false;
    }

}
