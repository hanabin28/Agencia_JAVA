package br.senai.sp.jandira.model;

public class Conta {
    boolean validaSaldo;
    private int numeroConta = 1234;
    private double saldo = 9652;
    private String agencia = "000-35-XX";

    public void realizarDeposito(Double valor){
        this.saldo += valor;
        System.out.println("O saldo da sua conta é: " + this.saldo);
        System.out.println();
    }

    public void realizarSaque(Double valor){
        if (validaSaldo) {
            this.saldo -= valor;
            System.out.println("Seu saldo é de:" + this.saldo);
        }else {
            System.out.println("não pode!!!");
        }
    }

    public void validarSaque(Double valor){
        if (valor>this.saldo){
            validaSaldo = false;
        }else {
            this.saldo -= valor;
            validaSaldo = true;
        }
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é: " + this.saldo);
        System.out.println();
    }
}
