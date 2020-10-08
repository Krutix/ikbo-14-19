package lw5.ex1;

import java.awt.*;

public abstract class Shape {
    protected int x, y;
    protected Color color;
    protected boolean filled;

    Shape() {}

    Shape(int x , int y, Color color, boolean filled){
        this.x = x;
        this.y = y;
        this.color = color;
        this.filled = filled;
    }

    public abstract void print(Graphics g);

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
