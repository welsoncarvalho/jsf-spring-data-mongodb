package br.com.teste.jsdm.view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;

import br.com.teste.jsdm.model.Usuario;
import br.com.teste.jsdm.service.UsuarioService;

@ManagedBean(name = "usuarioView")
@Scope("session")
@Controller
public class UsuarioView {

	private List<Usuario> usuarios;
	
	@Autowired
	private MongoOperations mongoTemplate;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostConstruct
	public void init() {
		setUsuarios(mongoTemplate.find(new Query(), Usuario.class));
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
