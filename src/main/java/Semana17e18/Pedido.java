package Semana17e18;

public class Pedido {
    private Cliente cliente;
    private Produto produto;

///ARUMAR REDUMO DO PEDIDO
    public void dadosPedido(){
        System.out.println(cliente.getCPF() + cliente.getNome());
    }
}
