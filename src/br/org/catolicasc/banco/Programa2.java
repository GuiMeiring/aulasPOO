package br.org.catolicasc.banco;

public class Programa2 {
    public static void main(String[] args) {

        SistemaInterno si = new SistemaInterno();

        Cliente cliente = new Cliente();
        cliente.setSenha(123);

        Gerente gerente = new Gerente();
        gerente.setSenha(345);

        si.login(cliente);
        si.login(gerente);
    }
    
}
