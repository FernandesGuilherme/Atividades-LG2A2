package Semana8;

public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public boolean autentica (int senha){
        if (this.senha == senha){
            System.out.println("Acesso permitido");
            return  true;
        }else{
            System.out.println();
            System.out.println("Acesso negado");
            return false;
        }
    }
    public void setSenha (int senha){
        this.senha = senha;
    }
    public int getSenha(){
        return senha;
    }

    //SObrescrita do metodo mudando sua ação para Gerentes
    @Override
    public double bonificacao() {
        return this.salario * 0.15;
    }
    /*
    magine que para calcular a bonificação de um Gerente devemos fazer igual ao	cálculo	 de	 um
	Funcionario	porém adicionando R$ 1000.Poderíamos fazer assim:

    @Override
    public double bonificacao() {
        return super.bonificacao() + 1000; // Chama o metodo de funcionario e faz o calculo de forma do gerente
    }
    */

}
