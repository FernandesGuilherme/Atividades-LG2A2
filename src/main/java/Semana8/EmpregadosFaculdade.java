package Semana8;

public class EmpregadosFaculdade {
    private String nome;
    private double salario;
    public double getgastos(){
        return this.salario;
    }
    public String getinfo (){
        return this.nome + " " + this.salario;
    }

        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
