package br.com.teste.jsdm.dao;

import java.io.Serializable;

import br.com.teste.jsdm.model.EntidadeBase;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 * @param <T> tipo genérico
 */
public interface Dao<T extends EntidadeBase> extends Serializable {

	/**
	 * Save.
	 *
	 * @param entidade entidade
	 */
	public void save(T entidade);
	
	/**
	 * Update.
	 *
	 * @param entidade entidade
	 */
	public void update(T entidade);
	
}
