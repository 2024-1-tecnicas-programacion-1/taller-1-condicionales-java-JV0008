package test;

import ejercicios.Ordenamiento;
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
public class OrdenamientoTest {
    @Test
    public void testNo() {
        String valorEsperado = "0 1 6 7";
        String valorActual = Ordenamiento.evaluar(7, 0, 6, 1);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testNo2() {
        String valorEsperado = "-6 -1 9 20";
        String valorActual = Ordenamiento.evaluar(9, 20, -6, -1);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testNo3() {
        String valorEsperado = "20 30 40 100";
        String valorActual = Ordenamiento.evaluar(100, 20, 30, 40);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testNo4() {
        String valorEsperado = "-30 10 65 73";
        String valorActual = Ordenamiento.evaluar(10, -30, 65, 73);
        assertEquals(valorEsperado, valorActual);
    }
    

    
}
