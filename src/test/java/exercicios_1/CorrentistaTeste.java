package exercicios_1;

//TESTES AUTOMATIZADOS
import exercicios_1.Correntista;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class CorrentistaTeste {

    @Test
    public void instanciaCorrentista (){
        Correntista c1 = new Correntista();
        assertNotNull(c1);

    }
    @Test
    public void atributos() {
        Correntista c1 = new Correntista();
        c1.codigo = 1;
        c1.nome = "Guilherme";
        c1.telefone = "950898021";
        c1.email = "fernandes.lima@aluno.ifsp.edu.br";


        assertNotNull(c1.codigo);
        assertNotNull(c1.nome);
        assertNotNull(c1.telefone);
        assertNotNull(c1.email);

    }
    @Test
    public void metodoPegarDadosCorrentista (){
        Correntista c1 = new Correntista();
        c1.codigo = 1;
        c1.nome = "Guilherme";
        c1.telefone = "950898021";
        c1.email = "fernandes.lima@aluno.ifsp.edu.br";

        String valorEsperado = (1 + " - " + "Guilherme" + " - " + "fernandes.lima@aluno.ifsp.edu.br" + " - " + "950898021");
        String valorObtido = c1.pegarDados();

        assertEquals(valorEsperado, valorObtido);

    }

}
