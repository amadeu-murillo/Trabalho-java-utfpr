//Nome: Murillo Tadeu Amadeu -  RA: 02564246
package com.mycompany.projetofinal;

import javax.swing.JOptionPane;

public class PlacaException extends Exception{
	

	public void impErroPlaca(){
		JOptionPane.showMessageDialog(null, "PLACA COM MUITOS CARACTERES, CORRIJA!!");
	
	}

	public Transporte corPlaca(Transporte t1){
		try{
                    
                    String novaPlaca = JOptionPane.showInputDialog(null, "INFORME A PLACA NOVAMENTE: ");
                    t1.setPlaca(novaPlaca);
			
		}
		
		catch(PlacaException pe){
			pe.impErroPlaca();
			t1 = pe.corPlaca(t1);
		}
		
		return t1;

	}
}