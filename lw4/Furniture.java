package lw4;

public class Furniture implements Nameble, Priceable{
    private String type;
    private String name;
    private String color;
    private int cost;

    public Furniture(String type, String name, String color, int cost) {
        this.type = type;
        this.name = name;
        this.color = color;
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

    public void setPrice(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int getPrice() {
        return cost;
    }
}
