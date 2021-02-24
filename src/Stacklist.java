public class Stacklist<E> implements Stack<E>{
    int count; // list size
    Node<E> head; // ref. to first element
    public Stacklist(){
        head=null;
        count=0;
    }

    public void push(E item) {//Agregar al final
        Node<E> temp = new Node<E>(item, null);
      if (head != null) {
         Node<E> finger = head;
         while (finger.next() != null) {
            finger = finger.next();
         }

         finger.setNext(temp);
      } else
         head = temp;

      count++;

    }

 
    public E pop() {//Extrae el ultimo elemento de la lista
        Node<E> finger=head;
        Node<E> previous=null;
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


    public E peek() {
        Node<E> finger=head;
        while(finger.next() !=null){
            finger=finger.next();
        }
        return finger.value();
        
        
    }

    
    public int size() {//Tamano
        return count;
    }

    @Override
    public boolean empty() {
        if(count==0){
            return true;
        }
        else return false;
    }

}