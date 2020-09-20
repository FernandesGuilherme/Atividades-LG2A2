package Semana10_Interface;

public class FuncionarioAutenticavel extends Funcionario {
    int senha;
    @Override
    public double getbonificacao() {
        return 0;
    }

    @Override
    public boolean autenticaSenha(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso permitido");
            return true;
        } else {
            throw new IllegalArgumentException("Acesso negado");
        }
    }
}

