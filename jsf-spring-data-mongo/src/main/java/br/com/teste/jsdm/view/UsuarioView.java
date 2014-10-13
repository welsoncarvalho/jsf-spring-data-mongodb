package br.com.teste.jsdm.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.teste.jsdm.model.Usuario;
import br.com.teste.jsdm.service.UsuarioService;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
@Controller
@Scope("session")
@ManagedBean(name = "usuarioView")
public class UsuarioView extends BaseView {

	/** A constante serialVersionUID. */
	private static final long serialVersionUID = 6863441789072640706L;

	/** usuarios. */
	private List<Usuario> usuarios;
	
	/** usuario service. */
	@Autowired
	private UsuarioService usuarioService;
	
	/**
	 * Inits the.
	 */
	@PostConstruct
	public void init() {
		setUsuarios(usuarioService.listar());
	}
	
	/**
	 * Obtém usuarios.
	 *
	 * @return usuarios
	 */
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	/**
	 * Define usuarios.
	 *
	 * @param usuarios novo usuarios
	 */
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
