package coutinho.guilherme.conta;

public class Conta {
    private int numeroConta = 129034;
    private double saldo = 8500.55;
    public String titular;


    public void exibeDados(){
        System.out.println("\n****** Dados Bancários ******");
        System.out.println("Número da conta: "+ numeroConta);
        System.out.println("Saldo: R$ "+ saldo);
        System.out.println("Nome de Titular da conta: "+ titular);
        System.out.println("***************************************");
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}

