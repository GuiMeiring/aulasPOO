package br.org.catolicasc.aula10.questao2;

public class Executavel {

    public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        Forma quadrado = new Quadrado(4);
        
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
        
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
    }
    
}
