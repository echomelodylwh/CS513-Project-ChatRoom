package server;

import java.awt.*;

/**
 * Created by liweihao on 6/22/17.
 */
public class ServerLogin {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ServerView window = new ServerView();
                    window.getFrame().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
