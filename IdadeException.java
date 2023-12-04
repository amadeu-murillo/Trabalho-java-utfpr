//Nome: Murillo Tadeu Amadeu -  RA: 02564246
package com.mycompany.projetofinal;

import javax.swing.JOptionPane;

public class IdadeException extends Exception {

    public void impErro() {
        JOptionPane.showMessageDialog(null, "PESSOA MENOR DE 18 ANOS!!!");
    }

    public Pessoa corIdade(Pessoa p1) {
        try {
            String novaIdadeStr = JOptionPane.showInputDialog(null, "INFORME A IDADE NOVAMENTE: ");
            int novaIdade = Integer.parseInt(novaIdadeStr);
            p1.setIdade(novaIdade);
        } catch (IdadeException ide) {
            ide.impErro();
            p1 = ide.corIdade(p1);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "A IDADE DEVE SER UM NÚMERO");
        }
        return p1;
    }
}
