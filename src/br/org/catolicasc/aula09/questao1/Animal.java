package br.org.catolicasc.aula09.questao1;

public class Animal {
    private String nome,raca;

    public Animal() {
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public String caminha(){
        return "caminhando..";
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
