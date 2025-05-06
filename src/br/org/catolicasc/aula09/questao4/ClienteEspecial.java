package br.org.catolicasc.aula09.questao4;

public class ClienteEspecial extends ContaCorrente{

    @Override
    public void sacar(double quantia){
        double taxaOperacao=quantia * 0.001;
        double totalSacado=quantia + taxaOperacao;

        this.saldo-=totalSacado;
    }
}
