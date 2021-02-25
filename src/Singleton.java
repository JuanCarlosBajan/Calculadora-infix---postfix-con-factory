public class Singleton
{
    // static variable single_instance of type Singleton 
    private static Singleton single_instance = null;

    // variable of type String

    private static Stack<Integer> stack = null;

    public CalculadoraGeneral s;

    // private constructor restricted to this class itself 
    private Singleton()
    {
        s = new CalculadoraJuanBajan(stack);
    }

    // static method to create instance of Singleton class 
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }

    public static void setType(Stack st){ stack = st;}
} 