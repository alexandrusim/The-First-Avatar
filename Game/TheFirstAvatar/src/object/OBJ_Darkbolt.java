package object;

import PAOOgame.GamePanel;
import entity.Projectile;

public class OBJ_Darkbolt extends Projectile {
    GamePanel gp;

    public OBJ_Darkbolt(GamePanel gp) {
        super(gp);
        this.gp = gp;

        name = "Darkbolt";
        speed = 5;
        maxLife = 80;
        life = maxLife;
        attack = 3;

        alive = false;
        getImage();

    }

    public void getImage() {

        up1 = setup("/projectile/darkbolt1_up",gp.tileSize,gp.tileSize);
        up2 = setup("/projectile/darkbolt2_up",gp.tileSize,gp.tileSize);
        down1 = setup("/projectile/darkbolt1_down",gp.tileSize,gp.tileSize);
        down2 = setup("/projectile/darkbolt2_down",gp.tileSize,gp.tileSize);
        left1 = setup("/projectile/darkbolt1_left",gp.tileSize,gp.tileSize);
        left2 = setup("/projectile/darkbolt2_left",gp.tileSize,gp.tileSize);
        right1 = setup("/projectile/darkbolt1_right",gp.tileSize,gp.tileSize);
        right2 = setup("/projectile/darkbolt2_right",gp.tileSize,gp.tileSize);

    }
}

