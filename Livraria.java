import coutinho.guilherme.conta.Livro;

public class Livraria {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setAutor("Rick Riordan");
        livro.setTitulo("Percy Jackson e o Ladrão de Raios.");

        livro.exibirDetalhe();
    }
}
