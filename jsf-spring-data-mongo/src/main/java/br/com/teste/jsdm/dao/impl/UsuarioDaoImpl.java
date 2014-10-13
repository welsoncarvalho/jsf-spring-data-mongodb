package br.com.teste.jsdm.dao.impl;

import java.util.List;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import br.com.teste.jsdm.dao.UsuarioDao;
import br.com.teste.jsdm.model.Usuario;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
@Repository("usuarioDao")
public class UsuarioDaoImpl extends DaoImpl<Usuario> implements UsuarioDao {

	/** A constante serialVersionUID. */
	private static final long serialVersionUID = 2194969051026530835L;

	/**
	 * Instancia um novo usuario dao impl.
	 */
	public UsuarioDaoImpl() {
		super(Usuario.class);
	}

	/* (non-Javadoc)
	 * @see br.com.teste.jsdm.dao.UsuarioDao#listar()
	 */
	@Override
	public List<Usuario> listar() {
		return findByCriteria(new Criteria());
	}

}
