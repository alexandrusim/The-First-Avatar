package entity;

import PAOOgame.GamePanel;
import PAOOgame.KeyHandler;
import PAOOgame.UtilityTool;
import object.OBJ_Earthbump;
import object.OBJ_Fireball;
import object.OBJ_Waterspike;
import object.OBJ_Windslash;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.IOException;

public class Player extends Entity {

    KeyHandler keyH;

    public final int screenX;
    public final int screenY;
    public int ability;

    public Player(GamePanel gp, KeyHandler keyH) {

        super(gp);

        this.keyH = keyH;

        screenX = gp.screenWidth/2 - (gp.tileSize/2);
        screenY = gp.screenHeight/2 - (gp.tileSize/2);

        solidArea = new Rectangle();
        solidArea.x=8;
        solidArea.y=16;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width=32;
        solidArea.height=32;

        setDefaultValues();
        getPlayerImage();
    }
    public void setDefaultValues() {

        worldX = gp.tileSize * 30 ;
        worldY = gp.tileSize * 48;
        speed = 8;
        direction = "down";
        ability = 1;

        // PLAYER STATUS
        maxLife = 10;
        life = maxLife;
        projectile = new OBJ_Fireball(gp);
        projectile1 = new OBJ_Windslash(gp);
        projectile2 = new OBJ_Waterspike(gp);
        projectile3 = new OBJ_Earthbump(gp);

    }
    public void setDefaultPositions() {

        worldX = gp.tileSize * 11 ;
        worldY = gp.tileSize * 29;
        direction = "down";
    }
    public void restoreLife() {

        life = maxLife;
        invincible = false;
    }
    public void getPlayerImage() {
        up1= setup("/player/up1",gp.tileSize,gp.tileSize);
        up2= setup("/player/up2",gp.tileSize,gp.tileSize);
        up3= setup("/player/up3",gp.tileSize,gp.tileSize);
        up4= setup("/player/up4",gp.tileSize,gp.tileSize);
        up5= setup("/player/up5",gp.tileSize,gp.tileSize);
        up6= setup("/player/up6",gp.tileSize,gp.tileSize);
        up7= setup("/player/up7",gp.tileSize,gp.tileSize);
        up8= setup("/player/up8",gp.tileSize,gp.tileSize);

        down1 = setup("/player/down1",gp.tileSize,gp.tileSize);
        down2 = setup("/player/down2",gp.tileSize,gp.tileSize);
        down3 = setup("/player/down3",gp.tileSize,gp.tileSize);
        down4 = setup("/player/down4",gp.tileSize,gp.tileSize);
        down5 = setup("/player/down5",gp.tileSize,gp.tileSize);
        down6 = setup("/player/down6",gp.tileSize,gp.tileSize);
        down7 = setup("/player/down7",gp.tileSize,gp.tileSize);
        down8 = setup("/player/down8",gp.tileSize,gp.tileSize);

        left1 = setup("/player/left1",gp.tileSize,gp.tileSize);
        left2 = setup("/player/left2",gp.tileSize,gp.tileSize);
        left3 = setup("/player/left3",gp.tileSize,gp.tileSize);
        left4 = setup("/player/left4",gp.tileSize,gp.tileSize);
        left5 = setup("/player/left5",gp.tileSize,gp.tileSize);
        left6 = setup("/player/left6",gp.tileSize,gp.tileSize);
        left7 = setup("/player/left7",gp.tileSize,gp.tileSize);
        left8 = setup("/player/left8",gp.tileSize,gp.tileSize);

        right1 = setup("/player/right1",gp.tileSize,gp.tileSize);
        right2 = setup("/player/right2",gp.tileSize,gp.tileSize);
        right3 = setup("/player/right3",gp.tileSize,gp.tileSize);
        right4 = setup("/player/right4",gp.tileSize,gp.tileSize);
        right5 = setup("/player/right5",gp.tileSize,gp.tileSize);
        right6 = setup("/player/right6",gp.tileSize,gp.tileSize);
        right7 = setup("/player/right7",gp.tileSize,gp.tileSize);
        right8 = setup("/player/right8",gp.tileSize,gp.tileSize);

    }

    public void draw(Graphics2D g2) {

        BufferedImage image = null;

        switch (direction) {
            case "up":
                if (spriteNum == 1) {image = up1;}
                if (spriteNum == 2) {image = up2;}
                if (spriteNum == 3) {image = up3;}
                if (spriteNum == 4) {image = up4;}
                if (spriteNum == 5) {image = up5;}
                if (spriteNum == 6) {image = up6;}
                if (spriteNum == 7) {image = up7;}
                if (spriteNum == 8) {image = up8;}
                break;
            case "down":
                if (spriteNum == 1) {image = down1;}
                if (spriteNum == 2) {image = down2;}
                if (spriteNum == 3) {image = down3;}
                if (spriteNum == 4) {image = down4;}
                if (spriteNum == 5) {image = down5;}
                if (spriteNum == 6) {image = down6;}
                if (spriteNum == 7) {image = down7;}
                if (spriteNum == 8) {image = down8;}
                break;
            case "left":
                if (spriteNum == 1) {image = left1;}
                if (spriteNum == 2) {image = left2;}
                if (spriteNum == 3) {image = left3;}
                if (spriteNum == 4) {image = left4;}
                if (spriteNum == 5) {image = left5;}
                if (spriteNum == 6) {image = left6;}
                if (spriteNum == 7) {image = left7;}
                if (spriteNum == 8) {image = left8;}
                break;
            case "right":
                if (spriteNum == 1) {image = right1;}
                if (spriteNum == 2) {image = right2;}
                if (spriteNum == 3) {image = right3;}
                if (spriteNum == 4) {image = right4;}
                if (spriteNum == 5) {image = right5;}
                if (spriteNum == 6) {image = right6;}
                if (spriteNum == 7) {image = right7;}
                if (spriteNum == 8) {image = right8;}
                break;
        }

        if(invincible == true) {
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f));
        }
        g2.drawImage(image, screenX, screenY, null);

        // Reset Alpha
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));

        // debug
        // g2.setFont(new Font("Arial", Font.PLAIN, 26));
        // g2.setColor(Color.white);
        //  g2.drawString("Invincible:" + invincibleCounter, 10, 400);
    }

    public void update() {

        if(keyH.upPressed == true || keyH.downPressed == true ||
                keyH.leftPressed == true || keyH.rightPressed == true || keyH.spacePressed == true) {

            if(keyH.upPressed == true) {
                direction = "up";
            }
            else if(keyH.downPressed == true) {
                direction = "down";
            }
            else if(keyH.leftPressed == true) {
                direction = "left";
            }
            else if(keyH.rightPressed == true) {
                direction = "right";
            }

            // CHECK TILE COLLISION
            collisionOn = false;
            gp.cChecker.checkTile(this);

            // CHECK OBJECT COLLISION
            int objIndex =gp.cChecker.checkObject(this, true);
            pickUpObject(objIndex);

            // CHECK NPC COLLISION
            int npcIndex = gp.cChecker.checkEntity(this, gp.npc);
            interactNPC(npcIndex);

            // CHECK MONSTER COLLISION
            int monsterIndex = gp.cChecker.checkEntity(this, gp.monster);
            contactMonster(monsterIndex);

            // CHECK EVENT
            gp.eHandler.checkEvent();


            // IF COLLISION IS FALSE, PLAYER CAN MOVE
            if(collisionOn == false && keyH.spacePressed == false) {
                switch (direction) {
                    case "up": worldY = worldY - speed;
                        break;
                    case "down": worldY = worldY + speed;
                        break;
                    case "left": worldX = worldX - speed;
                        break;
                    case "right": worldX = worldX + speed;
                        break;
                }
            }
            gp.keyH.spacePressed = false;

            spriteCounter++;
            if(spriteCounter > 10) {
                if(spriteNum == 1) {
                    spriteNum =2;
                } else if(spriteNum == 2) {
                    spriteNum = 3;
                } else if(spriteNum == 3) {
                    spriteNum = 4;
                } else if(spriteNum == 4) {
                    spriteNum = 5;
                } else if(spriteNum == 5) {
                    spriteNum = 6;
                } else if(spriteNum == 6) {
                    spriteNum = 7;
                } else if (spriteNum == 7) {
                    spriteNum = 8;
                } else if (spriteNum == 8) {
                    spriteNum =1;
                }
                spriteCounter = 0;
            }
            if(life <= 0) {
                gp.gameState = gp.gameOverState;
            }
        }

        // PROJECTILE fireball
        if(gp.keyH.qKeyPressed == true && projectile.alive == false && shotAvailableCounter == 30) {

            // SET DEFAULT COORDINATES, DIRECTION AND USER
            projectile.set(worldX, worldY, direction, true, this);

            // ADD IT TO THE LIST
            gp.projectileList.add(projectile);

            shotAvailableCounter = 0;
        }
        // outside of key if
        if(invincible == true) {
            invincibleCounter++;
            if(invincibleCounter > 60) {
                invincible = false;
                invincibleCounter = 0;
            }
        }
        if(shotAvailableCounter < 30) {
            shotAvailableCounter++;
        }

        // PROJECTILE windslash
        if(gp.keyH.wKeyPressed == true && projectile1.alive == false && shotAvailableCounter == 30) {

            // SET DEFAULT COORDINATES, DIRECTION AND USER
            projectile1.set(worldX, worldY, direction, true, this);

             // ADD IT TO THE LIST
             gp.projectileList.add(projectile1);

             shotAvailableCounter = 0;
        }
        // outside of key if
        if(invincible == true) {
            invincibleCounter++;
            if(invincibleCounter > 60) {
                invincible = false;
                invincibleCounter = 0;
            }
        }
        if(shotAvailableCounter < 30) {
            shotAvailableCounter++;
        }

        // PROJECTILE waterspike
        if(gp.keyH.eKeyPressed == true && projectile2.alive == false && shotAvailableCounter == 30) {

            // SET DEFAULT COORDINATES, DIRECTION AND USER
            projectile2.set(worldX, worldY, direction, true, this);

            // ADD IT TO THE LIST
            gp.projectileList.add(projectile2);

            shotAvailableCounter = 0;
        }
        // outside of key if
        if(invincible == true) {
            invincibleCounter++;
            if(invincibleCounter > 60) {
                invincible = false;
                invincibleCounter = 0;
            }
        }
        if(shotAvailableCounter < 30) {
            shotAvailableCounter++;
        }
        // PROJECTILE earthbump
        if(gp.keyH.rKeyPressed == true && projectile3.alive == false && shotAvailableCounter == 30) {

            // SET DEFAULT COORDINATES, DIRECTION AND USER
            projectile3.set(worldX, worldY, direction, true, this);

            // ADD IT TO THE LIST
            gp.projectileList.add(projectile3);

            shotAvailableCounter = 0;
        }
        // outside of key if
        if(invincible == true) {
            invincibleCounter++;
            if(invincibleCounter > 60) {
                invincible = false;
                invincibleCounter = 0;
            }
        }
        if(shotAvailableCounter < 30) {
            shotAvailableCounter++;
        }

    }
    public void pickUpObject(int i) {

        if(i != 999) {

            String objectName = gp.obj[gp.currentMap][i].name;

            switch (objectName) {
                case "Apple":
                    //heal player tbd
                    gp.obj[gp.currentMap][i] = null;

                    if(gp.player.life < gp.player.maxLife - 1) {

                         gp.player.life = gp.player.life + 2;
                    }
                    else {
                        gp.player.life = gp.player.maxLife;
                    }
                    break;
                case "Liont":
                    gp.player.ability++;
                    gp.obj[gp.currentMap][i] = null;

                    gp.gameState = gp.dialogueState;
                    gp.ui.currentDialogue = "You learnt a new element";


                    //Liont(gp.dialogueState);
            }
        }
    }
    public void interactNPC(int i) {

        if(i != 999) {

            if(gp.keyH.spacePressed == true) {
                gp.gameState = gp.dialogueState;
                gp.npc[gp.currentMap][i].speak();
            }
        }
    }
    public void contactMonster(int i) {

        if(i != 999) {

            if(invincible == false) {
                life -= 1;
                invincible = true;
            }
        }
    }
    public void damageMonster(int i, int attack) {

        if(i != 999) {

            if(gp.monster[gp.currentMap][i].invincible == false) {

                gp.monster[gp.currentMap][i].life -= 1;
                gp.monster[gp.currentMap][i].invincible = true;
                gp.monster[gp.currentMap][i].damageReaction();

                if(gp.monster[gp.currentMap][i].life <= 0) {
                    gp.monster[gp.currentMap][i].dying = true;
                }
            }
        }
    }

}

/*    public BufferedImage setup(String imageName) {

        UtilityTool uTool = new UtilityTool();
        BufferedImage image = null;

        try{
            image = ImageIO.read(getClass().getResourceAsStream("/player/" + imageName + ".png"));
            image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
        }catch(IOException e) {
            e.printStackTrace();
        }
        return image;
    }*/