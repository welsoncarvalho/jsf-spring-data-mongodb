package br.com.teste.jsdm.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.teste.jsdm.dao.TypeProcessStepDao;
import br.com.teste.jsdm.model.TypeProcessStep;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
@Repository("typeProcessStepDao")
public class TypeProcessStepDaoImpl extends DaoImpl<TypeProcessStep> implements
		TypeProcessStepDao {

	/** A constante serialVersionUID. */
	private static final long serialVersionUID = -8742457277232568732L;

	/**
	 * Instancia um novo type process step dao impl.
	 */
	public TypeProcessStepDaoImpl() {
		super(TypeProcessStep.class);
	}
	
}
