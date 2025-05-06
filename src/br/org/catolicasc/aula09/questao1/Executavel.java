package br.org.catolicasc.aula09.questao1;

public class Executavel {
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro("Pit");

        System.out.println(cachorro.caminha());
        System.out.println(cachorro.late());

        Gato gato = new Gato("Singer");

        System.out.println(gato.caminha());
        System.out.println(gato.mia());
    }
    
}
