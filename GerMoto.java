//Nome: Murillo Tadeu Amadeu -  RA: 02564246
package com.mycompany.projetofinal;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



import javax.swing.JOptionPane;
//colocar a classe como GerCliente , uma pra ger motorista ,ger carro moto ...
public class GerMoto {

    private final List<Moto> bdMotos;
    private static GerMoto gMotoUnic;

    private GerMoto() {
        bdMotos = new ArrayList<Moto>();
    }
    //metodo singleton
    public static GerMoto geraGerMoto() {
        if (gMotoUnic == null) {
            gMotoUnic = new GerMoto();
        }
        return gMotoUnic;
    }

    public List<Moto> getBdMotos() {
        return bdMotos;
    }

    public Moto insMoto(Moto moto) {
        if (consMotoPlaca(moto) == null) {
            bdMotos.add(moto);
            return moto;
        } else {
            return null;
        }
    }

    public Moto consMotoPlaca(Moto moto) {
        for (int i = 0; i < bdMotos.size(); i++) {
            if (moto.getPlaca().equals(bdMotos.get(i).getPlaca())) {
                return bdMotos.get(i);
            }
        }
        return null;
    }

    public Moto delMotoPlaca(Moto moto) {
        Moto motoEncontrada = consMotoPlaca(moto);
        if (motoEncontrada != null) {
            bdMotos.remove(motoEncontrada);
            return null;
        } else {
            return moto;
        }
    }

    public Moto atualizaMoto(Moto motoParaAtualizar) {
        for (int i = 0; i < bdMotos.size(); i++) {
            if (motoParaAtualizar.getPlaca().equals(bdMotos.get(i).getPlaca())) {
                // Encontrou a moto com a placa correspondente
                Moto motoEncontrada = bdMotos.get(i);

                // Solicitar novos valores para os atributos da moto
                String novaPlaca = JOptionPane.showInputDialog(
                    null,
                    "Informe a nova placa da moto (ou deixe em branco para não alterar)",
                    "Atualizar placa",
                    JOptionPane.INFORMATION_MESSAGE
                );

                String novaCor = JOptionPane.showInputDialog(
                    null,
                    "Informe a nova cor da moto (ou deixe em branco para não alterar)",
                    "Atualizar cor",
                    JOptionPane.INFORMATION_MESSAGE
                );

                String novaTipoCorrida = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo tipo de corrida da moto (ou deixe em branco para não alterar)",
                    "Atualizar tipo de corrida",
                    JOptionPane.INFORMATION_MESSAGE
                );

                String novaDistancia = JOptionPane.showInputDialog(
                    null,
                    "Informe a nova distância da moto (ou deixe em branco para não alterar)",
                    "Atualizar distância",
                    JOptionPane.INFORMATION_MESSAGE
                );

                String novaTarifa = JOptionPane.showInputDialog(
                    null,
                    "Informe a nova tarifa da moto (ou deixe em branco para não alterar)",
                    "Atualizar tarifa",
                    JOptionPane.INFORMATION_MESSAGE
                );

                // Atualizar os atributos se novos valores forem fornecidos
                if (novaPlaca != null && !novaPlaca.isEmpty()) {
                    try {
                        motoEncontrada.setPlaca(novaPlaca);
                    } catch (PlacaException ex) {
                        Logger.getLogger(GerMoto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                if (novaCor != null && !novaCor.isEmpty()) {
                    motoEncontrada.setCor(novaCor);
                }

                if (novaTipoCorrida != null && !novaTipoCorrida.isEmpty()) {
                    motoEncontrada.setTipoCorrida(novaTipoCorrida);
                }

                if (novaDistancia != null && !novaDistancia.isEmpty()) {
                    try {
                        double distancia = Double.parseDouble(novaDistancia);
                        motoEncontrada.setDistancia(distancia);
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
                        motoEncontrada.setTarifa(tarifa);
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

                // Exibir informações atualizadas da moto
                JOptionPane.showMessageDialog(
                    null,
                    """
                    Informações da moto atualizadas:
                    
                    Placa: """ + motoEncontrada.getPlaca() + "\n" +
                    "Cor: " + motoEncontrada.getCor() + "\n" +
                    "Tipo de Corrida: " + motoEncontrada.getCorrida() + "\n" +
                    "Distância: " + motoEncontrada.getDistancia() + "\n" +
                    "Tarifa: " + motoEncontrada.getTarifa(),
                    "Informações Atualizadas",
                    JOptionPane.INFORMATION_MESSAGE
                );

                return motoEncontrada;
            }
        }
        return null; // Retorna null se a moto não for encontrada
    }
}
//fim da classe