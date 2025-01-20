package entity;

import PAOOgame.GamePanel;

import java.awt.*;
import java.util.Random;

public class NPC_Raava extends Entity{

    public  NPC_Raava(GamePanel gp) {
        super(gp);

        direction = "down";
        speed = 6;

        solidArea = new Rectangle();
        solidArea.x = 8;
        solidArea.y = 16;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 30;
        solidArea.height = 30;
        getImage();
        setDialogue();
    }

    public void getImage() {

        up1= setup("/npc/raavaL1",gp.tileSize,gp.tileSize);up2= setup("/npc/raavaL2",gp.tileSize,gp.tileSize);
        up2= setup("/npc/raavaL1",gp.tileSize,gp.tileSize);
        up3= setup("/npc/raavaL2",gp.tileSize,gp.tileSize);
        up4= setup("/npc/raavaL1",gp.tileSize,gp.tileSize);
        up5= setup("/npc/raavaL2",gp.tileSize,gp.tileSize);
        up6= setup("/npc/raavaL1",gp.tileSize,gp.tileSize);
        up7= setup("/npc/raavaL2",gp.tileSize,gp.tileSize);
        up8= setup("/npc/raavaL1",gp.tileSize,gp.tileSize);

        down1 = setup("/npc/raavaR1",gp.tileSize,gp.tileSize);
        down2 = setup("/npc/raavaR2",gp.tileSize,gp.tileSize);
        down3 = setup("/npc/raavaR1",gp.tileSize,gp.tileSize);
        down4 = setup("/npc/raavaR2",gp.tileSize,gp.tileSize);
        down5 = setup("/npc/raavaR1",gp.tileSize,gp.tileSize);
        down6 = setup("/npc/raavaR2",gp.tileSize,gp.tileSize);
        down7 = setup("/npc/raavaR1",gp.tileSize,gp.tileSize);
        down8 = setup("/npc/raavaR2",gp.tileSize,gp.tileSize);

        left1 = setup("/npc/raavaL1",gp.tileSize,gp.tileSize);
        left2 = setup("/npc/raavaL2",gp.tileSize,gp.tileSize);
        left3 = setup("/npc/raavaL1",gp.tileSize,gp.tileSize);
        left4 = setup("/npc/raavaL2",gp.tileSize,gp.tileSize);
        left5 = setup("/npc/raavaL1",gp.tileSize,gp.tileSize);
        left6 = setup("/npc/raavaL2",gp.tileSize,gp.tileSize);
        left7 = setup("/npc/raavaL1",gp.tileSize,gp.tileSize);
        left8 = setup("/npc/raavaL2",gp.tileSize,gp.tileSize);

        right1 = setup("/npc/raavaR1",gp.tileSize,gp.tileSize);
        right2 = setup("/npc/raavaR2",gp.tileSize,gp.tileSize);
        right3 = setup("/npc/raavaR1",gp.tileSize,gp.tileSize);
        right4 = setup("/npc/raavaR2",gp.tileSize,gp.tileSize);
        right5 = setup("/npc/raavaR1",gp.tileSize,gp.tileSize);
        right6 = setup("/npc/raavaR2",gp.tileSize,gp.tileSize);
        right7 = setup("/npc/raavaR1",gp.tileSize,gp.tileSize);
        right8 = setup("/npc/raavaR2",gp.tileSize,gp.tileSize);
    }
    public void setDialogue() {


        dialogues[0] = "You've freed Vaatu and made\na grave mistake.";
        dialogues[1] = "Now, you can help me defeat him\nby mastering  all four elements.";
        dialogues[2] = "Since you already know firebending,\nyou'll have to start with airbending.";
        dialogues[3] = "Then you learn waterbending,\n and earthbending.";
        dialogues[4] = "While you master each element\n I'll keep the others.";
        dialogues[5] = "After you master all four\n we're gonna merge souls on the final fight\n and you will be able to enter avatar state.";

    }
    public void setAction() {

        if(onPath == true) {

           // int goalCol = 12;
           // int goalRow = 9;
            int goalCol = (gp.player.worldX + gp.player.solidArea.x)/gp.tileSize;
            int goalRow = (gp.player.worldY + gp.player.solidArea.y)/gp.tileSize;

            searchPath(goalCol, goalRow);
        }
        else {
            actionLockCounter++;

            if (actionLockCounter == 120) {
                Random random = new Random();
                int i = random.nextInt(100) + 1; //pick up a number from 1 to 100

                if (i <= 25) {
                    direction = "up";
                }
                if (i > 25 && i <= 50) {
                    direction = "down";
                }
                if (i > 50 && i <= 75) {
                    direction = "left";
                }
                if (i > 75 && i <= 100) {
                    direction = "right";
                }

                actionLockCounter = 0;
            }
        }
    }
    public void speak() {

        // do this character specific stuff

        super.speak();
        onPath = true;
    }
}
