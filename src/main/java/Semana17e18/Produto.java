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

    public void valorTotal (){
        total += getPrecoUnidade() * getQuantidade();
        System.out.println("VALOR TOTAL DO PEDIDO: "+ total);

    }
    public double GerarIdProduto(){
        double valorAleatorio, id = Math.random() * 1000;
        valorAleatorio = Math.round(id);
        return valorAleatorio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void listaProduto () throws IOException {

        Scanner entrada = new Scanner(System.in);
        int quantidade;
        System.out.println("1 - X Salada: 10,00 R$ ");
        System.out.println("2 - X Burguer: 10,00 R$ ");
        System.out.println("3 - Coca cola: 5,00 R$ ");
        System.out.println("4 - Finalizar");
        System.out.println("0 - Adicionar");
        System.out.printf("Ao escolher um produto, adicione e repita o processo para o próximo e digite 0\n");
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
                    int valorUnitario = 10;
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
                case 4:
                    valorTotal();
                        System.exit(0);
            }
        } while (escolha != 0);
        valorTotal();
    }


    }
//Terminar metodo de calculo