package Semana9;

public class Gerente extends Funcionario {
    private int senha;

    //Metodo abstrato obrigado a ser escrito

    @Override
    public double getbonificacao() {
        return  (this.salario * 1.4) + 1000;
    }

    public void setSenha (int senha){
        this.senha = senha;
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
