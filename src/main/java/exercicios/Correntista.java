package exercicios;

public class Correntista {
    public int codigo;
    public String nome;
    public String email;
    public String telefone;

    //metodos

    public String pegarDados (){
        return codigo + " - " + nome + " - " + email + " - " + telefone;
    }

}
