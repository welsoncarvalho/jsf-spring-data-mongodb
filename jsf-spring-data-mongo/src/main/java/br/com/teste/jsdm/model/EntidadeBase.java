package br.com.teste.jsdm.model;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
public abstract class EntidadeBase implements Serializable {

	/** A constante serialVersionUID. */
	private static final long serialVersionUID = 2009027377181352704L;
	
	private Integer status;

	/**
	 * Obtém id.
	 *
	 * @return id
	 */
	public abstract Object getID();
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	/**
	 * Obtém status.
	 *
	 * @return status
	 */
	public Integer getStatus() {
		return status;
	}
	
}
