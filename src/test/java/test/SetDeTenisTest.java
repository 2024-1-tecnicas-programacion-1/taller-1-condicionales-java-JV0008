package test;

import ejercicios.SetDeTenis;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenisTest {
    @Test
    public void testAunNoTermina() {
        String valorEsperado = "Aún no termina";
        String valorActual = SetDeTenis.evaluar(4, 5);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test2() {
        String valorEsperado = "Inválido";
        String valorActual = SetDeTenis.evaluar(3, 7);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test3() {
        String valorEsperado = "Ganó A";
        String valorActual = SetDeTenis.evaluar(7, 6);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test4() {
        String valorEsperado = "Aún no termina";
        String valorActual = SetDeTenis.evaluar(5, 6);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test5() {
        String valorEsperado = "Ganó B";
        String valorActual = SetDeTenis.evaluar(5, 7);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test6() {
        String valorEsperado = "Inválido";
        String valorActual = SetDeTenis.evaluar(8, 6);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test7() {
        String valorEsperado = "Ganó A";
        String valorActual = SetDeTenis.evaluar(6, 4);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test8() {
        String valorEsperado = "Aún no termina";
        String valorActual = SetDeTenis.evaluar(2, 5);
        assertEquals(valorEsperado, valorActual);
    }
    
}
