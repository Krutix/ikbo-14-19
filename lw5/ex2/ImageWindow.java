package lw5.ex2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageWindow extends JFrame {
    private BufferedImage showImage;

    ImageWindow(String imageName) throws IOException {
        BufferedImage showImage = ImageIO.read(new File(imageName));
        setTitle(imageName);
        this.showImage = showImage;
        setSize(showImage.getWidth(null), showImage.getHeight(null));

        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(showImage, 0, 0, null);
            }
        };
        add(panel);
    }

}
