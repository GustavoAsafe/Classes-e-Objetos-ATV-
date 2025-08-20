public class Produto {
    public String name;
    public String preco;

    public Produto(String name, String preco) {
        this.name = name;
        this.preco = preco;
    }

        @Override
        public String toString() {
            return "PRODUTO { " + "Nome" + name + "/ Preço " + preco + "}";

    }
}
