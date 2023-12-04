//Nome: Murillo Tadeu Amadeu -  RA: 02564246
package com.mycompany.projetofinal;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



import javax.swing.JOptionPane;
//colocar a classe como GerCliente , uma pra ger motorista ,ger carro moto ...
public class GerMotorista{

	private final List<Motorista> bdMoto;
        private static GerMotorista gMotoUnic;
        
        private GerMotorista(){
            
            bdMoto = new ArrayList<Motorista>();
        }
        //metodo singleton
        public static GerMotorista geraGerMotorista(){
            if(gMotoUnic == null){ 
                gMotoUnic = new GerMotorista();
            }
            return gMotoUnic; 
        }
      
        public List<Motorista> getBdMoto(){ //esse é o array inteiro
            return bdMoto;               //retorna todas as informações
        }
        
	public Motorista insMotorista(Motorista mo){
		if(consMotoristaCpf(mo)== null){
			bdMoto.add(mo);
			return mo;
		}
		else{
			return null;
		}
	}//fim insPes

	public Motorista consMotoristaCpf(Motorista mo){
		for(int i = 0; i < bdMoto.size(); i++){
			if(mo.getCpf() == bdMoto.get(i).getCpf()){
				return bdMoto.get(i);
			}
		}
		return null;
	}//fim consPesCod

	public Motorista delMotoristaCpf(Motorista mo){
                Motorista mo2 = consMotoristaCpf(mo);
            	if(mo2 != null){
                    bdMoto.remove(mo2);
                    return null;
		}
		else{
                    return mo;
		}
		
	}//fim removePesCpf

	public Motorista atualizaMotoristaCpf(Motorista mo){
    for(int i = 0; i < bdMoto.size(); i++){
        if(mo.getCpf() == bdMoto.get(i).getCpf()){
            mo = bdMoto.get(i);

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
                    mo.setNome(nome);
                }
                if (!rua.isEmpty()) {
                    mo.getEnder().setRua(rua);
                }
                if (!pais.isEmpty()) {
                    mo.getEnder().setPais(pais);
                }
                if (!numero.isEmpty()) {
                    mo.getEnder().setNumero(Integer.parseInt(numero));
                }
                if (!idade.isEmpty()) {
                    try {
                        mo.setIdade(Integer.parseInt(idade));
                    } catch (IdadeException ex) {
                        Logger.getLogger(GerCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (NomeException | NumberFormatException ex) {
                Logger.getLogger(GerCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            bdMoto.set(i, mo);  

            // Exibindo informações atualizadas por meio de JOptionPane
            JOptionPane.showMessageDialog(
                null,
                """
                Dados do cliente atualizados:
                
                CPF: """ + mo.getCpf() + "\n" +
                "Nome: " + mo.getNome() + "\n" +
                "Rua: " + mo.getEnder().getRua() + "\n" +
                "País: " + mo.getEnder().getPais() + "\n" +
                "Número: " + mo.getEnder().getNumero() + "\n" +
                "Idade: " + mo.getIdade() + "\n" +
                "Valor Gasto: " + mo.getQtdeViagens(),
                "Informações Atualizadas",
                JOptionPane.INFORMATION_MESSAGE
            );

            return bdMoto.get(i);
        }
    }
    return null;
}

  


}//fim da classe