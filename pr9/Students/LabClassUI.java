package pr9.Students;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;

public class LabClassUI {
    private LabClass labClass;
    private JButton findButton;
    private JTextArea searchResult;
    private JTextField studentField;
    public JPanel rootPanel;
    private JButton sortGPA;

    public LabClassUI() {
        labClass = new LabClass();
        findButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    searchResult.setText(labClass.find(studentField.getText()));
                }
                catch (StudentNotFoundException exception)
                {
                    searchResult.setText(exception.toString());
                }
            }
        });
        sortGPA.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchResult.setText(labClass.sort());
            }
        });
    }
}
