package pr7;

import javax.swing.*;

public class DrunkardGame {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setSize(500, 300);
        fr.setContentPane(new DrunkardGameUI().mainPanel);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
