package lw5.ex3;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageWindow extends JPanel {
    private JFrame frame;
    private Timer timer;
    private Image image;

    public ImageWindow() {
        frame = new JFrame("Coin");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.add(this);
        frame.setVisible(true);
        image = new ImageIcon("anim/coin0.png").getImage();
        count = 0;
        timer = new Timer();
        timer.schedule(animate, 1, 200);
    }

    private int count;
    TimerTask animate = new TimerTask() {
        @Override
        public void run() {
            switch (count) {
                case 0:
                    image = new ImageIcon("anim/coin0.png").getImage();
                    break;
                case 1:
                    image = new ImageIcon("anim/coin1.png").getImage();
                    break;
                case 2:
                    image = new ImageIcon("anim/coin2.png").getImage();
                    break;
                case 3:
                    image = new ImageIcon("anim/coin3.png").getImage();
                    break;
                case 4:
                    image = new ImageIcon("anim/coin4.png").getImage();
                    break;
                case 5:
                    image = new ImageIcon("anim/coin5.png").getImage();
                    break;
                case 6:
                    image = new ImageIcon("anim/coin6.png").getImage();
                    break;
                default:
                    break;
            }
            count++;
            if (count == 7) {
                count = 0;
            }
            repaint();
        }
    };

    @Override
    public void paint(Graphics canvas) {
        canvas.drawImage(image, 0, 0,  null);
    }
}
