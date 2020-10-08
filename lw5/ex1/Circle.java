package lw5.ex1;

import java.awt.*;

public class Circle extends Shape {
    protected int radius = 0;

    @Override
    public void print(Graphics g) {
        g.setColor(color);
        g.drawOval(x - (int)radius, y - (int)radius, (int)radius * 2, (int)radius * 2);
        if (isFilled())
            g.fillOval(x - (int)radius, y - (int)radius, (int)radius * 2, (int)radius * 2);
    }

    Circle(int x, int y, int radius, Color color, boolean filled){
        super(x, y, color, filled);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
