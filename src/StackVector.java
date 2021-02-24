/**Universidad del Valle de Guatemala
 Fecha: 02/02/2021
 Nombre:
 Juan Carlos Bajan: 20109
 Clase StackVector
 */
import java.util.Vector;


/**
 * Aqui se define que se realiza en cada funcion definida por la interfaz STACK,
 * Con Generics, se recibe un objeto de tipo E. Es importante mencionar que en la
 * funcion pop, si se encuentra que el vector esta vacio, devuelve null.
 * */
public class StackVector<E> implements Stack<E>{

    private Vector<E> vec;

    public  StackVector(){
        vec = new Vector<E>();
    }

    public void push(E item){
        vec.add(item);
    }
    public E pop(){
        if(vec.isEmpty()){
            return null;
        } else {
        return vec.remove(size()-1);
        }
    }
    public boolean empty(){
        return size() == 0;
    }
    public E peek(){
        return vec.get(size() - 1);
    }
    public int size(){
        return vec.size();
    }

}
