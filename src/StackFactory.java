class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public Stack<E> getStack(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("AL"))
      return new StackArrayList<E>(); //regresa ArrayList
	else if(entry.equals("VE"))
      return new StackVector<E>(); //regresa Vector
    else if(entry.equals("DL"))
        return new StackDoubly<E>();
	else {
	    return new StackVector<E>();
    }
   }
}
