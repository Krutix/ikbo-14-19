package lw3.ex1;

public class Fork extends Dish {
    private int size;

    public Fork(int size, String name, boolean isClean, boolean isBroke) {
        super(name, isClean, isBroke);
        setSize(size);
    }

    @Override
    public boolean repair() {
        if (Math.random() < 0.01) {
            System.out.println("YOU DIED!");
            return false;
        }
        return super.repair();
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
        return "Fork{" + super.toString() +
                "size=" + size +
                '}';
    }
}
