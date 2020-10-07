package lw2.ex2;

public class Leg {
    private int length;
    private boolean isWasShot;
    private String color;

    public Leg(Leg anotherLeg) {
        setLength(anotherLeg.length);
        this.color = anotherLeg.color;
        this.isWasShot = anotherLeg.isWasShot;
    }

    public Leg(int length, String color, boolean isShot) {
        setLength(length);
        this.color = color;
        this.isWasShot = isShot;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWasShot() {
        return isWasShot;
    }

    public void setWasShot(boolean shot) {
        isWasShot = shot;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 0)
            this.length = 0;
        else
            this.length = length;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "length=" + length +
                ", isShot=" + isWasShot +
                ", color='" + color + '\'' +
                '}';
    }
}
