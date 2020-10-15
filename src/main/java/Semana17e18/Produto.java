package Semana17e18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Produto {
    private int idProduto;
    private String nome;
    private double unidade;
    private int quantidade;
    public ListaDeProdutos lista;
    public int total = 0, pre = 0;

    public Produto(String nome, double precoUnidade, int quantidade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.unidade = precoUnidade;
        this.quantidade = quantidade;
    }
    public Produto (){
        
    }

    public int getIdProduto() {
        return idProduto;
    }


    public double getPrecoUnidade() {
        return unidade;
    }

    public void setPrecoUnidade(double precoUnidade) {
        this.unidade = precoUnidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double valorTotal (){
        total += quantidade; pre += unidade;
        return total * pre;
    }

    public double GerarIdProduto(){
        double valorAleatorio, id = Math.random() * 1000;
        valorAleatorio = Math.round(id);
        return valorAleatorio;
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
                    setPrecoUnidade(10.0);
                    System.out.println("Quantidade: ");
                    quantidade = entrada.nextInt();
                    setQuantidade(quantidade);
                    listaProduto();
                    break;
                case 2:
                    setPrecoUnidade(10.0);
                    System.out.println("Quantidade: ");
                    quantidade = entrada.nextInt();
                    setQuantidade(quantidade);
                    listaProduto();
                    break;
                case 3:
                    setPrecoUnidade(5.0);
                    System.out.println("Quantidade: ");
                    quantidade = entrada.nextInt();
                    setQuantidade(quantidade);
                    listaProduto();
                    break;
            }
        } while (escolha != 0);
        total();
    }
        public void  total(){
            System.out.println("teste" + valorTotal());
        }

    }
