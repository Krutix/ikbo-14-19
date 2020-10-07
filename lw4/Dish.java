package lw4;

public class Dish implements Priceable {
    private String type;
    private boolean isClean;
    private boolean isBroke;
    private int cost;

    public Dish(String type, boolean isClean, boolean isBroke, int cost) {
        this.type = type;
        this.isClean = isClean;
        this.isBroke = isBroke;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setName(String type) {
        this.type = type;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public boolean isBroke() {
        return isBroke;
    }

    public void setBroke(boolean broke) {
        isBroke = broke;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "type='" + type + '\'' +
                ", isClean=" + isClean +
                ", isBroke=" + isBroke +
                '}';
    }

    @Override
    public int getPrice() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
