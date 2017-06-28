package client;

import java.awt.*;

/**
 * Created by liweihao on 6/22/17.
 */
public class ClientLogin {
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ClientLoginView window = new ClientLoginView();
                    window.getFrame().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
