package Semana04.Lista_exercicios_2;
// Implementar os métodos getters e setter na classe Correntista


import Semana04.Lista_exercicios_2.Correntista;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {
    private Correntista c1;

    @BeforeEach
    public void beforeEach (){
        c1 = new Correntista();
        c1.setCodigo(1);
        c1.setEmail("fernandes.lima@aluno.ifsp.edu.br");
        c1.setNome("Guilherme");
        c1.setTelefone("950895021");
    }
    @AfterEach
    public void afterEach (){
        c1 = null;
    }


    @Test
    public void instanciaCorrentista (){
        assertNotNull(c1);

    }
    @Test
    public void atributos() {
        assertNotNull (c1.getCodigo());
        assertNotNull (c1.getNome());
        assertNotNull (c1.getTelefone());
        assertNotNull (c1.getEmail());

    }
    @Test
    public void metodoPegarDadosCorrentista (){
        String valorEsperado = (1 + " - " + "Guilherme" + " - " + "fernandes.lima@aluno.ifsp.edu.br" + " - " + "950898021");
        String valorObtido = c1.pegarDados();

        assertEquals(valorEsperado, valorObtido);

    }
}
