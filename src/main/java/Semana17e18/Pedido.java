package Semana17e18;

public class Pedido  {

///ARUMAR RESUMO DO PEDIDO
double valorAleatorio;

public double GerarIDCliente (){
    double id = Math.random() * 1000;
    valorAleatorio = Math.round(id);
    return valorAleatorio;
}
public void dadosPedido(Cliente cliente, Produto produto){
    double id = Math.random() * 1000;
    valorAleatorio = Math.round(id);
    int v = (int) valorAleatorio;

    String pedido = "Pedido: " + v + " "  +"\nCliente:" + cliente.getCPF();
    System.out.println(pedido);
    }
}
