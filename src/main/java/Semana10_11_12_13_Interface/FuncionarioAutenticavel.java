package Semana10_11_12_13_Interface;

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

