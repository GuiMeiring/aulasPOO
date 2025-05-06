package br.org.catolicasc.aula09.questao5;

public class VIP extends Ingresso{

    protected double valorAdicional;


    public VIP(double valor) {
        super(valor);
    }

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional=valorAdicional;
    }
}
