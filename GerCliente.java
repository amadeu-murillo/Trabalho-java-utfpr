//Nome: Murillo Tadeu Amadeu -  RA: 02564246
package com.mycompany.projetofinal;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



import javax.swing.JOptionPane;
//colocar a classe como GerCliente , uma pra ger motorista ,ger carro moto ...
public class GerCliente{

	private final List<Cliente> bdCl;
        private static GerCliente gClUnic;
        
        private GerCliente(){
            
            bdCl = new ArrayList<Cliente>();
        }
        //metodo singleton
        public static GerCliente geraGerCliente(){
            if(gClUnic == null){ //se for unico ele inicializa um novo GerPes
                gClUnic = new GerCliente();
            }
            return gClUnic;  //caso não seja nulo ele retorna o objeto ja estânciado
        }
      
        public List<Cliente> getBdCl(){ //esse é o array inteiro
            return bdCl;               //retorna todas as informações
        }
        
	public Cliente insCliente(Cliente cl){
		if(consClienteCpf(cl)== null){
			bdCl.add(cl);
			return cl;
		}
		else{
			return null;
		}
	}//fim insPes

	public Cliente consClienteCpf(Cliente cl){
		for(int i = 0; i < bdCl.size(); i++){
			if(cl.getCpf() == bdCl.get(i).getCpf()){
				return bdCl.get(i);
			}
		}
		return null;
	}//fim consPesCod

	public Cliente delClienteCpf(Cliente cl){
                Cliente cl1 = consClienteCpf(cl);
            	if(cl1 != null){
                    bdCl.remove(cl1);
                    return null;
		}
		else{
                    return cl;
		}
		
	}//fim removePesCpf

	public Cliente atualizaClienteCpf(Cliente cl){
    for(int i = 0; i < bdCl.size(); i++){
        if(cl.getCpf() == bdCl.get(i).getCpf()){
            cl = bdCl.get(i);

            String nome = JOptionPane.showInputDialog(
                null,
                "Informe o novo NOME (ou deixe em branco para não alterar)",
                "Atualizar dados",
                JOptionPane.INFORMATION_MESSAGE
            );

            String rua = JOptionPane.showInputDialog(
                null,
                "Informe a nova Rua (ou deixe em branco para não alterar)",
                "Atualizar dados",
                JOptionPane.INFORMATION_MESSAGE
            );

            String pais = JOptionPane.showInputDialog(
                null,
                "Informe o novo País (ou deixe em branco para não alterar)",
                "Atualizar dados",
                JOptionPane.INFORMATION_MESSAGE
            );

            String numero = JOptionPane.showInputDialog(
                null,
                "Informe o novo Número (ou deixe em branco para não alterar)",
                "Atualizar dados",
                JOptionPane.INFORMATION_MESSAGE
            );

            String idade = JOptionPane.showInputDialog(
                null,
                "Informe a nova Idade (ou deixe em branco para não alterar)",
                "Atualizar dados",
                JOptionPane.INFORMATION_MESSAGE
            );

            try {
                if (!nome.isEmpty()) {
                    cl.setNome(nome);
                }
                if (!rua.isEmpty()) {
                    cl.getEnder().setRua(rua);
                }
                if (!pais.isEmpty()) {
                    cl.getEnder().setPais(pais);
                }
                if (!numero.isEmpty()) {
                    cl.getEnder().setNumero(Integer.parseInt(numero));
                }
                if (!idade.isEmpty()) {
                    try {
                        cl.setIdade(Integer.parseInt(idade));
                    } catch (IdadeException ex) {
                        Logger.getLogger(GerCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (NomeException | NumberFormatException ex) {
                Logger.getLogger(GerCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            bdCl.set(i, cl);  

            // Exibindo informações atualizadas por meio de JOptionPane
            JOptionPane.showMessageDialog(
                null,
                """
                Dados do cliente atualizados:
                
                CPF: """ + cl.getCpf() + "\n" +
                "Nome: " + cl.getNome() + "\n" +
                "Rua: " + cl.getEnder().getRua() + "\n" +
                "País: " + cl.getEnder().getPais() + "\n" +
                "Número: " + cl.getEnder().getNumero() + "\n" +
                "Idade: " + cl.getIdade() + "\n" +
                "Valor Gasto: " + cl.getValorGasto(),
                "Informações Atualizadas",
                JOptionPane.INFORMATION_MESSAGE
            );

            return bdCl.get(i);
        }
    }
    return null;
}


}//fim da classe