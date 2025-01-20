package object;

import PAOOgame.GamePanel;
import entity.Entity;


public class OBJ_Liont extends Entity {

    public OBJ_Liont(GamePanel gp) {
        super(gp);

        name = "Liont";
        down1 = setup("/objects/liont",gp.tileSize*2,gp.tileSize*2);



    }

}
