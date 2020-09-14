package Semana5.Lista_exercicios_2;
// Implementar os métodos getters e setter nas classes Retangulo e Circulo


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RetanguloTeste {
        private Retangulo r1;

    @BeforeEach
    public void beforeEach (){
        r1 = new Retangulo();
        r1.setBase(5.0);
        r1.setAltura(5.0);
    }
    @AfterEach
    public void afterEach (){
        r1 = null;
    }

    @Test
    public void intanciaRetangulo(){
        assertNotNull(r1);
    }
    @Test
    public void atributo (){
        assertNotNull(r1.getAltura());
        assertNotNull(r1.getBase());
    }
    @Test
    public void metodoCalcularArea(){
        Double valorEsperado = 25.0;
        Double valorObtido = r1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }
    @Test
    public void metodoCalcularPeriodo (){
        Double valorEsperado = 20.0;
        Double valorObtido = r1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}
