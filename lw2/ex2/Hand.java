package lw2.ex2;

public class Hand {
    private int length;
    private boolean isWasShot;
    private String color;

    public Hand(Hand anotherHand) {
        setLength(anotherHand.length);
        this.isWasShot = anotherHand.isWasShot;
        this.color = anotherHand.color;
    }

    public Hand(int length, boolean isWasShot, String color) {
        setLength(length);
        this.isWasShot = isWasShot;
        this.color = color;
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

    public void setWasShot(boolean wasShot) {
        isWasShot = wasShot;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "length=" + length +
                ", isWasShot=" + isWasShot +
                ", color='" + color + '\'' +
                '}';
    }
}
