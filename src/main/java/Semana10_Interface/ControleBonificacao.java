package Semana10_Interface;

public class ControleBonificacao {
    private double totalDeBonificacoes = 0;

//Metodo para registrar um Gerente (passando por parametro)
    public void registra (Funcionario f) {
        System.out.println("Adicionando bonificação do funcionario:  ");
        this.totalDeBonificacoes += f.getbonificacao();
    }

    public double getTotalDeBonificacoes (){
        return  this.totalDeBonificacoes;
    }
    public  double salarioFInal (Funcionario f){
        return this.totalDeBonificacoes += f.getSalario();
    }
}
