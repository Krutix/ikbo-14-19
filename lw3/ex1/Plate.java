package lw3.ex1;

public class Plate extends Dish{
    private int radius;

    public Plate(int radius, String name, boolean isClean, boolean isBroke) {
        super(name, isClean, isBroke);
    }

    @Override
    public boolean repair() {
        if (Math.random() < 0.001) {
            System.out.println("YOU DIED!");
            return false;
        }
        return super.repair();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 1)
            this.radius = 1;
        else
            this.radius = radius;
    }

    @Override
    public String toString() {
        return "Plate{" + super.toString() +
                "radius=" + radius +
                '}';
    }
}
