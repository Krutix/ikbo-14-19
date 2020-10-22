package pr10.ChairFactory;

public class Client {
    private Chair chair;

    public void sit() {
        System.out.println("sit");
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
