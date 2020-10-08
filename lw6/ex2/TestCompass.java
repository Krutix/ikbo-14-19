package lw6.ex2;

import javax.swing.*;

public class TestCompass {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setContentPane(new Compass().field);
        fr.setSize(500, 500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
