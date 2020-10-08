package lw5.ex1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ShapesWindow extends JFrame {
    private Shape[] shapes;
    ShapesWindow()
    {
        this.shapes = generateShapes(20);
        setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Shape sh : shapes)
                    sh.print(g);
            }
        };
        add(panel);
    }

    private Shape[] generateShapes(int nb)
    {
        Shape[] shapes = new Shape[nb];
        for (int i = 0; i < shapes.length; i++)
        {
            switch ((int)(Math.random() * 2))
            {
                case 0:
                    shapes[i] = new Circle((int)(Math.random() * 500), (int)(Math.random() * 500),
                            (int)(Math.random() * 100 + 10), randColor(), Math.random() < .5);
                    break;
                case 1:
                    shapes[i] = new Rectangle((int)(Math.random() * 500), (int)(Math.random() * 500),
                            (int)(Math.random() * 100 + 10), (int)(Math.random() * 100 + 10), randColor(), Math.random() < .5);
                    break;
                case 2:
                    shapes[i] = new Square((int)(Math.random() * 500), (int)(Math.random() * 500),
                            (int)(Math.random() * 100 + 10), randColor(), Math.random() < .5);
                    break;
            }
        }
        return shapes;
    }

    private Color randColor()
    {
        Random rand = new Random();
        return (new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
    }
}
