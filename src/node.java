public class node<E>
{
    protected E data; // value stored in this element
    protected node<E> nextElement; // ref to next

    public node(E v, node<E> next)
    // pre: v is a value, next is a reference to
    //      remainder of list
    // post: an element is constructed as the new
    //      head of list
    {
        data = v;
        nextElement = next;
    }

    public node(E v)
    // post: constructs a new tail of a list with value v
    {
        this(v,null);
    }

    public node<E> next()
    // post: returns reference to next value in list
    {
        return nextElement;
    }

    public void setNext(node<E> next)
    // post: sets reference to new next value
    {
        nextElement = next;
    }

    public E value()
    // post: returns value associated with this element
    {
        return data;
    }

    public void setValue(E value)
    // post: sets value associated with this element
    {
        data = value;
    }
}