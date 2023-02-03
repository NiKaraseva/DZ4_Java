import java.util.LinkedList;

public class MyQueue {
    private LinkedList<Object> linkedList;

    MyQueue() {
        linkedList = new LinkedList<>();
    }

    boolean empty() {
        return linkedList.isEmpty();
    }

    void enqueue(Object element) {
        linkedList.addLast(element);
    }

    Object dequeue() {
        if (!empty()) {
            Object firstElement = linkedList.getFirst();
            return linkedList.remove(firstElement);
        }
        return null;
    }

    Object first() {
        if (!empty()) {
            return linkedList.getFirst();
        }
        return null;
    }


    public String toString() {
        return linkedList.toString();
    }

}
