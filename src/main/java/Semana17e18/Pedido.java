package Semana17e18;

public class Pedido  {

///ARUMAR RESUMO DO PEDIDO
double valorAleatorio;

    public void dadosPedido(Cliente cliente, Produto produto){
        double id = Math.random() * 1000;
        valorAleatorio = Math.round(id);
        int v = (int) valorAleatorio;

        String pedido = "Pedido:" + v + " "  +"\nCliente:" + cliente.getCPF() + "\nItens: " + produto.getNome() + ", " + produto.getQuantidade() + " Unidades";
        System.out.println(pedido);

    }
}
