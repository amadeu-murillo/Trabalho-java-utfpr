//Nome: Murillo Tadeu Amadeu -  RA: 02564246
package com.mycompany.projetofinal;
public class Cliente extends Pessoa implements CalculaPro{

	private Double valorGasto = 0.0;
	private String vip = ""; //cliente e vip ou popular

//--------------------------------------------------------
//getters();
	
	public final Double getValorGasto(){
		return valorGasto;
	}
	public final String getVip(){
		return vip;
	}

//--------------------------------------------------------
//setters();
	
	public final void setValorGasto(Double valorGasto){
		this.valorGasto = valorGasto;
	}
	public final void setVip(String vip){
		this.vip = vip;
	}
//---------------------------------------------------------
//interface
        @Override
	public String impPro(){
		if(getValorGasto() < 500){
			setVip("-->>CLIENTE POP<<--");
		}else if(getValorGasto() >=500){
			setVip("-->>CLIENTE VIP<<--");
		}
		return getVip();
		
	}
}