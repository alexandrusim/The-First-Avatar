package tile;

import PAOOgame.GamePanel;
import PAOOgame.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TileManager {

    GamePanel gp;
    public Tile[] tile;
    public int[][][] mapTileNum;
    boolean drawPath = true;

    public TileManager(GamePanel gp) {

        this.gp = gp;

        tile= new Tile[70];
        mapTileNum = new int [gp.maxMap][gp.maxWorldCol][gp.maxWorldRow];

        getTileImage0();
        loadMap("/maps/LVL0.txt",0);

       /* getTileImage1();
        loadMap("/maps/LVL1_aer.txt", 1);

        getTileImage2();
        loadMap("/maps/LVL2.txt",2);

        getTileImage3();
        loadMap("/maps/LVL3.txt",3);

        getTileImage4();
        loadMap("/maps/LVL4.txt",4);*/
    }


    public void getTileImage0() {
        setup(0,"bush", true);
        setup(1,"deal1", true);
        setup(2,"deal2", true);
        setup(3,"deal3", true);
        setup(4,"deal4", true);
        setup(5,"deal5", true);
        setup(6,"deal6", true);
        setup(7,"deal7", true);
        setup(8,"deal8", true);
        setup(9,"deal9", true);
        setup(10,"deal10", true);
        setup(11,"deal11", true);
        setup(12,"deal12", true);
        setup(13,"flower", true);
        setup(14,"grass0", false);
        setup(15,"grass1", false);
        setup(16,"grass2", false);
        setup(17,"grass3", false);
        setup(18,"grass4", false);
        setup(19,"grass5", false);
        setup(20,"grass6", false);
        setup(21,"grass7", false);
        setup(22,"grass8", false);
        setup(23,"grassC1", false);
        setup(24,"grassC2", false);
        setup(25,"grassC3", false);
        setup(26,"grassC4", false);
        setup(27,"ground", false);
        setup(28,"groundC", true);
        setup(29,"sign1", true);
        setup(30,"sign2", true);
        setup(31,"tree1", true);
        setup(32,"tree2", true);
        setup(33,"tree3", true);
        setup(34,"tree4", true);
        setup(35,"tree5", true);
        setup(36,"tree6", true);
        setup(37,"water1", true);
        setup(38,"water2", true);
        setup(39,"water3", true);
        setup(40,"water4", true);
        setup(41,"water5", true);
        setup(42,"water6", true);
        setup(43,"water7", true);
        setup(44,"water8", true);
        setup(45,"water9", true);
        setup(46,"portalN1", false);
        setup(47,"portalN2", false);
        setup(48,"portalN3", false);
        setup(49,"portalN4", false);
        setup(50,"portalS1", false);
        setup(51,"portalS2", false);
        setup(52,"portalS3", false);
        setup(53,"portalS4", false);
        setup(54,"sign3", true);
        setup(55,"sign4", true);
        setup(56,"sign5", true);
    }
    public void getTileImage1() {

        setup(0,"bush", true);
        setup(1,"deal1", true);
        setup(2,"deal2", true);
        setup(3,"deal3", true);
        setup(4,"deal4", true);
        setup(5,"deal5", true);
        setup(6,"deal6", true);
        setup(7,"deal7", true);
        setup(8,"deal8", true);
        setup(9,"deal9", true);
        setup(10,"deal10", true);
        setup(11,"deal11", true);
        setup(12,"deal12", true);
        setup(13,"flower", true);
        setup(14,"grass0", false);
        setup(15,"grass1", false);
        setup(16,"grass2", false);
        setup(17,"grass3", false);
        setup(18,"grass4", false);
        setup(19,"grass5", false);
        setup(20,"grass6", false);
        setup(21,"grass7", false);
        setup(22,"grass8", false);
        setup(23,"grassC1", false);
        setup(24,"grassC2", false);
        setup(25,"grassC3", false);
        setup(26,"grassC4", false);
        setup(27,"ground", false);
        setup(28,"groundC", true);
        setup(29,"sign3", true);
        setup(30,"sign2", true);
        setup(31,"tree1", true);
        setup(32,"tree2", true);
        setup(33,"tree3", true);
        setup(34,"tree4", true);
        setup(35,"tree5", true);
        setup(36,"tree6", true);
    }
    public void getTileImage2() {
        setup(0,"ice0",false);
        setup(1,"iceG0",false);
        setup(2,"iceG1",false);
        setup(3,"iceG2",false);
        setup(4,"iceG3",false);
        setup(5,"iceG4",false);
        setup(6,"iceG5",false);
        setup(7,"iceG6",false);
        setup(8,"iceG7",false);
        setup(9,"iceG8",false);
        setup(10,"iceG9",false);
        setup(11,"iceG10",false);
        setup(12,"iceG11",false);
        setup(13,"iceG12",false);
        setup(14,"iceG13",false);
        setup(15,"iceG14",false);
        setup(16,"iceG15",false);
        setup(17,"root0",true);
        setup(18,"root1",true);
        setup(19,"root2",true);
        setup(20,"root3",true);
        setup(21,"root4",true);
        setup(22,"root5",true);
        setup(23,"root6",true);
        setup(24,"root7",true);
        setup(25,"root8",true);
        setup(26,"root9",true);
        setup(27,"root10",true);
        setup(28,"root11",true);
        setup(29,"root12",true);
        setup(30,"root13",true);
        setup(31,"root14",true);
        setup(32,"root15",true);
        setup(33,"snow0",true);
        setup(34,"snow1",true);
        setup(35,"snow2",true);
        setup(36,"snow3",true);
        setup(37,"snow4",true);
        setup(38,"snow5",true);
        setup(39,"snow6",true);
        setup(40,"snow7",true);
        setup(41,"snow8",true);
        setup(42,"snow9",true);
        setup(43,"snow10",true);
        setup(44,"snow11",true);
        setup(45,"snow12",true);
        setup(46,"snow13",true);
        setup(47,"snow14",true);
        setup(48,"snow15",true);
        setup(49,"iceSign",true);
    }
    public void getTileImage3() {
        setup(0,"cactus0",true);
        setup(1,"cactus1",true);
        setup(2,"munte0",true);
        setup(3,"munte1",true);
        setup(4,"munte2",true);
        setup(5,"munte3",true);
        setup(6,"munte4",true);
        setup(7,"munte5",true);
        setup(8,"munte6",true);
        setup(9,"munte7",true);
        setup(10,"munte8",true);
        setup(11,"munte9",true);
        setup(12,"munte10",true);
        setup(13,"munte11",true);
        setup(14,"munte12",true);
        setup(15,"munte13",true);
        setup(16,"munte14",true);
        setup(17,"path0", false);
        setup(18,"path1", false);
        setup(19,"path2", false);
        setup(20,"path3", false);
        setup(21,"path4", false);
        setup(22,"path5", false);
        setup(23,"path6", false);
        setup(24,"path7", false);
        setup(25,"path8", false);
        setup(26,"piatra0",true);
        setup(27,"piatra1",true);
        setup(28,"pathC",true);
        setup(29,"tile041",true);
        setup(30,"tile042",true);
    }
    public void getTileImage4() {
        setup(0,"munte0",true);
        setup(1,"munte1",true);
        setup(2,"munte2",true);
        setup(3,"munte3",true);
        setup(4,"munte4",true);
        setup(5,"munte5",true);
        setup(6,"munte6",true);
        setup(7,"munte7",true);
        setup(8,"munte8",true);
        setup(9,"munte9",true);
        setup(10,"munte10",true);
        setup(11,"munte11",true);
        setup(12,"munte12",true);
        setup(13,"munte13",true);
        setup(14,"munte14",true);
        setup(15,"path0", false);
        setup(16,"path1", false);
        setup(17,"path2", false);
        setup(18,"path3", false);
        setup(19,"path4", false);
        setup(20,"path5", false);
        setup(21,"path6", false);
        setup(22,"path7", false);
        setup(23,"path8", false);
        setup(24,"pathC",true);
        setup(25,"piatra0",true);
        setup(26,"piatra1",true);
        setup(27,"portalR1",false);
        setup(28,"portalR2",false);
        setup(29,"portalR3",false);
        setup(30,"portalR4",false);
        setup(31,"portalV1",false);
        setup(32,"portalV2",false);
        setup(33,"portalV3",false);
        setup(34,"portalV4",false);
    }
    public void setup(int index, String imageName, boolean collision) {

        UtilityTool uTool = new UtilityTool();

        try {
            tile[index] = new Tile();
            tile[index].image = ImageIO.read(getClass().getResourceAsStream("/tiles/" + imageName + ".png"));
            tile[index].image = uTool.scaleImage(tile[index].image, gp.tileSize, gp.tileSize);
            tile[index].collision = collision;

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    public void loadMap(String filePath, int map) {

        try {
            InputStream is = getClass().getResourceAsStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int col = 0;
            int row = 0;

            while(col < gp.maxWorldCol && row < gp.maxWorldRow) {

                String line = br.readLine();

                while(col < gp.maxWorldCol) {

                    String []numbers = line.split(" ");

                    int num = Integer.parseInt(numbers[col]);

                    mapTileNum[map][col][row] = num;
                    col++;
                }
                if(col == gp.maxWorldCol) {
                    col = 0;
                    row++;
                }
            }
            br.close();
        }catch(Exception e) {

        }
    }
    public void draw(Graphics2D g2) {

        int worldCol = 0;
        int worldRow = 0;


        while(worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {

            int tileNum = mapTileNum[gp.currentMap][worldCol][worldRow];

            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;

            if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX && worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
                    worldY + gp.tileSize > gp.player.worldY - gp.player.screenY && worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {

                g2.drawImage(tile[tileNum-1].image, screenX, screenY,null);
            }

            worldCol++;

            if(worldCol == gp.maxWorldCol) {
                worldCol = 0;
                worldRow++;

            }
        }
        /*if(drawPath == true) {
            g2.setColor(new Color(255,0,0,70));

            for(int i = 0; i < gp.pFinder.pathList.size(); i++) {

                int worldX = gp.pFinder.pathList.get(i).col * gp.tileSize;
                int worldY = gp.pFinder.pathList.get(i).row * gp.tileSize;
                int screenX = worldX - gp.player.worldX + gp.player.screenX;
                int screenY = worldY - gp.player.worldY + gp.player.screenY;

                g2.fillRect(screenX, screenY, gp.tileSize, gp.tileSize);
            }
        }*/
    }
}

/* pt lvl 1
            setup(0,"bush", true);
            setup(1,"deal1", true);
            setup(2,"deal2", true);
            setup(3,"deal3", true);
            setup(4,"deal4", true);
            setup(5,"deal5", true);
            setup(6,"deal6", true);
            setup(7,"deal7", true);
            setup(8,"deal8", true);
            setup(9,"deal9", true);
            setup(10,"deal10", true);
            setup(11,"deal11", true);
            setup(12,"deal12", true);
            setup(13,"flower", true);
            setup(14,"grass0", false);
            setup(15,"grass1", false);
            setup(16,"grass2", false);
            setup(17,"grass3", false);
            setup(18,"grass4", false);
            setup(19,"grass5", false);
            setup(20,"grass6", false);
            setup(21,"grass7", false);
            setup(22,"grass8", false);
            setup(23,"grassC1", false);
            setup(24,"grassC2", false);
            setup(25,"grassC3", false);
            setup(26,"grassC4", false);
            setup(27,"ground", false);
            setup(28,"groundC", true);
            setup(29,"sign3", true);
            setup(30,"sign2", true);
            setup(31,"tree1", true);
            setup(32,"tree2", true);
            setup(33,"tree3", true);
            setup(34,"tree4", true);
            setup(35,"tree5", true);
            setup(36,"tree6", true);
 */

/* pt lvl 2

    setup(0,"ice0",false);
    setup(1,"iceG0",false);
    setup(2,"iceG1",false);
    setup(3,"iceG2",false);
    setup(4,"iceG3",false);
    setup(5,"iceG4",false);
    setup(6,"iceG5",false);
    setup(7,"iceG6",false);
    setup(8,"iceG7",false);
    setup(9,"iceG8",false);
    setup(10,"iceG9",false);
    setup(11,"iceG10",false);
    setup(12,"iceG11",false);
    setup(13,"iceG12",false);
    setup(14,"iceG13",false);
    setup(15,"iceG14",false);
    setup(16,"iceG15",false);
    setup(17,"root0",true);
    setup(18,"root1",true);
    setup(19,"root2",true);
    setup(20,"root3",true);
    setup(21,"root4",true);
    setup(22,"root5",true);
    setup(23,"root6",true);
    setup(24,"root7",true);
    setup(25,"root8",true);
    setup(26,"root9",true);
    setup(27,"root10",true);
    setup(28,"root11",true);
    setup(29,"root12",true);
    setup(30,"root13",true);
    setup(31,"root14",true);
    setup(32,"root15",true);
    setup(33,"snow0",true);
    setup(34,"snow1",true);
    setup(35,"snow2",true);
    setup(36,"snow3",true);
    setup(37,"snow4",true);
    setup(38,"snow5",true);
    setup(39,"snow6",true);
    setup(40,"snow7",true);
    setup(41,"snow8",true);
    setup(42,"snow9",true);
    setup(43,"snow10",true);
    setup(44,"snow11",true);
    setup(45,"snow12",true);
    setup(46,"snow13",true);
    setup(47,"snow14",true);
    setup(48,"snow15",true);
    setup(49,"iceSign",true);

 */

/*
pt lvl3
    setup(0,"cactus0",true);
    setup(1,"cactus1",true);
    setup(2,"munte0",true);
    setup(3,"munte1",true);
    setup(4,"munte2",true);
    setup(5,"munte3",true);
    setup(6,"munte4",true);
    setup(7,"munte5",true);
    setup(8,"munte6",true);
    setup(9,"munte7",true);
    setup(10,"munte8",true);
    setup(11,"munte9",true);
    setup(12,"munte10",true);
    setup(13,"munte11",true);
    setup(14,"munte12",true);
    setup(15,"munte13",true);
    setup(16,"munte14",true);
    setup(17,"path0", false);
    setup(18,"path1", false);
    setup(19,"path2", false);
    setup(20,"path3", false);
    setup(21,"path4", false);
    setup(22,"path5", false);
    setup(23,"path6", false);
    setup(24,"path7", false);
    setup(25,"path8", false);
    setup(26,"piatra0",true);
    setup(27,"piatra1",true);
    setup(28,"pathC",true);
    setup(29,"tile041",true);
    setup(30,"tile042",true);

 */

/*
pt lvl 4
    setup(0,"munte0",true);
    setup(1,"munte1",true);
    setup(2,"munte2",true);
    setup(3,"munte3",true);
    setup(4,"munte4",true);
    setup(5,"munte5",true);
    setup(6,"munte6",true);
    setup(7,"munte7",true);
    setup(8,"munte8",true);
    setup(9,"munte9",true);
    setup(10,"munte10",true);
    setup(11,"munte11",true);
    setup(12,"munte12",true);
    setup(13,"munte13",true);
    setup(14,"munte14",true);
    setup(15,"path0", false);
    setup(16,"path1", false);
    setup(17,"path2", false);
    setup(18,"path3", false);
    setup(19,"path4", false);
    setup(20,"path5", false);
    setup(21,"path6", false);
    setup(22,"path7", false);
    setup(23,"path8", false);
    setup(24,"pathC",true);
    setup(25,"piatra0",true);
    setup(26,"piatra1",true);
    setup(27,"portalR1",false);
    setup(28,"portalR2",false);
    setup(29,"portalR3",false);
    setup(30,"portalR4",false);
    setup(31,"portalV1",false);
    setup(32,"portalV2",false);
    setup(33,"portalV3",false);
    setup(34,"portalV4",false);

 */