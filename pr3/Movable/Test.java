package pr3.Movable;

public class Test {
    public static void main(String[] args){
        IMovable m1 = new MovableCircle(1, 2, 3 ,1,2);
        IMovable m2 = new MovableRectangle(1, 1, 2, 2, 1, 1);
        m1.moveDown();
        m2.moveUp();
        System.out.println(m1);
        System.out.println(m2);
    }
}