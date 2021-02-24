import static org.junit.jupiter.api.Assertions.*;

class CalculadoraJuanBajanTest {

    @org.junit.jupiter.api.Test
    void calculo() {
        CalculadoraGeneral c = new CalculadoraJuanBajan();
        assertEquals("10", c.Calculo("56+5*5+6/"));
        assertEquals("NO FUNCIONA CON ESTA OPERACION", c.Calculo("22+4/*"));
        assertEquals("9", c.Calculo("73-2*1+"));
    }
}