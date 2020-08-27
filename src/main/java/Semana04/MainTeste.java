package Semana04;

import Semana04.Lista_exercicios_2.Conta;

public class MainTeste {
    public static void main(String[] args) {
        Conta c1 = new Conta(2115);
        Conta c2 = new Conta(2000);


        System.out.println("Número da conta" + c1.getNumero());


        c1.depositar(1115,c1);
        System.out.println("Saldo depositado"+ c1.getSaldo());


        c1.transferir(c2,115.0);
        System.out.println("Saldo da conta após receber transferencoa" + c2.getSaldo());
        System.out.println("Saldo após realizar transferencia" + c1.getSaldo());

        c2.sacar(115.0);

        System.out.println("Saldo apos sacar"+ c2.getSaldo());
//Consetar metodo sacar;




    }

}
