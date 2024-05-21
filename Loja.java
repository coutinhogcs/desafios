import coutinho.guilherme.conta.Produto;

public class Loja {
    public static void main(String[] args) {
        Produto produto = new Produto();

        System.out.println("Nome do produto: "+ produto.getNome());
        System.out.println("Preço do produto: R$ "+ produto.getPreco());

        produto.aplicaDesconto(30);

        System.out.println("Novo valor com desconto: R$ " + produto.getPreco());


    }
}
