package Semana17e18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainteste {
    public static void main(String[] args) throws IOException {
        BufferedReader palavra = new BufferedReader (new InputStreamReader(System.in));

        /*
        System.out.println("Informe o seu nome: ");
        String nome = palavra.readLine();

        System.out.println("Informe o seu CPF: ");
        String CPF = palavra.readLine();

        Cliente cliente = new Cliente(CPF,nome);
        cliente.validaCPF(CPF);
*/
        Produto produto = new Produto();
        ListaDeProdutos lista = new ListaDeProdutos();
        produto.listaProduto();
        produto.valorTotal();
    }
}
