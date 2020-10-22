package pr9.Students;

import javax.swing.*;

public class LabClassDriver {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setSize(500, 300);
        fr.setContentPane(new LabClassUI().rootPanel);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
