package br.org.catolicasc.banco;

public class ControleBonificacao {
    
    private double totalBonificacoes;

    public void registra(Funcionario funcionario){
        this.totalBonificacoes += funcionario.getBonificacao();
    }

    public double getBonificacao(){
        return this.totalBonificacoes;
    }
}
