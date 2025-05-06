package br.org.catolicasc.aula10.questao6;

public class Executavel {
    public static void main(String[] args) {

        Calculadora calc= new Multiplicacao();

        calc.calcular(10, 2);

        System.out.println(calc.getResultado());
    }
}
