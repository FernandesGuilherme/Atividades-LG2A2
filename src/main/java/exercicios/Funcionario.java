package exercicios;

//Atributos
public class Funcionario {
    public String nome;
    public String email;
    public int idade;
    public double salario;


    public String obterDados(){
        return nome + ", " + idade + "anos" + "(" + email + ")";
    }
    public double promover (double porcentagemAuneto){
        return salario * porcentagemAuneto;
    }
}
