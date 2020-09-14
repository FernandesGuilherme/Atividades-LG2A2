package Semana8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class GerenteTeste {
    private  Gerente gerente;


    @BeforeEach
    public void BeforeEach (){
        gerente = new Gerente();
        gerente.setSenha(123);
       // gerente.setCPF("12312312312");
        gerente.setNome("Guilherme Fernandes Lima");
    }
 @AfterEach
 public void AfterEach(){
        gerente = null;
 }

    @Test
    public void intanciaGernete (){
        assertNotNull(gerente);
    }

    @Test
    public void VerificaAtributos (){
        assertNotNull(gerente.getNome());
        assertNotNull(gerente.getCPF());
        assertNotNull(gerente.getSalario());
        assertNotNull(gerente.getSenha());

    }
    @Test
    public void metodoAutentica (){
        int valorEsperado = 123;
        boolean valorObtido = gerente.autentica(valorEsperado);

        assertEquals(valorEsperado, valorObtido);
    }



}
