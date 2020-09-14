package Semana8;
// Atividade Atividade da Apostila Capitulo 9.
public class Funcionario {
    protected String nome;
    protected String CPF;
    protected double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public double getSalario() {
        return salario;
    }
    //Metodo bonnificação para Funcinario, sofre sobrescrita em Gerente
    public double bonificacao (){
        return this.salario * 0.10;
    }
}
