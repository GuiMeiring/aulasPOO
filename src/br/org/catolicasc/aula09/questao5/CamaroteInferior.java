package br.org.catolicasc.aula09.questao5;

public class CamaroteInferior extends VIP{

    private String localizacao;

    public CamaroteInferior(double valor, String localizacao) {
        super(valor);
        this.localizacao=localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
}
