package br.org.catolicasc.aula10.questao1;

public class Executavel {

    public static void main(String[] args) {
        
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        
        carro.start();
        moto.start();
    }
}
