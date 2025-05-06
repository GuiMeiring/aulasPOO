package br.org.catolicasc.aula09.questao5;

public class Executavel {
    public static void main(String[] args) {
        
        Ingresso ingresso = new Ingresso(10);
        Ingresso vip = new VIP(10);
        Ingresso normal = new Normal(10);
        Ingresso camaroteInferior = new CamaroteInferior(10, "Local");
        Ingresso camaroteSuperior = new CamaroteSuperior(10, 10);

        System.out.println("Valor ingresso: R$" + ingresso.imprimirValor());
        System.out.println("Valor ingresso VIP: R$" + vip.imprimirValor());
        System.out.println("Valor ingresso normal: " + ((Normal) normal).tipoIngresso() + " - R$" + normal.imprimirValor());
        System.out.println("Valor ingresso Camarote inferior: R$" + camaroteInferior.imprimirValor() + " - Localização: " + ((CamaroteInferior) camaroteInferior).getLocalizacao());
        System.out.println("Valor ingresso Camarote Superior: R$" + camaroteSuperior.imprimirValor());
    }
}
