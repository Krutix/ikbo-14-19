package pr10.editor.text;

import pr10.editor.IDocument;

import java.io.*;
import java.util.Scanner;

public class TextDocument implements IDocument {
    private String data;
    private String path;

    @Override
    public boolean open(String path) {
        this.path = path;
        try {
            FileReader reader = new FileReader(this.path);
            Scanner scanner = new Scanner(reader);
            StringBuilder stringBuilder = new StringBuilder();
            while (scanner.hasNextLine())
                stringBuilder.append(scanner.nextLine()).append('\n');
            data = stringBuilder.toString();
            reader.close();
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }

    @Override
    public boolean create() {
        try {
            FileWriter writer = new FileWriter(".tbh.txt");
            writer.close();
        }
        catch (Exception e) {
            return false;
        }
        return open(".tbh.txt");
    }

    @Override
    public boolean save() {
        return saveAs(this.path);
    }

    @Override
    public boolean saveAs(String path) {
        try {
          if (this.path.compareTo(".tbh.txt") == 0)
                this.path = path;
            FileWriter writer = new FileWriter(path);
            writer.write(data);
            System.out.println(data);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public Object getData() {
        return data;
    }

    @Override
    public void setData(Object data) {
        this.data = (String) data;
    }

    @Override
    public boolean close() {
        return true;
    }
}
