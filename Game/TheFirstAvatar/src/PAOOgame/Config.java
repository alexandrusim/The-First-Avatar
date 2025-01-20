package PAOOgame;

import java.io.*;

public class Config {

    GamePanel gp;

    public  Config(GamePanel gp) {
        this.gp = gp;
    }

    public void saveConfig() {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("config.txt"));

            // FULLSCREEN
            if(gp.fullScreenOn == true) {
                bw.write("On");
            }
            if(gp.fullScreenOn == false) {
                bw.write("Off");
            }
            bw.newLine();

            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadConfig() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("config.txt"));

            String s = br.readLine();

            // FULLSCREEN
            if(s.equals("On")) {
                gp.fullScreenOn = true;
            }
            if(s.equals("Off")) {
                gp.fullScreenOn = false;
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
