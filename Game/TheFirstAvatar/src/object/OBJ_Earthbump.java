package object;

import PAOOgame.GamePanel;
import entity.Projectile;

public class OBJ_Earthbump extends Projectile{

    GamePanel gp;

    public OBJ_Earthbump(GamePanel gp) {
        super(gp);
        this.gp = gp;

        name = "Earthbump";
        speed = 3;
        maxLife = 80;
        life = maxLife;
        attack = 4;

        alive = false;
        getImage();

    }

    public void getImage() {

        up1 = setup("/projectile/earthbump_up_1",gp.tileSize,gp.tileSize);
        up2 = setup("/projectile/earthbump_up_2",gp.tileSize,gp.tileSize);
        down1 = setup("/projectile/earthbump_down_1",gp.tileSize,gp.tileSize);
        down2 = setup("/projectile/earthbump_down_2",gp.tileSize,gp.tileSize);
        left1 = setup("/projectile/earthbump_left_1",gp.tileSize,gp.tileSize);
        left2 = setup("/projectile/earthbump_left_2",gp.tileSize,gp.tileSize);
        right1 = setup("/projectile/earthbump_right_1",gp.tileSize,gp.tileSize);
        right2 = setup("/projectile/earthbump_right_2",gp.tileSize,gp.tileSize);

    }
}
