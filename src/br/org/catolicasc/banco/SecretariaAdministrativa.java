package br.org.catolicasc.banco;

public class SecretariaAdministrativa extends Secretaria {

    @Override
    public double getBonificacao() {
        return this.salario * 1.6;
    }
    
}
