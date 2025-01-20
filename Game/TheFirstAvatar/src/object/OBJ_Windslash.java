package object;

import PAOOgame.GamePanel;
import entity.Projectile;

public class OBJ_Windslash extends Projectile {

    GamePanel gp;

    public OBJ_Windslash(GamePanel gp) {
        super(gp);
        this.gp = gp;

        name = "Windslash";
        speed = 6;
        maxLife = 80;
        life = maxLife;
        attack = 2;

        alive = false;
        getImage();

    }

    public void getImage() {

        up1 = setup("/projectile/windslash_up_1",gp.tileSize,gp.tileSize);
        up2 = setup("/projectile/windslash_up_2",gp.tileSize,gp.tileSize);
        down1 = setup("/projectile/windslash_down_1",gp.tileSize,gp.tileSize);
        down2 = setup("/projectile/windslash_down_2",gp.tileSize,gp.tileSize);
        left1 = setup("/projectile/windslash_left_1",gp.tileSize,gp.tileSize);
        left2 = setup("/projectile/windslash_left_2",gp.tileSize,gp.tileSize);
        right1 = setup("/projectile/windslash_right_1",gp.tileSize,gp.tileSize);
        right2 = setup("/projectile/windslash_right_2",gp.tileSize,gp.tileSize);

    }
}