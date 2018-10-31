package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import app.Calculadora;

/*
 * 
 * Exercício: Implemente os testes necessários para verificar se os métodos implementados estão corretos.
 * Se necessário, faça um teste de mesa com alguns casos para se certificar da adequação. 
 * 
 * */

public class TesteCalculadora {
	
	private Calculadora calc;
	
	@Before
	public void initiate()
	{
		calc = new Calculadora();
	}
	
	@Test
	public void testarAdicao() 
	{
		assertEquals(8, calc.adicao(4, 4));
		assertEquals(-1, calc.adicao(4, -5));
		assertEquals(-10, calc.adicao(-5, -5));	
	}
	
	

}
