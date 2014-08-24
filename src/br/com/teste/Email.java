package br.com.teste;

import java.security.Security;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Classe Email ± Responsável em enviar e-mail.*
 * 
 * @author Aristides Vicente (aristidesvicente@gmail.com)
 * @since 15/01/2007
 */
public class Email {
	public Email() {
		super();
	}

	public static boolean envia(String mensagem) {
		Properties props = new Properties();
		
		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		
//		String host = "smtp.gmail.com";
//		String from = "daianejessik2011";
		props.setProperty("mail.smtps.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        props.setProperty("mail.smtps.auth", "true");
        props.put("mail.smtps.quitwait", "false");
        props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		
		Session mailSession = Session.getDefaultInstance(props, null);
		Transport transport;
		boolean retorno = false;
		try {
			transport = mailSession.getTransport();
			MimeMessage msg = new MimeMessage(mailSession);
			msg.setSubject("SUBJECT");
			msg.setContent(mensagem, "text/plain");
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(
					"daianejessik2011@gmail.com"));
			transport.connect();
			transport.sendMessage(msg,
					msg.getRecipients(Message.RecipientType.TO));
			transport.close();
			retorno = true;
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return retorno;
	}
}
