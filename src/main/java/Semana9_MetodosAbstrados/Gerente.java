package Semana9_MetodosAbstrados;

public class Gerente extends Funcionario {
    private int senha;

    //Método abstrato obrigado a ser escrito na classe filha
    public double getbonificacao() {
        return  (this.salario * 1.4) + 1000;
    }

    public void setSenha (int senha){
        this.senha = senha;
    }

    //Sobrescrita do método bonificação
    @Override
    public double bonificacao() {
        return super.bonificacao() - 10;
    }

    public int getSenha (){
        return this.senha ;
    }

    public boolean autenticaSenha (int senha){
        if (this.senha == senha){
            System.out.println("Acesso permitido");
            return true;
        }else
            throw new IllegalArgumentException("Acesso negado");
    }
}
