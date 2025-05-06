package br.org.catolicasc.aula09.questao4;

public class ContaCorrente {

    protected double saldo;

    public void depositar(double quantia){
        this.saldo+=quantia;
    }

    public void sacar(double quantia){
        double taxaOperacao=quantia * 0.005;
        double totalSacado=quantia + taxaOperacao;

        this.saldo-=totalSacado;
    }

    public double getSaldo() {
        return saldo;
    }
}
