package br.org.catolicasc.aula09.questao5;

public class CamaroteSuperior extends VIP{

    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
    }

    public double imprimirValor(){
        return super.imprimirValor() + this.valorAdicional;
    }
    
}
