package Semana9_MetodosAbstrados;

public class ControleBonificacao {
    private double totalDeBonificacoes = 0;

//Metodo para registrar um Gerente (passando por parametro)
    public void registraGerente (Gerente g) {
        System.out.println("Adicionando bonificação do funcionario:  ");
        this.totalDeBonificacoes += g.getbonificacao();
    }

    public double getTotalDeBonificacoes (){
        return  this.totalDeBonificacoes;
    }
    public  double salarioFInal (Gerente g){
        return this.totalDeBonificacoes +=g.getSalario();
    }
}
