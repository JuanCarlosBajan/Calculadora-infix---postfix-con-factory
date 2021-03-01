public class SinglyLinkedList<E> extends AbstractList<E>
{

protected int count; // list size
protected node<E> head; // ref. to first element

public SinglyLinkedList()
        // post: generates an empty list
        {
        head = null;
        count = 0;
        }

public int size()
        // post: returns number of elements in list
        {
        return count;
        }

public void addFirst(E value)
        // post: value is added to beginning of list
        {
        // note order that things happen:
        // head is parameter, then assigned
        head = new node<E>(value, head);
        count++;
        }

public E removeFirst()
        // pre: list is not empty
        // post: removes and returns value from beginning of list
        {
        node<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
        }

public E getFirst()
        // pre: list is not empty
        // post: returns first value in list
        {
        return head.value();
        }

public void addLast(E value)
        // post: adds value to end of list
        {
        // location for new value
        node<E> temp = new node<E>(value,null);
        if (head != null)
        {
        // pointer to possible tail
        node<E> finger = head;
        while (finger.next() != null)
        {
        finger = finger.next();
        }

        finger.setNext(temp);
        } else head = temp;

        count++;

        }
public E getRemoveLast(){
        node<E> finger=head;
        node<E> previous=null;
        while(finger.next() != null){
                previous =finger;
                finger =finger.next();
        }
        if(previous==null){
                head=null;
        }
        else{
                previous.setNext(null);
        }
        count--;
        return finger.value();
}

public E getLast(){
        node<E> finger=head;
        while(finger.next() !=null){
                finger=finger.next();
        }
        return finger.value();
}

public boolean contains(E value)
        // pre: value is not null
        // post: returns true iff value is found in list
{
    node<E> finger = head;

    while (finger != null &&
            !finger.value().equals(value)) {
        finger = finger.next();
    }
    return finger != null;
}
}