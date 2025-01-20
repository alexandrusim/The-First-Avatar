package PAOOgame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class KeyHandler implements KeyListener {

    GamePanel gp;
    public boolean upPressed, downPressed, leftPressed, rightPressed,  qKeyPressed, wKeyPressed, eKeyPressed, rKeyPressed, spacePressed;
    // DEBUG
    boolean showDebugText = false;

    public KeyHandler(GamePanel gp) {
        this.gp =gp;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode();
        // TITLE STATE
        if(gp.gameState == gp.titleState) {
            titleState(code);
        }

        // GAME STATE
        if(gp.gameState == gp.playState) {
            playState(code);
        }
        // PAUSE STATE
        else if(gp.gameState == gp.pauseState) {
            pauseState(code);
        }
        // DIALOGUE STATE
        else if(gp.gameState == gp.dialogueState) {
            dialogueState(code);
        }
        // OPTIONS STATE
        else if(gp.gameState == gp.optionsState) {
            optionsState(code);
        }
        // GAME OVER STATE
        else if(gp.gameState == gp.gameOverState) {
            gameOverState(code);
        }
        // DEBUG
        if(code == KeyEvent.VK_T) {
            if(showDebugText == false) {
                showDebugText = true;
            }
            else if(showDebugText == true) {
                showDebugText = false;
            }
        }

    }
    public void titleState(int code) {

        if(code == KeyEvent.VK_UP){
            gp.ui.commandNumber--;
            if(gp.ui.commandNumber < 0) {
                gp.ui.commandNumber = 2;
            }
        }
        if(code == KeyEvent.VK_DOWN){
            gp.ui.commandNumber++;
            if(gp.ui.commandNumber > 2) {
                gp.ui.commandNumber = 0;
            }
        }
        if(code == KeyEvent.VK_SPACE) {
            if(gp.ui.commandNumber == 0) {
                gp.gameState = gp.playState;
                gp.player.setDefaultValues();
            }
            if(gp.ui.commandNumber == 1) {
                int []v = DbConnection.readAllData();
                gp.currentMap = v[0];
                gp.player.worldX = v[1];
                gp.player.worldY = v[2];
                gp.player.life = v[3];
                gp.player.ability = v[4];
                gp.gameState = gp.playState;
            }
            if(gp.ui.commandNumber == 2) {
                System.exit(0);
            }
        }
    }
    public void playState(int code) {

        if(code == KeyEvent.VK_UP){
            upPressed = true;
        }
        if(code == KeyEvent.VK_DOWN){
            downPressed = true;
        }
        if(code == KeyEvent.VK_LEFT){
            leftPressed = true;
        }
        if(code == KeyEvent.VK_RIGHT){
            rightPressed = true;
        }
        if(code == KeyEvent.VK_Q && (gp.player.ability == 1 || gp.player.ability == 4)) {
            qKeyPressed = true;
        }
        if(code == KeyEvent.VK_W && (gp.player.ability == 2 || gp.player.ability == 4)) {
            wKeyPressed = true;
        }
        if(code == KeyEvent.VK_E && (gp.player.ability == 3 || gp.player.ability == 4)) {
            eKeyPressed = true;
        }
        if(code == KeyEvent.VK_R && gp.player.ability == 4) {
            rKeyPressed = true;
        }
        if(code == KeyEvent.VK_P) {
            gp.gameState = gp.pauseState;
        }
        if(code == KeyEvent.VK_SPACE) {
            spacePressed = true;
        }
        if(code == KeyEvent.VK_ESCAPE) {
            gp.gameState = gp.optionsState;
        }
    }
    public void pauseState(int code) {

        if(code == KeyEvent.VK_P) {
            gp.gameState = gp.playState;
        }
    }
    public void dialogueState(int code) {

        if(code == KeyEvent.VK_SPACE) {
            gp.gameState = gp.playState;
        }
    }
    public void optionsState(int code) {

        if(code == KeyEvent.VK_ESCAPE) {
            gp.gameState = gp.playState;
        }
        if(code == KeyEvent.VK_SPACE) {
            spacePressed = true;
        }

        int maxCommandNum = 0;
        switch (gp.ui.subState) {
            case 0: maxCommandNum =3; break;
            case 3: maxCommandNum =1; break;
        }
        if(code == KeyEvent.VK_UP) {
            gp.ui.commandNumber--;
            if(gp.ui.commandNumber < 0) {
                gp.ui.commandNumber = maxCommandNum;
            }
        }
        if(code == KeyEvent.VK_DOWN) {
            gp.ui.commandNumber++;
            if(gp.ui.commandNumber > maxCommandNum) {
                gp.ui.commandNumber =0;
            }
        }
    }
    public void gameOverState(int code) {

        if(code == KeyEvent.VK_UP) {
            gp.ui.commandNumber--;
            if(gp.ui.commandNumber < 0) {
                gp.ui.commandNumber = 1;
            }
        }
        if(code == KeyEvent.VK_DOWN) {
            gp.ui.commandNumber++;
            if(gp.ui.commandNumber > 1) {
                gp.ui.commandNumber = 0;
            }
        }
        if(code == KeyEvent.VK_SPACE) {
            if(gp.ui.commandNumber == 0) {
                gp.gameState = gp.playState;
                gp.retry();
            }
            else if(gp.ui.commandNumber == 1) {
                gp.gameState = gp.titleState;
                gp.restart();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();

        if(code == KeyEvent.VK_UP){
            upPressed = false;
        }
        if(code == KeyEvent.VK_DOWN){
            downPressed = false;
        }
        if(code == KeyEvent.VK_LEFT){
            leftPressed = false;
        }
        if(code == KeyEvent.VK_RIGHT){
            rightPressed = false;
        }
        if(code == KeyEvent.VK_Q ) {
            qKeyPressed = false;
        }
        if(code == KeyEvent.VK_W ) {
            wKeyPressed = false;
        }
        if(code == KeyEvent.VK_E) {
            eKeyPressed = false;
        }
        if(code == KeyEvent.VK_R ) {
            rKeyPressed = false;
        }
    }
}
