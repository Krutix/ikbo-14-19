package lw6.ex3;

import javax.swing.*;

public class TestTextEditor {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setContentPane(new TextEditor().panel);
        fr.setSize(500, 500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
