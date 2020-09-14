//Ultima Atualização dia 22 de Agosto ás 04:12 AM
import Semana5.Lista_exercicios_1.Retangulo;
import Semana5.Lista_exercicios_1.Circulo;
import Semana8.Funcionario;
import Semana8.Gerente;

//Testes na main
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Guilherme"); // Metodo de Funcionario
        gerente.setSenha(123); // Metodo de Gerente
        gerente.autentica(123);


        Funcionario fun = new Funcionario();
        fun.setSalario(5000.0);
        gerente.setSalario(5000.0);


        System.out.println(fun.bonificacao());
        System.out.println(gerente.bonificacao());


    }
}