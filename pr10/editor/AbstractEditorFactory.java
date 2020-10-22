package pr10.editor;

public interface AbstractEditorFactory {
    IEditField createEditField();
    IDocument createDocument();
}
