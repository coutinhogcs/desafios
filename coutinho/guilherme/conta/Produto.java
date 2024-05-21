package coutinho.guilherme.conta;

public class Produto {

    private String nome = "Celular";
    private double preco = 2000.00;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicaDesconto(double percentual){
        double desconto = preco * (percentual/100);
        preco -= desconto;
    }
}
