import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        produtos.add(produto);

    }

    public void mostrarPedido() {
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
