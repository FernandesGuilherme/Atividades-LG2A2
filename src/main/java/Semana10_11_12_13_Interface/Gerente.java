package Semana10_11_12_13_Interface;

public class Gerente extends Funcionario implements Autenticavel {
    private int senha = 4445;

    //Método abstrato obrigado a ser escrito na classe filha
    public double getbonificacao() {
        return  (this.salario * 1.4) + 1000;
    }
    private void setSenha (int senha){
        this.senha = senha;
    }

    public int getSenha (){
        return this.senha ;
    }

    @Override
    public boolean autenticaSenha(int senha) {
        if (this.senha == senha){
            System.out.println("Acesso permitido");
            return true;
        }else
            throw new IllegalArgumentException("Acesso negado");
    }

    //Sobrescrita do método bonificação
    @Override
    public double bonificacao() {
        return super.bonificacao() - 10;
    }


    //Metodo implementado criado na interface,
    @Override
    public boolean autentica(int senha) {
        if (this.senha != senha){
            return false;
        }
        return true;
    }
}
