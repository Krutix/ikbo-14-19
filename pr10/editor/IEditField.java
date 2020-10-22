package pr10.editor;

import javax.swing.*;

public interface IEditField {
    void setDocument(IDocument document);
    void fieldToDocument();
    void documentToField();
    JPanel getEditField();
    IDocument getDocument();
}
