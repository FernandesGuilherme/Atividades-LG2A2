package Semana5.Lista_exercicios_2;

public class Correntista {
    private int codigo;
    private String nome;
    private String email;
    private String telefone;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String pegarDados (){
        return codigo + " - " + nome + " - " + email + " - " + telefone;
    }


}
