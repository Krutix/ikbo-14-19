package lw6.ex1;

import javax.swing.*;

public class GuessingTest {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setContentPane(new Guessing().panel);
        fr.setSize(450, 120);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(false);
        fr.setVisible(true);
    }
}
