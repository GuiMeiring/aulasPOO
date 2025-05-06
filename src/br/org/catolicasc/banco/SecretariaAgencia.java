package br.org.catolicasc.banco;

public class SecretariaAgencia extends Secretaria {

    @Override
    public double getBonificacao() {
        return this.salario * 1.5;
    }
    
}
