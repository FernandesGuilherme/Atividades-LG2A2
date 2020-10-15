package Semana17e18;

public class Pedido {
    private Cliente cliente;
    private Produto produto;


    public void dadosPedido(){
        System.out.println(cliente.GerarIDCliente() + cliente.getCPF() + cliente.getNome());
    }
}
