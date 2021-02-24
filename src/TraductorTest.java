import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraductorTest {

    Traductor trad = new Traductor<String>("DL");

    @Test
    void infixToPostfix() {

        System.out.println(trad.infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
        assertEquals("abcd^e-fgh*+^*+i-",trad.infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
    }
}