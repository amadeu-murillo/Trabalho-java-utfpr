//Nome: Murillo Tadeu Amadeu -  RA: 02564246
package com.mycompany.projetofinal;
public class Motorista extends Pessoa implements CalculaPro{
	private int qtdeViagens = 0; //tempo trabalhado <<---
	private String nivel = ""; //iniciante ,premium .. <<---

//-----------------------------------------------------------------
//getters();

	public final int getQtdeViagens(){
		return qtdeViagens;
	}

	public final String getNivel(){
		return nivel;
	}

//------------------------------------------------------------------
//setters();	

	public final void setQtde(int qtdeViagens){
		this.qtdeViagens = qtdeViagens;
	}
	public final void setNivel(String nivel){
		this.nivel = nivel;
	}

//------------------------------------------------------------
//interface motorista premium ou iniciante
        @Override
	public String impPro(){
		if(getQtdeViagens() < 50){
			setNivel("Motorista iniciante");
		}else if(getQtdeViagens() >=50){
			setNivel("Motorista Premium");
		}
		
		return getNivel();
	}
}