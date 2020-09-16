package Semana9;

// Atividade Atividade da Apostila Capitulo 10 Classes abstradas .
public  abstract class Funcionario {
    private  String nome;

    protected double salario;
    public abstract double getbonificacao(); //Metodo abstrato, sempre que usar em uma classe mão, as filhas são obrigado a te-lo;

    public double getBonificacao() {
        return this.salario * 1.2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    //Metodo bonificação para Funcinario, sofre sobrescrita em Gerente
    public double bonificacao() {
        return this.salario * 0.10;
    }
}


