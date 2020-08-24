package exercicios_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import exercicios_1.Funcionario;
import org.junit.jupiter.api.Test;

public class FuncionarioTeste {

    @Test
    public void intancia (){
        Funcionario f1 = new Funcionario();
        assertNotNull(f1);
    }

    @Test
    public void atributos (){
        Funcionario f1 = new Funcionario();
        f1.email = "joao@email.com";
        f1.idade = 20;
        f1.nome = "Joao";
        f1.salario = 3000.0;

        assertNotNull(f1.email);
        assertNotNull(f1.idade);
        assertNotNull(f1.nome);
        assertNotNull(f1.salario);
    }
    @Test
    public void metodoObterDados(){
        Funcionario f1 = new Funcionario();
        f1.email = "joao@email.com";
        f1.idade = 20;
        f1.nome = "Joao";

        String valorEsperado = f1.nome+ ", " + f1.idade + "anos" + "(" + f1.email + ")";
        String valorObtido = f1.obterDados();
        assertEquals(valorEsperado, valorObtido);


    }
    @Test
    public void metodoPromover (){
        Funcionario f1 = new Funcionario();
        f1.salario = 3000.0;


        //Valor não está arredondado, se arredondas para duas casas dpois da virgula, o teste aponta erro
        double valorEsperado = 3300.0000000000005;
        double valoObtido = f1.promover(1.10);

        assertEquals(valoObtido,valorEsperado);


    }
}
