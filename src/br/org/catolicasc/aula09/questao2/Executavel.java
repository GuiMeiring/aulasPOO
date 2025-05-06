package br.org.catolicasc.aula09.questao2;

public class Executavel {
    public static void main(String[] args) {
        
        Carro carro = new Carro();

        carro.setMarca("Ford");
        carro.setQtdPortas(4);

        Moto moto = new Moto();

        moto.setMarca("Honda");
        moto.setQtdCilindradas(250);

        Barco barco = new Barco();

        barco.setMarca("Kawashima");
        barco.setPotMotor(100);

        System.out.println(carro.getMarca() + " - Quantidade porta: "+ carro.getQtdPortas());
        System.out.println(moto.getMarca() + " - Quantidade cilindradas: "+ moto.getQtdCilindradas());
        System.out.println(barco.getMarca() + " - Motor: "+ barco.getPotMotor());
    }
    
}
