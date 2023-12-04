//Nome: Murillo Tadeu Amadeu -  RA: 02564246
package com.mycompany.projetofinal;

import javax.swing.JOptionPane;

public class NomeException extends Exception {

    public void impErroNome() {
        JOptionPane.showMessageDialog(
            null,
            "Nome inválido. Por favor, insira um nome válido.",
            "Erro no Nome",
            JOptionPane.ERROR_MESSAGE
        );
    }

    public Pessoa corNome(Pessoa p1) {
        String nome = JOptionPane.showInputDialog(
                null,
                "Informe o NOME novamente",
                "Atualizar dados",
                JOptionPane.INFORMATION_MESSAGE
        );
        // Faça algo com o nome aqui, se necessário

        return p1;
    }
}