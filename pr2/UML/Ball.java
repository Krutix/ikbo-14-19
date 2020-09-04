package UML;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double xDisc, double yDisc){
        this.x += xDisc;
        this.y += yDisc;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}