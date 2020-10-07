package pr1;

public class Ball {
    private double radius = 1.;
    private String color = "White";
    private float bounce = .5f;

    Ball(){}

    Ball(double newRadius){
        radius = newRadius;
    }

    Ball(double newRadius, String newColor){
        radius = newRadius;
        color = newColor;
    }

    Ball(double newRadius, String newColor, float newBounce){
        radius = newRadius;
        color = newColor;
        bounce = newBounce;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setBounce(float bounce) {
        this.bounce = bounce;
    }

    public float getBounce() {
        return bounce;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", bounce=" + bounce +
                '}';
    }
}
