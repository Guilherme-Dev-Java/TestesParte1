package br.com.carlosguilherme.entiteis;

import java.util.Objects;

public class Pessoa {
	
	String nome, sexo;

	public Pessoa(String nome, String sexo) {
		super();
		this.nome = nome;
		this.sexo = sexo;
	}


	public Pessoa() {
		super();
	}




	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " Sexo: " + this.sexo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(sexo, other.sexo);
	}

	
}
