package lw5.ex2;

import java.io.File;
import java.io.IOException;

public class ImageTest {
    public static void main(String[] args) throws IOException {
        if (args.length < 1)
            return ;
        File f = new File(args[0]);
        if(!f.exists() || f.isDirectory())
            return ;
        System.out.println(args[0]);
        ImageWindow fr = new ImageWindow(args[0]);
        fr.setVisible(true);
    }
}
