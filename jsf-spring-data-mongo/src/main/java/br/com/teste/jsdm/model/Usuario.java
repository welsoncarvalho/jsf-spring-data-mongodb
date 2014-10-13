package br.com.teste.jsdm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
@Document(collection = "usuario")
public class Usuario extends EntidadeBase {

	/** A constante serialVersionUID. */
	private static final long serialVersionUID = -180401892252131335L;
	
	/** login. */
	@Id
	private String login;
	
	/** nome. */
	private String nome;
	
	/** email. */
	private String email;
	
	/**
	 * Obtém login.
	 *
	 * @return login
	 */
	public String getLogin() {
		return login;
	}
	
	/**
	 * Define login.
	 *
	 * @param login novo login
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	
	/**
	 * Obtém nome.
	 *
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Define nome.
	 *
	 * @param nome novo nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Obtém email.
	 *
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Define email.
	 *
	 * @param email novo email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/* (non-Javadoc)
	 * @see br.com.teste.jsdm.model.EntidadeBase#getID()
	 */
	@Override
	public Object getID() {
		return getLogin();
	}
	
}
