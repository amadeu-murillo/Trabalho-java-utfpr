//Nome: Murillo Tadeu Amadeu -  RA: 02564246
package com.mycompany.projetofinal;
public class Carro extends Transporte implements Calc{

	private double tarifa = 0;
	private String tipoCorrida = "";
	private double distancia = 0;
	

//---------------------------------------------------
//metodos getters()
	public final double getTarifa(){
		return tarifa;
	}
	public final String getCorrida(){
		return tipoCorrida;
	}
	public final double getDistancia(){
		return distancia;
	}
	
	

//---------------------------------------------------
//metodos setters()
	
	public final void setTarifa(float tarifa){
		this.tarifa = tarifa;
	}

	public final void setCorrida(String tipoCorrida){
		this.tipoCorrida = tipoCorrida;
	}
	public final void setDistancia(double distancia){
		this.distancia = distancia;
	}



//---------------------------------------------------
//classe abstrata obrigatoria
//sobrescrita
	public double mostraConsumo(double distancia){
		//hipotese carro gasta 0,40 cents por km
		double gastoKm = 0.40; //gasto por km
		double gasto =0;
		gasto =Math.round(gastoKm * distancia);

		System.out.println("\nO carro gastou um total de: "+gasto+" reais ,em uma distancia de: "+distancia+" km");
		return gasto;
		
		
	}
//---------------------------------------------------
//interface
        //sobrecarga possui em moto e Ônibus
	public double calculaTarifa(){
		//tarifa paga por km , fixa em uma media 1,50 R$ (baseado na uber)
		double precoKm = 1.50;
		
		int distancia = 0;
		tarifa = precoKm * getDistancia();
		double lucro =Math.round(tarifa - (0.40*getDistancia()));
	
		System.out.println("\nA tarifa recebida pelo motorista eh: "+tarifa);
		System.out.println("\nO lucro do motorista eh: "+lucro);
		return tarifa;
		
	}
}