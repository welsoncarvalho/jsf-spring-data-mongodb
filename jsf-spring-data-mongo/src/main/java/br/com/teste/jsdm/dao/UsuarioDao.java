package br.com.teste.jsdm.dao;

import java.util.List;

import br.com.teste.jsdm.model.Usuario;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
public interface UsuarioDao extends Dao<Usuario> {

	/**
	 * Listar.
	 *
	 * @return list
	 */
	List<Usuario> listar();
	
}
