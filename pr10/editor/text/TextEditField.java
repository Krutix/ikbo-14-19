package pr10.editor.text;

import pr10.editor.IDocument;
import pr10.editor.IEditField;

import javax.swing.*;
import java.awt.*;

public class TextEditField implements IEditField {
    private JPanel rootPanel;
    private JTextArea textEditor;
    private IDocument document;

    TextEditField(){
        rootPanel = new JPanel(new BorderLayout());
        textEditor = new JTextArea();
        rootPanel.add(textEditor);
        textEditor.setEditable(false);
    }

    @Override
    public void setDocument(IDocument document) {
        this.document = document;
        documentToField();
        textEditor.setEditable(true);
    }

    @Override
    public IDocument getDocument() {
        return document;
    }

    @Override
    public void fieldToDocument() {
        document.setData(textEditor.getText());
    }

    @Override
    public void documentToField() {
        textEditor.setText((String) document.getData());
    }

    @Override
    public JPanel getEditField() {
        return rootPanel;
    }
}
