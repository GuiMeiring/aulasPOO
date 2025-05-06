package br.org.catolicasc.aula10.questao6;

    public abstract class Calculadora {

        protected double resultado;

        

        public abstract void calcular(double a, double b);



        public double getResultado() {
            return resultado;
        }

}
