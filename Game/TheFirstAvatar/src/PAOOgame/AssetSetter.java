package PAOOgame;

import entity.NPC_Raava;
import monster.MON_BlueSpirit;
import monster.MON_Golem;
import monster.MON_Jellyfish;
import monster.MON_Vaatu;
import object.*;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {

        int mapNum = 0;
        int i = 0;
        mapNum = 1;
        gp.obj[mapNum][i] = new OBJ_Apple(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 23;
        gp.obj[mapNum][i].worldY = gp.tileSize * 33;
        i++;

        gp.obj[mapNum][i] = new OBJ_Apple(gp);
        gp.obj[mapNum][i].worldX = 42 * gp.tileSize;
        gp.obj[mapNum][i].worldY = 22 * gp.tileSize;
        i++;

        gp.obj[mapNum][i] = new OBJ_Liont(gp);
        gp.obj[mapNum][i].worldX = 49 * gp.tileSize;
        gp.obj[mapNum][i].worldY = 25 * gp.tileSize;


        mapNum = 2;
        i = 0;
        gp.obj[mapNum][i] = new OBJ_Liont(gp);
        gp.obj[mapNum][i].worldX = 30 * gp.tileSize;
        gp.obj[mapNum][i].worldY = 11 * gp.tileSize;

        mapNum = 3;
        i = 0;
        gp.obj[mapNum][i] = new OBJ_Liont(gp);
        gp.obj[mapNum][i].worldX = 11 * gp.tileSize;
        gp.obj[mapNum][i].worldY = 13 * gp.tileSize;

    }

    public void setNPC() {

        int mapNum = 0;
        int i = 0;

        gp.npc[mapNum][i] = new NPC_Raava(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 29;
        gp.npc[mapNum][i].worldY = gp.tileSize * 48;


        mapNum = 1;
        i = 0;
        gp.npc[mapNum][i] = new NPC_Raava(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 12;
        gp.npc[mapNum][i].worldY = gp.tileSize * 26;

        mapNum = 2;
        i = 0;
        gp.npc[mapNum][i] = new NPC_Raava(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 31;
        gp.npc[mapNum][i].worldY = gp.tileSize * 48;

        mapNum = 3;
        i = 0;
        gp.npc[mapNum][i] = new NPC_Raava(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 49;
        gp.npc[mapNum][i].worldY = gp.tileSize * 30;

    }
    public void setMonster() {

        int mapNum = 0;
        int i = 0;

        mapNum = 1;
        gp.monster[mapNum][i] = new MON_BlueSpirit(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 15;
        gp.monster[mapNum][i].worldY = gp.tileSize *29;
        i++;
        gp.monster[mapNum][i] = new MON_BlueSpirit(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 16;
        gp.monster[mapNum][i].worldY = gp.tileSize *29;
        i++;
        gp.monster[mapNum][i] = new MON_BlueSpirit(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 32;
        gp.monster[mapNum][i].worldY = gp.tileSize * 43;
        i++;
        gp.monster[mapNum][i] = new MON_BlueSpirit(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 33;
        gp.monster[mapNum][i].worldY = gp.tileSize *43;
        i++;
        gp.monster[mapNum][i] = new MON_BlueSpirit(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 34;
        gp.monster[mapNum][i].worldY = gp.tileSize *43;
        i++;
        gp.monster[mapNum][i] = new MON_BlueSpirit(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 43;
        gp.monster[mapNum][i].worldY = gp.tileSize *15;
        i++;
        gp.monster[mapNum][i] = new MON_BlueSpirit(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 44;
        gp.monster[mapNum][i].worldY = gp.tileSize *15;
        i++;
        gp.monster[mapNum][i] = new MON_BlueSpirit(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 45;
        gp.monster[mapNum][i].worldY = gp.tileSize *15;


        mapNum = 2;
        i=0;
        gp.monster[mapNum][i] = new MON_Jellyfish(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 30;
        gp.monster[mapNum][i].worldY = gp.tileSize *45;
        i++;
        gp.monster[mapNum][i] = new MON_Jellyfish(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 31;
        gp.monster[mapNum][i].worldY = gp.tileSize *45;
        i++;
        gp.monster[mapNum][i] = new MON_Jellyfish(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 30;
        gp.monster[mapNum][i].worldY = gp.tileSize *28;
        i++;
        gp.monster[mapNum][i] = new MON_Jellyfish(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 31;
        gp.monster[mapNum][i].worldY = gp.tileSize *28;
        i++;
        gp.monster[mapNum][i] = new MON_Jellyfish(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 30;
        gp.monster[mapNum][i].worldY = gp.tileSize *15;
        i++;
        gp.monster[mapNum][i] = new MON_Jellyfish(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 31;
        gp.monster[mapNum][i].worldY = gp.tileSize *15;

        mapNum = 3;
        i=0;
        gp.monster[mapNum][i] = new MON_Golem(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 30;
        gp.monster[mapNum][i].worldY = gp.tileSize *45;
        i++;
        gp.monster[mapNum][i] = new MON_Golem(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 30;
        gp.monster[mapNum][i].worldY = gp.tileSize *44;
        i++;
        gp.monster[mapNum][i] = new MON_Golem(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 30;
        gp.monster[mapNum][i].worldY = gp.tileSize *46;
        i++;
        gp.monster[mapNum][i] = new MON_Golem(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 26;
        gp.monster[mapNum][i].worldY = gp.tileSize *15;
        i++;
        gp.monster[mapNum][i] = new MON_Golem(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 27;
        gp.monster[mapNum][i].worldY = gp.tileSize *15;
        i++;
        gp.monster[mapNum][i] = new MON_Golem(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 28;
        gp.monster[mapNum][i].worldY = gp.tileSize *15;

        mapNum = 4;
        i=0;
        gp.monster[mapNum][i] = new MON_Vaatu(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 43;
        gp.monster[mapNum][i].worldY = gp.tileSize * 29;

    }
}
