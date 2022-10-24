import main_window.Manager;

import javax.swing.*;

public class SnakeGame {

    private static void init() {
        JFrame window = new JFrame("Snake Game");
        Manager manager = new Manager();
        window.add(manager);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        manager.init();
        window.setVisible(true);
    }

    public static void main (String [] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                init();
            }
        });
    }
}


