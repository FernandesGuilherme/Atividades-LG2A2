package Semana17e18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ListaDeProdutos {
    private Produto produto;
    double preco;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void listaProduto () throws IOException {

        Scanner entrada = new Scanner(System.in);
        int quantidade;
        System.out.println("1 X Salada ");
        System.out.println("2 X Burguer  ");
        System.out.println("3 Coca cola ");
        System.out.println("0 - Finalizar");
        System.out.println("Escolha: ");
        int escolha = entrada.nextInt();

        do {
            switch (escolha) {
                case 1:
                    produto.setPrecoUnidade(10.0);
                    System.out.println("Quantidade: ");
                    quantidade = entrada.nextInt();
                    produto.setQuantidade(quantidade);
                    listaProduto();
                    break;
                case 2:
                    produto.setPrecoUnidade(10.0);
                    System.out.println("Quantidade: ");
                    quantidade = entrada.nextInt();
                    produto.setQuantidade(quantidade);
                    listaProduto();
                    break;
                case 3:
                    produto.setPrecoUnidade(5.0);
                    System.out.println("Quantidade: ");
                    quantidade = entrada.nextInt();
                    produto.setQuantidade(quantidade);
                    listaProduto();
                    break;
            }
        } while (escolha != 0);
       System.exit(0);
    }


}
