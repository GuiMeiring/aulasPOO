package br.org.catolicasc.banco;

public class Gerente extends Funcionario {
    private int senha;
    private int numFuncionarioGerenciado;

    public int getSenha() {
        return senha;
    }

    public int getNumFuncionarioGerenciado() {
        return numFuncionarioGerenciado;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setNumFuncionarioGerenciado(int numFuncionarioGerenciado) {
        this.numFuncionarioGerenciado = numFuncionarioGerenciado;
    }

    public boolean autentica(int senha){
        if (this.senha == senha){
            System.out.println("Acesso permitido!");
            return true;
        }

        System.out.println("Acesso negado!");
        return false;
    }
    
    public double getBonificacao(){
        return this.salario * 1.4 + 1000;
    }
}
