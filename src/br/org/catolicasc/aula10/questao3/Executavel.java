package br.org.catolicasc.aula10.questao3;

import java.util.ArrayList;

import br.org.catolicasc.aula10.questao1.Carro;
import br.org.catolicasc.aula10.questao1.Moto;
import br.org.catolicasc.aula10.questao1.Veiculo;

public class Executavel {

    public static void main(String[] args) {

        ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

        listaVeiculos.add(new Carro());
        listaVeiculos.add(new Moto());

        for (Veiculo veiculo : listaVeiculos) {
            veiculo.start();
        }
        
    }
    
}
