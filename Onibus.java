//Nome: Murillo Tadeu Amadeu -  RA: 02564246
package com.mycompany.projetofinal;
public class Onibus extends Transporte implements Calc{
	private double distancia = 0;
	private double tarifa = 5.70; //preco da passagem
	

//------------------------------------------------------
//metodos getters()

	public final double getDistancia(){
		return distancia;
	}


	public final double getTarifa(){
		return tarifa;
	}

//-------------------------------------------------------
//metodo set()
	
	public final void setDistancia(double distancia){
		this.distancia = distancia;
	}

	public final void setPassagem(double tarifa){
		this.tarifa = tarifa;
	}



//---------------------------------------------------
//classe abstrata obrigatoria

	public double mostraConsumo(double distancia){
		//gasto medio baseado em consumo de onibus 2,20 R$ por km
		double gastoKm = 2.20; //gasto por km
		double gasto = 0;
		gasto = Math.round((gastoKm * distancia) * 100.0) / 100.0;

		System.out.println("\nO Onibus gastou um total de: "+gasto+" reais,em uma distancia de: "+distancia+"km");
		return gasto;
		
		
	}
//---------------------------------------------------
//interface

	public double calculaTarifa(){
		//tarifa fixa baseada na grande londrina 5,70 R$
		tarifa = 5.70;
		double lucro = tarifa - 2.20;
		System.out.println("\nA tarifa recebida por pessoa eh: "+tarifa);
		System.out.println("\nO lucro esperado por pessoa em um km eh: "+lucro);
		System.out.println("\nO lucro total esperado: "+(getQtdePassageiro()*getDistancia()*lucro)+" a uma distancia de: "+getDistancia()+" Km"); 
		return tarifa;
		
		
	}

//----------------------------------------------------------------------------------

	
	
}