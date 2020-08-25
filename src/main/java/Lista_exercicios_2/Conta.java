package Lista_exercicios_2;

public class Conta {
    private int numero;
    private double saldo;
    private double limite;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor) {
        saldo = saldo + valor;
    }

    public void sacar(Double valor) {
        saldo =- valor;
    }

    public void transferir(Conta conta, Double valor) {
        saldo = saldo - valor;
        conta.saldo = conta.saldo + valor;
    }

    public void metodoTransferirValorInvalido(double valor) {
        if ((valor <= 0) || (valor > 2000.0)) {
            System.out.println("Valor inválido para transferencia");
        }
    }

    public void sacarSaldoInsuficiente (double valor){
        if (saldo < valor ) {
            System.out.println("Valor de saque maior que o saldo, MELOU");
        }
    }

    public void depositarValorInvalido (double valor){
        if (valor <= 0){
            System.out.println("Valor invaçido ára depositp");
        }
    }
}
