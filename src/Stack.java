/**Universidad del Valle de Guatemala
 Fecha: 02/02/2021
 Nombre:
 Juan Carlos Bajan: 20109
 Interfaz Stack
 */


/**
 *      Interfaz Stack
 *              De ella deriva StackVector. Contiene 5 variables esenciales las cuales son para
 *              agregar un valor al vector, extraer el ultimo valor del vector, verificar si
 *              el vector esta vacio, obtener el ultimo valor de la lista sin extraerlo y
 *              obtener el tamano del vector.
 *
 *              Con GENERICS, recibe un objeto tipo E.
 *
 * */
public interface Stack<E> {
        public void push(E value);
        public E pop();
        public boolean empty();
        public E peek();
        public int size();
}


