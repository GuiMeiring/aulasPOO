package br.org.catolicasc.aula09.questao4;

public class Executavel {
    public static void main(String[] args) {
        
    ContaCorrente contaCorrente = new ContaCorrente();

    contaCorrente.depositar(10000);
    contaCorrente.sacar(2000);

    ContaCorrente clienteEspecial = new ClienteEspecial();

    clienteEspecial.depositar(10000);
    clienteEspecial.sacar(2000);

    System.out.println("Conta corrente: " + contaCorrente.getSaldo());
    System.out.println("Cliente especial: " + clienteEspecial.getSaldo());

    }
    
}
