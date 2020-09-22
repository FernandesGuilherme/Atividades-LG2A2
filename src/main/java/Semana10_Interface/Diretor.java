package Semana10_Interface;

public class Diretor extends Funcionario implements Autenticavel {
int senha = 3334;
    public int getSenha() {
        return senha;
    }

    private void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public double getbonificacao() {
        return (this.salario * 2) + 10;
    }

    @Override
    public boolean autenticaSenha(int senha) {
        if ( this.senha == senha){
            System.out.println("Acesso permitido");
            return true;
        }else
            throw new IllegalArgumentException("Acesso negado");
    }

    //implementando imterface
    @Override
    public boolean autentica(int senha) {
        if (this.senha != senha){
            return false;
        }
        return true;
    }
}
