package br.com.teste.jsdm.view;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
public abstract class BaseView implements Serializable {

	/** A constante serialVersionUID. */
	private static final long serialVersionUID = -2544501745810324791L;
	
	/**
	 * Adds the info message.
	 *
	 * @param message message
	 */
	protected void addInfoMessage(String message) {
		addMessage(message, FacesMessage.SEVERITY_INFO);
	}
	
	/**
	 * Adds the error message.
	 *
	 * @param message message
	 */
	protected void addErrorMessage(String message) {
		addMessage(message, FacesMessage.SEVERITY_ERROR);
	}
	
	/**
	 * Adds the warn message.
	 *
	 * @param message message
	 */
	protected void addWarnMessage(String message) {
		addMessage(message, FacesMessage.SEVERITY_WARN);
	}
	
	/**
	 * Adds the message.
	 *
	 * @param message message
	 * @param severity severity
	 */
	protected void addMessage(String message, Severity severity) {
		FacesMessage facesMessage = new FacesMessage(severity, message, message);
		addMessageOnContext(facesMessage);
	}
	
	/**
	 * Adds the message on context.
	 *
	 * @param facesMessage faces message
	 */
	private void addMessageOnContext(FacesMessage facesMessage) {
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
	}
	
}
