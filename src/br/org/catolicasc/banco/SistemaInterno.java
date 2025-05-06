package br.org.catolicasc.banco;

import javax.swing.JOptionPane;

public class SistemaInterno {

    public void login(Autenticavel autenticavel){

        String senha = JOptionPane.showInputDialog(
            null,
            "Informe senha:",
            "Informe senha:",
            JOptionPane.INFORMATION_MESSAGE
            );

        if(autenticavel.autentica(Integer.valueOf(senha))) {
            JOptionPane.showMessageDialog(null, "Usuário autenticado");
        } else {
            JOptionPane.showMessageDialog(null, "Usuárion ão autenticado","Usuárion não autenticado", JOptionPane.ERROR_MESSAGE);
        }

    }
}
