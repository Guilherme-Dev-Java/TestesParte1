package br.com.carlosguilherme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import br.com.carlosguilherme.entiteis.Pessoa;

public class OrdenandoPessoaPorGeneroUsandoStream {
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String nomesLidos;
		String separador = "-,"; 
		List<Pessoa> lista = new  ArrayList<>();
				
				
		System.out.println("Digites todos os nome com o sexo da Pessoa, "
				+ "separado o nome do sexo por hifen e as pessoas por virgula: (Exemplo: Carlos-M, Thayse-F)");
		nomesLidos = s.nextLine();
		
		String nomeGenero [] = nomesLidos.split("["+Pattern.quote(separador)+"]");
		
		for(int i =0; i<nomeGenero.length;i++) {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(nomeGenero[i]);
			pessoa.setSexo(nomeGenero[i+1]);
			lista.add(pessoa);
			i++;
		}
			
		
		lista.stream()
		.filter
			(p -> p.getSexo().toUpperCase().equals("F"))
				.forEach(p -> System.out.println(p));
		

		s.close();

	}

}
