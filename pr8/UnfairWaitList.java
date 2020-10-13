package pr8;

public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList() {
        super();
    }

    public void remove(E elem) {
        waitList.remove(elem);
    }

    public void moveToBack(E elem) {
        waitList.remove(elem);
        waitList.offer(elem);
    }
}
