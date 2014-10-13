package br.com.teste.jsdm.dao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import br.com.teste.jsdm.dao.ProcessDao;
import br.com.teste.jsdm.enums.StatusEnum;
import br.com.teste.jsdm.model.Process;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
@Repository("processDao")
public class ProcessDaoImpl extends DaoImpl<Process> implements ProcessDao {

	/** A constante serialVersionUID. */
	private static final long serialVersionUID = 641127716329987486L;
	
	/**
	 * Instancia um novo process dao impl.
	 */
	public ProcessDaoImpl() {
		super(Process.class);
	}
	
	/* (non-Javadoc)
	 * @see br.com.teste.jsdm.dao.ProcessDao#findByFilter(br.com.teste.jsdm.model.Process)
	 */
	@Override
	public List<Process> findByFilter(Process process) {
		Criteria criteria = Criteria.where("status").is(StatusEnum.ACTIVE.getCode());
		
		if(StringUtils.isNotBlank(process.getId())) {
			criteria.and("_id").is(process.getId());
		}
		if(StringUtils.isNotBlank(process.getDescription())) {
			criteria.and("description").is(process.getDescription());
		}
		
		return findByCriteria(criteria);
	}

}
