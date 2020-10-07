package lw3.ex3;

public abstract class Furniture {
    private String type;
    private String name;
    private String color;
    private float height;
    private float width;
    private float length;
    private int cost;

    public Furniture(String type, String name, String color, float height, float width, float length, int cost) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;
        this.cost = cost;
    }

    public void buy()
    {
        System.out.println("You buy " + type + " " + name + " " + color + " for " + cost);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", cost=" + cost +
                '}';
    }
}
