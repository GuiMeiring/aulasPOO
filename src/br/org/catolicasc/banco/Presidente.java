package br.org.catolicasc.banco;

public class Presidente extends Funcionario {

    @Override
    public double getBonificacao() {
        return this.salario* 3;
    }
    
}
