import java.util.Iterator;

public class StackDoubly<E> implements Stack {

    DoublyLinkedList<E> stack = new DoublyLinkedList<E>();

    @Override
    public void push(Object value) {

        if(stack.isEmpty()){
            stack.addFirst((E)value);
        } else {
            stack.addLast((E) value);
        }

    }

    @Override
    public Object pop() {
        E resp = stack.getLast();
        stack.removeLast();
        return  resp;
    }

    @Override
    public boolean empty() {
        return stack.isEmpty();
    }

    @Override
    public Object peek() {
        return stack.getLast();
    }

    @Override
    public int size() {
        return stack.size();
    }
}
