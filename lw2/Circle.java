public class Circle
{
    private int centreX, centreY;
    private int radius;
    private String color;

    Circle(int centreX, int centreY, int radius, String color)
    {
        this.centreX = centreX;
        this.centreY = centreY;
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCentre(int centreX, int centreY) {
        this.centreX = centreX;
        this.centreY = centreY;
    }

    public int getCentreX() {
        return centreX;
    }

    public int getCentreY() {
        return centreY;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centreX=" + centreX +
                ", centreY=" + centreY +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}