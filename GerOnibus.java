//Nome: Murillo Tadeu Amadeu -  RA: 02564246
package com.mycompany.projetofinal;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;






public class GerOnibus {
    private final List<Onibus> bdOnibus;
    private static GerOnibus gOnibusUnic;

    private GerOnibus() {
        bdOnibus = new ArrayList<Onibus>();
    }
    //metodo singleton
    public static GerOnibus geraGerOnibus() {
        if (gOnibusUnic == null) {
            gOnibusUnic = new GerOnibus();
        }
        return gOnibusUnic;
    }

    public List<Onibus> getBdOnibus() {
        return bdOnibus;
    }

    public Onibus insOnibus(Onibus onibus) {
        if (consOnibusPlaca(onibus) == null) {
            bdOnibus.add(onibus);
            return onibus;
        } else {
            return null;
        }
    }

    public Onibus consOnibusPlaca(Onibus onibus) {
        for (int i = 0; i < bdOnibus.size(); i++) {
            if (onibus.getPlaca().equals(bdOnibus.get(i).getPlaca())) {
                return bdOnibus.get(i);
            }
        }
        return null;
    }

    public Onibus delOnibusPlaca(Onibus onibus) {
        Onibus onibusEncontrado = consOnibusPlaca(onibus);
        if (onibusEncontrado != null) {
            bdOnibus.remove(onibusEncontrado);
            return null;
        } else {
            return onibus;
        }
    }

    public Onibus atualizaOnibus(Onibus onibusParaAtualizar) {
    for (int i = 0; i < bdOnibus.size(); i++) {
        if (onibusParaAtualizar.getPlaca().equals(bdOnibus.get(i).getPlaca())) {
            Onibus onibusEncontrado = bdOnibus.get(i);

            String novaPlaca = JOptionPane.showInputDialog(
                null,
                "Informe a nova placa do ônibus (ou deixe em branco para não alterar)",
                "Atualizar placa",
                JOptionPane.INFORMATION_MESSAGE
            );

            String novaCor = JOptionPane.showInputDialog(
                null,
                "Informe a nova cor do ônibus (ou deixe em branco para não alterar)",
                "Atualizar cor",
                JOptionPane.INFORMATION_MESSAGE
            );


            String novaDistancia = JOptionPane.showInputDialog(
                null,
                "Informe a nova distância do ônibus (ou deixe em branco para não alterar)",
                "Atualizar distância",
                JOptionPane.INFORMATION_MESSAGE
            );

            String novaTarifa = JOptionPane.showInputDialog(
                null,
                "Informe a nova tarifa do ônibus (ou deixe em branco para não alterar)",
                "Atualizar tarifa",
                JOptionPane.INFORMATION_MESSAGE
            );

            // Atualizar os atributos se novos valores forem fornecidos
            if (novaPlaca != null && !novaPlaca.isEmpty()) {
                try {
                    onibusEncontrado.setPlaca(novaPlaca);
                } catch (PlacaException ex) {
                    Logger.getLogger(GerOnibus.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (novaCor != null && !novaCor.isEmpty()) {
                onibusEncontrado.setCor(novaCor);
            }

          
            if (novaDistancia != null && !novaDistancia.isEmpty()) {
                try {
                    double distancia = Double.parseDouble(novaDistancia);
                    onibusEncontrado.setDistancia(distancia);
                } catch (NumberFormatException e) {
                    // Trate a exceção caso o valor inserido não seja um número válido
                    JOptionPane.showMessageDialog(
                        null,
                        "Por favor, insira um valor válido para a distância.",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }

            if (novaTarifa != null && !novaTarifa.isEmpty()) {
                try {
                    double tarifa = Double.parseDouble(novaTarifa);
                    onibusEncontrado.setPassagem(tarifa);
                } catch (NumberFormatException e) {
                    // Trate a exceção caso o valor inserido não seja um número válido
                    JOptionPane.showMessageDialog(
                        null,
                        "Por favor, insira um valor válido para a tarifa.",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }

            // Exibir informações atualizadas do ônibus
            JOptionPane.showMessageDialog(
                null,
                """
                Informações do ônibus atualizadas:
                
                Placa: """ + onibusEncontrado.getPlaca() + "\n" +
                "Cor: " + onibusEncontrado.getCor() + "\n" +
                
                "Distância: " + onibusEncontrado.getDistancia() + "\n" +
                "Tarifa: " + onibusEncontrado.getTarifa(),
                "Informações Atualizadas",
                JOptionPane.INFORMATION_MESSAGE
            );

            return onibusEncontrado;
        }
    }
    return null;
}

}
