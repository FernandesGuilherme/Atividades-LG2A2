package Semana17e18;

public class Cliente {
    private int idCliente;
    private String CPF;
    private String nome;
    private String endereco;

    public Cliente(String CPF, String nome, String endereco) {
        this.CPF = CPF;
        this.nome = nome;
        this.endereco = endereco;
    }
    public Cliente (){

    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void validaCPF (String cpf){
        if (cpf.length() != 11){
            throw  new IllegalArgumentException("CPF inválido");
        }else{
            System.out.println("Cliente válido\n\n");
        }
    }
    public double GerarIDCliente (){
        double valorAleatorio, id = Math.random() * 1000;
        valorAleatorio = Math.round(id);
        return valorAleatorio;
    }

}
