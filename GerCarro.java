//Nome: Murillo Tadeu Amadeu -  RA: 02564246
package com.mycompany.projetofinal;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



import javax.swing.JOptionPane;
//colocar a classe como GerCliente , uma pra ger motorista ,ger carro moto ...
public class GerCarro{

	private final List<Carro> bdCar;
        private static GerCarro gCarUnic;
        
        private GerCarro(){
            
            bdCar = new ArrayList<Carro>();
        }
        //metodo singleton
        public static GerCarro geraGerCarro(){
            if(gCarUnic == null){ //se for unico ele inicializa um novo GerPes
                gCarUnic = new GerCarro();
            }
            return gCarUnic;  //caso não seja nulo ele retorna o objeto ja estânciado
        }
      
        public List<Carro> getBdCar(){ //esse é o array inteiro
            return bdCar;               //retorna todas as informações
        }
        
	public Carro insCarro(Carro ca){
		if(consCarroPlaca(ca)== null){
			bdCar.add(ca);
			return ca;
		}
		else{
			return null;
		}
	}//fim insPes

	public Carro consCarroPlaca(Carro ca){
		for(int i = 0; i < bdCar.size(); i++){
			if(ca.getPlaca().equals(bdCar.get(i).getPlaca())){
				return bdCar.get(i);
			}
		}
		return null;
	}//fim consPesCod

	public Carro delCarroPlaca(Carro ca){
                Carro ca1 = consCarroPlaca(ca);
            	if(ca1 != null){
                    bdCar.remove(ca1);
                    return null;
		}
		else{
                    return ca;
		}
		
	}//fim 

	public Carro atualizaCarro(Carro carroParaAtualizar) {
    for (int i = 0; i < bdCar.size(); i++) {
        if (carroParaAtualizar.getPlaca().equals(bdCar.get(i).getPlaca())) {
            // Encontrou o carro com a placa correspondente
            Carro carroEncontrado = bdCar.get(i);

            // Solicitar novos valores para os atributos do carro
            String novaPlaca = JOptionPane.showInputDialog(
                null,
                "Informe a nova placa do carro (ou deixe em branco para não alterar)",
                "Atualizar placa",
                JOptionPane.INFORMATION_MESSAGE
            );

            String novaCor = JOptionPane.showInputDialog(
                null,
                "Informe a nova cor do carro (ou deixe em branco para não alterar)",
                "Atualizar cor",
                JOptionPane.INFORMATION_MESSAGE
            );

            String novaQuantidadePassageiros = JOptionPane.showInputDialog(
                null,
                "Informe a nova quantidade de passageiros (ou deixe em branco para não alterar)",
                "Atualizar quantidade de passageiros",
                JOptionPane.INFORMATION_MESSAGE
            );

            // Atualizar os atributos se novos valores forem fornecidos
            if (novaPlaca != null && !novaPlaca.isEmpty()) {
                try {
                    carroEncontrado.setPlaca(novaPlaca);
                } catch (PlacaException ex) {
                    Logger.getLogger(GerCarro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (novaCor != null && !novaCor.isEmpty()) {
                carroEncontrado.setCor(novaCor);
            }

            if (novaQuantidadePassageiros != null && !novaQuantidadePassageiros.isEmpty()) {
                try {
                    int quantidadePassageiros = Integer.parseInt(novaQuantidadePassageiros);
                    carroEncontrado.setPassageiro(quantidadePassageiros);
                } catch (NumberFormatException e) {
                    // Trate a exceção caso o valor inserido não seja um número válido
                    JOptionPane.showMessageDialog(
                        null,
                        "Por favor, insira um valor válido para a quantidade de passageiros.",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }

            // Exibir informações atualizadas do carro
            JOptionPane.showMessageDialog(
                null,
                """
                Informa\u00e7\u00f5es do carro atualizadas:
                
                Placa: """ + carroEncontrado.getPlaca() + "\n" +
                "Cor: " + carroEncontrado.getCor() + "\n" +
                "Quantidade de Passageiros: " + carroEncontrado.getQtdePassageiro() + "\n" +
                "(Outros atributos atualizados)",
                "Informações Atualizadas",
                JOptionPane.INFORMATION_MESSAGE
            );

            return carroEncontrado;
        }
    }
    return null; // Retorna null se o carro não for encontrado
}



}//fim da classe