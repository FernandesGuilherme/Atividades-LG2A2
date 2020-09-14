package Semana8;

public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public boolean autentica (int senha){
        if (this.senha == senha){
            System.out.println("Acesso permitido");
            return  true;
        }else{
            System.out.println("Acesso negado");
            return false;
        }
    }
    public void setSenha (int senha){
        this.senha = senha;
    }
}
