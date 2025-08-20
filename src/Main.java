public class Main {
    public static void main(String[] args) {
        //Criar objetos
        Produto fone = new Produto( "Fone", "10,00");

        Pedido pedido = new Pedido();
        pedido.adicionarProduto(fone);


        pedido.mostrarPedido();
    }
}