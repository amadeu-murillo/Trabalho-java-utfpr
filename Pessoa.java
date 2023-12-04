//Nome: Murillo Tadeu Amadeu -  RA: 02564246
package com.mycompany.projetofinal;
public abstract class Pessoa{
	private int cpf = 0;
	private int idade = 0;
	private String nome;
	private Endereco ender = new Endereco();


//----------------------------------------------------------------
//reflexividade endereco

	public final Endereco getEnder(){
		return ender;
	}

	public final void setEnder(Endereco ender){
		this.ender = ender;
	}

	
//----------------------------------------------------------------
//getters()

	public final int getCpf(){
		return cpf;
	}
	
	public final int getIdade(){
			return idade;
		
	}

	public final String getNome(){
		return nome;
	}
//----------------------------------------------------------------
//setters()
	public final void setCpf(int cpf){
		this.cpf = cpf;
	}
	public final void setIdade(int idade) throws IdadeException{
		if(idade >= 18){
			this.idade = idade;
		}else{
			throw new IdadeException();
		}
		
	}

	public final void setNome(String nome) throws NomeException{
		if(nome.length() <= 30){
			this.nome = nome;
		}else{
			throw new NomeException();
		}
		
	}
//---------------------------------------------

}