package lw5.ex1;

import java.awt.*;

public class Rectangle extends Shape {
    protected int width = 0;
    protected int length = 0;

    @Override
    public void print(Graphics g) {
        g.setColor(color);
        g.drawRect(x, y, (int)width, (int)length);
        if (isFilled())
            g.fillRect(x, y, width, length);
    }

    Rectangle(int x, int y, int width, int length, Color color, boolean filled){
        super(x, y, color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
