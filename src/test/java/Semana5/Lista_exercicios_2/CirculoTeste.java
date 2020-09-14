package Semana5.Lista_exercicios_2;

// Implementar os métodos getters e setter nas classes Retangulo e Circulo


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {
    private Circulo c1;

    @BeforeEach
    public void beforeEach() {
        c1 = new Circulo();
        c1.setPi(3.14);
        c1.setRaio(10.0);
    }

    @AfterEach
    public void afterEach() {
        c1 = null;
    }


    @Test
    public void intancia(){
        assertNotNull(c1);
    }
    @Test
    public void atributos(){
        assertNotNull(c1.getPi());
        assertNotNull(c1.getRaio());
    }
    @Test
    public void metodoCalcularArea (){
        double valorEsperado = 314.0;
        double valorObtido = c1.calcularArea();
        assertEquals(valorEsperado, valorObtido);

    }
    @Test
    public void metodoCalcularPerimetro (){
        double valorEsperado = 62.800000000000004;
        double valorObtido = c1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);

    }
}
