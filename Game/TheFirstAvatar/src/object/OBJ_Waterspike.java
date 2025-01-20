package object;

import PAOOgame.GamePanel;
import entity.Projectile;

public class OBJ_Waterspike extends Projectile {

    GamePanel gp;

    public OBJ_Waterspike(GamePanel gp) {
        super(gp);
        this.gp = gp;

        name = "Waterspike";
        speed = 4;
        maxLife = 80;
        life = maxLife;
        attack = 3;

        alive = false;
        getImage();

    }

    public void getImage() {

        up1 = setup("/projectile/waterspike_up_1",gp.tileSize,gp.tileSize);
        up2 = setup("/projectile/waterspike_up_2",gp.tileSize,gp.tileSize);
        down1 = setup("/projectile/waterspike_down_1",gp.tileSize,gp.tileSize);
        down2 = setup("/projectile/waterspike_down_2",gp.tileSize,gp.tileSize);
        left1 = setup("/projectile/waterspike_left_1",gp.tileSize,gp.tileSize);
        left2 = setup("/projectile/waterspike_left_2",gp.tileSize,gp.tileSize);
        right1 = setup("/projectile/waterspike_right_1",gp.tileSize,gp.tileSize);
        right2 = setup("/projectile/waterspike_right_2",gp.tileSize,gp.tileSize);

    }
}

