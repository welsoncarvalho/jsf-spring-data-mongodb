package br.com.teste.jsdm.dao.impl;

import java.util.List;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import br.com.teste.jsdm.dao.StepDao;
import br.com.teste.jsdm.enums.StatusEnum;
import br.com.teste.jsdm.model.Step;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
@Repository("stepDao")
public class StepDaoImpl extends DaoImpl<Step> implements StepDao {

	/** A constante serialVersionUID. */
	private static final long serialVersionUID = -6080042495825195982L;

	/**
	 * Instancia um novo step dao impl.
	 */
	public StepDaoImpl() {
		super(Step.class);
	}
	
	@Override
	public List<Step> listStepByProcessId(String processId) {
		Criteria criteria = Criteria.where("status").is(StatusEnum.ACTIVE.getCode())
				.and("processId").is(processId);
		return findByCriteria(criteria);
	}
	
}
