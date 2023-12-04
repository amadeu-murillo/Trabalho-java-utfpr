//Nome: Murillo Tadeu Amadeu -  RA: 02564246
package com.mycompany.projetofinal;
public class Endereco{
	private String pais;
	private String rua;
	private int numero;

//----------------------------------------------
//get()
	public String getPais(){
		return pais;
	}

	public String getRua(){
		return rua;
	}
	public int getNumero(){
		return numero;
	}

//----------------------------------------------
//set()
	public void setPais(String pais){
		this.pais = pais;
	}
	public void setRua(String rua){
		this.rua = rua;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
}