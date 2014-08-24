/**
 * 
 */
package br.com.teste;

import javax.mail.MessagingException;

/**
 * @author Daiane
 *
 */
public class TesteEmail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		try {
			GoogleMail.Send("daianejessik2011", "", "daiane-jessik@hotmail.com", "oi", "teste");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}

}
