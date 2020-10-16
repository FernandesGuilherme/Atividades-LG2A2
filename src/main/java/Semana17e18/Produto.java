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

    public Produto() {

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

    public void valorTotal() {
        total += getPrecoUnidade() * getQuantidade();
        System.out.println("VALOR TOTAL DO PEDIDO: " + total);

    }

    public double GerarIdProduto() {
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

}