package br.com.teste.jsdm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.jsdm.dao.UsuarioDao;
import br.com.teste.jsdm.model.Usuario;
import br.com.teste.jsdm.service.UsuarioService;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
/**
 * @author Welson
 *
 */
@Service("usuarioService")
public class UsuarioServiceImpl extends ServiceImpl implements UsuarioService {

	/** A constante serialVersionUID. */
	private static final long serialVersionUID = -3345767556779872611L;
	
	/** usuario dao. */
	@Autowired
	private UsuarioDao usuarioDao;
	
	/* (non-Javadoc)
	 * @see br.com.teste.jsdm.service.UsuarioService#listar()
	 */
	@Override
	public List<Usuario> listar() {
		return usuarioDao.listar();
	}
	
}
