package Semana17e18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader palavra = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Informe o seu nome: ");
        String nome = palavra.readLine();

        System.out.println("Informe o seu CPF para validar pedido: ");
        String CPF = palavra.readLine();

        Cliente cliente = new Cliente(CPF,nome,"Rua 1");
        cliente.validaCPF(CPF);

        Produto produto = new Produto("X Salada", 10.0, 2);
        Pedido pedido = new Pedido();

        pedido.dadosPedido(cliente, produto);
        produto.valorTotal();



    }

}
