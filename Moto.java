//Nome: Murillo Tadeu Amadeu -  RA: 02564246
package com.mycompany.projetofinal;
public class Moto extends Transporte implements Calc{
	
	private double distancia = 0;
	private String tipoCorrida =""; //carga ou passageiro
	private double tarifa = 0;

//------------------------------------------------------
//metodos get()
	

	public final double getDistancia(){
		return distancia;
	}
	public final String getCorrida(){
		return tipoCorrida;
	}

	public final double getTarifa(){
		return tarifa;
	}

//-------------------------------------------------------
//metodos set()

	
	public final void setTipoCorrida(String tipoCorrida){
		this.tipoCorrida = tipoCorrida;
	}
	public final void setTarifa(double tarifa){
		this.tarifa = tarifa;
	}
	public final void setDistancia(double distancia){
		this.distancia = distancia;
	}


//---------------------------------------------------
//classe abstrata obrigatoria

	//sobrescrita
        @Override
	public double mostraConsumo(double distancia){
		//hipotese moto gasta 0,18 cents por km
		double gastoKm = 0.18; //gasto por km

		double gasto =Math.round(gastoKm * distancia);

		
		return gasto;
		
		
	}
//---------------------------------------------------
//interface
        //sobrecarga
        @Override
	public double calculaTarifa(){
		//tarifa paga por km , fixa em uma media 1,00 R$ (baseado na uber e ifood)
		double precoKm = 1.00;
		int distancia = 0;
		double lucro = 0;
		
		tarifa = Math.round(precoKm * getDistancia());
		lucro = Math.round(tarifa - (0.18*getDistancia()));
	
		
		return tarifa;
	}

}