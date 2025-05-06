package br.org.catolicasc.aula09.questao3;

public class Executavel {
    public static void main(String[] args) {
        
        Fisica pessoa1 = new Fisica();
        Juridica pessoa2 = new Juridica();

        pessoa1.setNome("Pedro");
        pessoa1.setCpf("111.111.111-11");

        pessoa2.setNome("João");
        pessoa2.setCnpj("111.111/1111-11");

        System.out.println(pessoa1.getNome() + " - " + pessoa1.getCpf());
        System.out.println(pessoa2.getNome() + " - " + pessoa2.getCnpj());
    }
}
