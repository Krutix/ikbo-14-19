package lw2.ex2;

public class Human {
    private Hand leftHand, rightHand;
    private Leg leftLeg, rightLeg;
    private Head head;

    public Human(Hand leftHand, Leg leftLeg, Head head) {
        this.leftHand = leftHand;
        this.rightHand = new Hand(leftHand);
        this.leftLeg = leftLeg;
        this.rightLeg = new Leg(leftLeg);
        this.head = head;
    }

    public Human(Hand leftHand, Hand rightHand, Leg leftLeg, Leg rightLeg, Head head) {
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.head = head;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    @Override
    public String toString() {
        return "Human{" +
                "leftHand=" + leftHand.toString() +
                ", rightHand=" + rightHand.toString() +
                ", leftLeg=" + leftLeg.toString() +
                ", rightLeg=" + rightLeg.toString() +
                ", head=" + head.toString() +
                '}';
    }
}
