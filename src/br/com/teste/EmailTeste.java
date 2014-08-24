/**
 * 
 */
package br.com.teste;

/**
 * @author Daiane
 *
 */
import junit.framework.Test;
import junit.framework.TestCase;

/**
 * Classe EmailTeste - Responsável em realizar teste unitários na classe E-mail.
 *
 * @author Aristides Vicente (aristidesvicente@gmail.com)
 * @since 17/01/2007
 */

public class EmailTeste extends TestCase implements Test {
	public EmailTeste() {
		super();
	}

	protected void setUp() {
		System.out.println("Iniciando...");
	}

	/**
	 * Método testEnvia - Método responsável em realizar testes no Envio de
	 * E-mail.
	 *
	 * @since 17/01/2007
	 */
	public void testEnvia() {
		assertEquals("E-mail não enviado ", true,
				Email.envia("Teste JUnit - Mail"));
	}

	protected void tearDown() {
		System.out.println("Finalizando...");
	}
}
