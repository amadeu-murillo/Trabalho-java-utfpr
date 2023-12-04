//Nome: Murillo Tadeu Amadeu -  RA: 02564246
package com.mycompany.projetofinal;
public abstract class Transporte{
	
	private String placa = "";
	private int qtdePassageiros = 0;
	private String cor ="";
	

 
//---------------------------------------------------------------
//metodos getters()


	public final String getPlaca(){
		return placa;
	}

	public final int getQtdePassageiro(){
		return qtdePassageiros;
	}
	
	public final String getCor(){
		return cor;
	}
	

//-----------------------------------------------------------------
//metodos setters()


public final void setPlaca(String placa) throws PlacaException {
    if (placa.length() <= 7) {
        this.placa = placa;
    } else {
        throw new PlacaException();
    }
}


	public final void setPassageiro(int qtdePassageiros){
		this.qtdePassageiros = qtdePassageiros;
	}

	public final void setCor(String cor){
		this.cor = cor;
	}
	
//------------------------------------------------------------------
//classe abstrata

	abstract double mostraConsumo(double distancia); 
	//mostra o consumo de combustivel do veiculo

}