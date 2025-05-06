package br.org.catolicasc.banco;

public class Cliente implements Autenticavel{

    private int senha;

    @Override
    public boolean autentica(int senha) {
        return senha == this.senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
}
