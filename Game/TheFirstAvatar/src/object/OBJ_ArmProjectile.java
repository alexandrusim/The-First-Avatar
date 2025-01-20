package object;

import PAOOgame.GamePanel;
import entity.Projectile;

public class OBJ_ArmProjectile extends Projectile {
    GamePanel gp;

    public OBJ_ArmProjectile(GamePanel gp) {
        super(gp);
        this.gp = gp;

        name = "ArmProjectile";
        speed = 4;
        maxLife = 80;
        life = maxLife;
        attack = 2;

        alive = false;
        getImage();

    }

    public void getImage() {

        up1 = setup("/projectile/arm_projectile_up",gp.tileSize,gp.tileSize);
        up2 = setup("/projectile/arm_projectile_up",gp.tileSize,gp.tileSize);
        down1 = setup("/projectile/arm_projectile_down",gp.tileSize,gp.tileSize);
        down2 = setup("/projectile/arm_projectile_down",gp.tileSize,gp.tileSize);
        left1 = setup("/projectile/arm_projectile_left",gp.tileSize,gp.tileSize);
        left2 = setup("/projectile/arm_projectile_left",gp.tileSize,gp.tileSize);
        right1 = setup("/projectile/arm_projectile_right",gp.tileSize,gp.tileSize);
        right2 = setup("/projectile/arm_projectile_right",gp.tileSize,gp.tileSize);

    }
}

