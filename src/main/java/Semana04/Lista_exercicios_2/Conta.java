package Semana04.Lista_exercicios_2;

public class Conta {
    private int numero;
    private double saldo = 0;
    private double limite;

    public  Conta (int numero, double saldo){
        this.setNumero(numero);
    }
    public  Conta (int numero){
        this.setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }
    private void setNumero(int numero) {
        if (numero <= 0){
            throw new IllegalArgumentException("Número de conta inxistente");
        }
            this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }


    public void depositar(double valor, Conta conta) {
        valorInvalido(valor);
      //  saldo = saldo + valor;
        conta.saldo = conta.saldo + valor;
    }
    public void sacar(double valor) {
        if ((valor < 0) || (valor < getSaldo())) {
    }
    saldo =- valor;
}

    public void transferir(Conta conta, Double valor) {
    if ((valor <= 0) || (conta == null)){
        throw new IllegalArgumentException("Algo deu erradp");
        }
        saldo = saldo - valor;
        conta.saldo = conta.saldo + valor;
    }

    public void valorInvalido (double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor inválido");
        }
    }
}
