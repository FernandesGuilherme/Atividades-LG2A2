package Semana04.Lista_exercicios_1;
//TESTES AUTOMATIZADOS

import Semana04.Lista_exercicios_1.Retangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RetanguloTeste {


    @Test
    public void intanciaRetangulo(){
        Retangulo r1 = new Retangulo();
        assertNotNull(r1);
    }
    @Test
    public void atributo (){
        Retangulo r1 = new Retangulo();
        r1.altura = 10.0;
        r1.base = 5.0;

        assertNotNull(r1.altura);
        assertNotNull(r1.base);
    }
    @Test
    public void metodoCalcularArea(){
        Retangulo r1 = new Retangulo();
        r1.altura = 10.0;
        r1.base = 5.0;

        Double valorEsperado = 50.0;
        Double valorObtido = r1.CalcularArea();
        assertEquals(valorEsperado, valorObtido);
    }
    @Test
    public void metodoCalcularPeriodo (){
        Retangulo r1 = new Retangulo();
        r1.altura = 10.0;
        r1.base = 5.0;

        Double valorEsperado = 75.0;
        Double valorObtido = r1.CalcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }

}

