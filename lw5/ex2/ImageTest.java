package lw5.ex2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageTest {
    public static void main(String[] args) throws IOException {
        if (args.length < 1)
            return ;
        System.out.println(args[0]);
        ImageWindow fr = new ImageWindow(args[0]);
        fr.setVisible(true);
    }
}
