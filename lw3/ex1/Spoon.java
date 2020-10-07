package lw3.ex1;

public class Spoon extends Dish{
    private int size;

    public Spoon(int size, String name, boolean isClean, boolean isBroke) {
        super(name, isClean, isBroke);
        setSize(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size < 1)
            this.size = 1;
        else
            this.size = size;
    }

    @Override
    public String toString() {
        return "Spoon{" + super.toString() +
                "size=" + size +
                '}';
    }
}
