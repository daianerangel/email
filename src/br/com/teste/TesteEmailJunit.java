/**
 * 
 */
package br.com.teste;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import junit.framework.Test;
import junit.framework.TestCase;

/**
 * @author Daiane
 *
 */
public class TesteEmailJunit  extends TestCase implements Test {
	
	public TesteEmailJunit() {
		super();
	}

	protected void setUp() {
		System.out.println("Iniciando...");
	}

	/**
	 * Método testEnvia - Método responsável em realizar testes no Envio de
	 * E-mail.
	 * @throws MessagingException 
	 * @throws AddressException 
	 *
	 * @since 17/01/2007
	 */
	public void testEnvia() throws AddressException, MessagingException {
		assertEquals("E-mail não enviado ", true,
				GoogleMail.Send("daianejessik2011", "", "daiane-jessik@hotmail.com", "Teste JUnit - Mail", "Teste JUnit - Mail"));
	}
	
	protected void tearDown() {
		System.out.println("Finalizando...");
	}
	
}
