import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDeImpostoTest {

    @Test
    public void deveCalcularICMS(){
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        ICMS icms = new ICMS(100.0);
        assertEquals(10, calculadora.calcular(icms));
    }

    @Test
    public void deveCalcularIPI(){
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        IPI ipi = new IPI(100.0);
        assertEquals(20, calculadora.calcular(ipi));
    }

}