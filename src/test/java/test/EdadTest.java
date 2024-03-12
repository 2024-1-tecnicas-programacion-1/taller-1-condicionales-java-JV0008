package test;

import ejercicios.Edad;
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
public class EdadTest {
    @Test
    public void test2000Enero1() {
        String valorEsperado = "Ingrese datos coherentes"; //Esto no es "Usted tiene 24 años", solo pido que los ejercicios sean más claros porfa 
        String valorActual = Edad.evaluar(1, 1, 2024); // Esto era 1, 1, 2024
        assertEquals(valorEsperado, valorActual);
    }
    @Test
        public void test2020Marzo9() {
        String valorEsperado = "Usted tiene 4 años";    
        String valorActual = Edad.evaluar(9, 3, 2020);
        assertEquals(valorEsperado, valorActual);
 
}
    @Test
        public void test1948Junio14() {
        String valorEsperado = "Usted tiene 74 años";    
        String valorActual = Edad.evaluar(14, 6, 1948);
        assertEquals(valorEsperado, valorActual);
 
}
    @Test
        public void test2004Marzo28() {
        String valorEsperado = "Usted tiene 19 años";    
        String valorActual = Edad.evaluar(28, 3, 2004);
        assertEquals(valorEsperado, valorActual);
 
}
}