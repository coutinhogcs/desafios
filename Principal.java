import coutinho.guilherme.conta.Conta;

public class Principal {
    public static void main(String[] args) {
        Conta pessoa = new Conta();

        pessoa.titular = "Guilherme Coutinho";
        pessoa.setNumeroConta(pessoa.getNumeroConta());
        pessoa.setSaldo(pessoa.getSaldo());
        pessoa.exibeDados();

    }
}
