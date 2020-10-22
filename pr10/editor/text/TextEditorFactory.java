package pr10.editor.text;

import pr10.editor.AbstractEditorFactory;
import pr10.editor.IDocument;
import pr10.editor.IEditField;

public class TextEditorFactory implements AbstractEditorFactory {
    @Override
    public IEditField createEditField() {
        return new TextEditField();
    }

    @Override
    public IDocument createDocument() {
        return new TextDocument();
    }
}
