package pr10.editor;

public interface IDocument {
    boolean open(String path);
    boolean create();
    boolean save();
    boolean saveAs(String path);
    boolean close();
    Object getData();
    void setData(Object data);
}
