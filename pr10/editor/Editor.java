package pr10.editor;

import pr10.editor.text.TextEditorFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editor {
    private static JFrame fr;

    public static void main(String[] args) {
        AbstractEditorFactory factory = new TextEditorFactory();
        fr = new JFrame("Editor");
        fr.setSize(500, 300);

        IEditField editField = factory.createEditField();
        IDocument document = factory.createDocument();
        fr.setContentPane(editField.getEditField());

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createMenuFile(document, editField));
        fr.setJMenuBar(menuBar);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    private static JMenu createMenuFile(IDocument document, IEditField editField){
        JMenu file = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem create = new JMenuItem("Create");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem saveAs = new JMenuItem("Save as");
        JMenuItem exit = new JMenuItem("Exit");

        file.add(open);
        file.add(create);
        file.addSeparator();
        file.add(save);
        file.add(saveAs);
        file.addSeparator();
        file.add(exit);

        open.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Open file");
                int result = fileChooser.showOpenDialog(fr);
                if (result == JFileChooser.APPROVE_OPTION)
                    if (document.open(fileChooser.getSelectedFile().getPath())) {
                        editField.setDocument(document);
                    }
            }
        });
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (document.create())
                    editField.setDocument(document);
            }
        });
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editField.fieldToDocument();
                document.save();
            }
        });
        saveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Save file as");
                int result = fileChooser.showSaveDialog(fr);
                if (result == JFileChooser.APPROVE_OPTION) {
                    editField.fieldToDocument();
                    document.saveAs(fileChooser.getSelectedFile().getPath());
                }
            }
        });
        return file;
    }
}
