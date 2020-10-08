package lw6.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor {
    private JTextArea textArea;
    public JPanel panel;
    private JComboBox fontBox;
    private JComboBox colorBox;

    public TextEditor()
    {
        GraphicsEnvironment ge;
        ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] names = ge.getAvailableFontFamilyNames();
        for (String font : names)
            fontBox.addItem(font);
        fontBox.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String font = (String)fontBox.getSelectedItem();
                Font nFont = new Font(font, Font.PLAIN, 14);
                textArea.setFont(nFont);
            }
        });

        colorBox.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = (String)colorBox.getSelectedItem();
                Color selColor;
                switch (color)
                {
                    case "Red":
                        selColor = Color.red;
                        break;
                    case "Black":
                        selColor = Color.black;
                        break;
                    case "Blue":
                        selColor = Color.blue;
                        break;
                    default:
                        selColor = Color.white;
                }
                textArea.setForeground(selColor);
            }
        });
    }
}
