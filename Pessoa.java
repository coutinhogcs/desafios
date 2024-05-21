import pessoa.idade.idadepessoa.IdadePessoa;

public class Pessoa {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Gabriela");
        pessoa1.setIdade(24);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Guilherme");
        pessoa2.setIdade(26);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificarIdade();
    }
}