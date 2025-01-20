package object;

import PAOOgame.GamePanel;
import entity.Entity;


public class OBJ_Apple extends Entity {

    public OBJ_Apple(GamePanel gp) {
        super(gp);

        name = "Apple";
        down1 = setup("/objects/apple",gp.tileSize,gp.tileSize);



    }

}
