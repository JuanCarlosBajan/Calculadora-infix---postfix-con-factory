public class Stacklist<E> implements Stack<E>{

    SinglyLinkedList<E> stack;

    public Stacklist(){
        stack = new SinglyLinkedList<>();
    }

    public void push(E item) {//Agregar al final
        stack.addLast(item);

    }

 
    public E pop() {//Extrae el ultimo elemento de la lista
        return stack.getRemoveLast();
    }


    public E peek() {
    return stack.getLast();

    }

    
    public int size() {//Tamano
        return stack.size();
    }

    @Override
    public boolean empty() {
        if(stack.size()==0){
            return true;
        }
        else return false;
    }

}