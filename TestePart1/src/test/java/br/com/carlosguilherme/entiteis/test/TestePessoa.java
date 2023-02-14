package br.com.carlosguilherme.entiteis.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

import br.com.carlosguilherme.entiteis.Pessoa;

public class TestePessoa {

	@Test
	public void testaCastrodePessoaEImprimi() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Anderson");
		pessoa.setSexo("M");
		
		pessoa.toString();

	}

	@Test
	public void testaSeAsPessoaDaListaSaoTodasDoSexoFeminino() {

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Carlos");
		pessoa1.setSexo("M");
		Pessoa pessoa2 = new Pessoa("Thayse", "f");
		Pessoa pessoa3 = new Pessoa("Jefferson", "M");
		Pessoa pessoa4 = new Pessoa("Larissa", "f");
		Pessoa pessoa5 = new Pessoa("Junior", "M");
		Pessoa pessoa6 = new Pessoa("Sofia", "f");
		Pessoa pessoa7 = new Pessoa("Marcos", "M");
		Pessoa pessoa8 = new Pessoa("Karla", "f");

		List<Pessoa> lista = new ArrayList<>();
		lista.add(pessoa1);
		lista.add(pessoa2);
		lista.add(pessoa3);
		lista.add(pessoa4);
		lista.add(pessoa5);
		lista.add(pessoa6);
		lista.add(pessoa7);
		lista.add(pessoa8);

		Stream<Pessoa> lista1 = lista.stream().filter(pessoa -> pessoa.getSexo().toUpperCase().equals("F"));

		Assert.assertTrue(lista1.allMatch(pessoa -> pessoa.getSexo().toUpperCase().equals(("F"))));

	}

	@Test
	public void testaSeTemCadastroDuplicadoDePessoas() {
		boolean retorno= true;
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Anderson");
		pessoa1.setSexo("M");
		Pessoa pessoa2 = new Pessoa("Thayse", "f");
		Pessoa pessoa3 = new Pessoa("Jefferson", "M");
		Pessoa pessoa4 = new Pessoa("Larissa", "f");
		Pessoa pessoa5 = new Pessoa("Jefferson", "M");

		List<Pessoa> lista = new ArrayList<>();
		lista.add(pessoa1);
		lista.add(pessoa2);
		lista.add(pessoa3);
		lista.add(pessoa4);
		
		if (lista.contains(pessoa5))
			retorno = false;
	
		Assert.assertFalse(retorno);
	}
	
	
	
	

}
