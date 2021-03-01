import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraJuanBajanTest {
    Traductor<String> traductor = new Traductor<String>("DL");
    StackFactory factory = new StackFactory<String>();
    @Test
    void calculo() {
        String traduccion = traductor.infixToPostfix("5+(8-6)*5");
        Singleton.setType(factory.getStack("DL"));
        assertEquals( "15", Singleton.getInstance().s.Calculo(traduccion) );
    }
}