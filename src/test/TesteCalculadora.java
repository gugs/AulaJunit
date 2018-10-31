package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import app.Calculadora;

/*
 * 
 * Exerc�cio: Implemente os testes necess�rios para verificar se os m�todos implementados est�o corretos.
 * Se necess�rio, fa�a um teste de mesa com alguns casos para se certificar da adequa��o. 
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
