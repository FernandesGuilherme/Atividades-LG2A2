package Lista_exercicios_1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {
    //Sempre que for automatizar os teste, chamar @Test que importará as bibliotecas Junit
    @Test
    public void instanciaCirculo (){
        Circulo c1 = new Circulo();
        assertNotNull(c1);
    }

    @Test
    public void verificarAtributos (){
        Circulo c1 = new Circulo();
        c1.pi = 3.14;
        c1.raio = 5.0;

        assertNotNull(c1.raio);
        assertNotNull(c1.pi);
    }
    @Test
    public void metodoCalcularArea(){
        Circulo c1 = new Circulo();
        c1.pi = 3.14;
        c1.raio = 5.0;

        Double valorEperado = 78.5;
        Double valorObtido = c1.calcularArea();
        assertEquals(valorEperado, valorObtido);
    }
    @Test
    public void metodoCalculaPerimetro (){
        Circulo c1 = new Circulo();
        c1.pi = 3.14;
        c1.raio = 5.0;

        Double valorEperado = 31.400000000000002;
        Double valorObtido = c1.calcularPerimetro();
        assertEquals(valorEperado, valorObtido);
    }
}
