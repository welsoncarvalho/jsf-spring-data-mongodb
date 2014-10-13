package br.com.teste.jsdm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.jsdm.dao.StepDao;
import br.com.teste.jsdm.enums.StatusEnum;
import br.com.teste.jsdm.model.Step;
import br.com.teste.jsdm.service.StepService;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
@Service("stepService")
public class StepServiceImpl extends ServiceImpl implements StepService {

	/** A constante serialVersionUID. */
	private static final long serialVersionUID = 2150119586716261611L;
	
	/** step dao. */
	@Autowired
	private StepDao stepDao;

	/* (non-Javadoc)
	 * @see br.com.teste.jsdm.service.StepService#save(br.com.teste.jsdm.model.Step)
	 */
	@Override
	public void save(Step step) {
		step.setStatus(StatusEnum.ACTIVE.getCode());
		stepDao.save(step);
	}

	/* (non-Javadoc)
	 * @see br.com.teste.jsdm.service.StepService#listStepByProcessId(java.lang.String)
	 */
	@Override
	public List<Step> listStepByProcessId(String processId) {
		return stepDao.listStepByProcessId(processId);
	}
	
	@Override
	public Step findByIdAndProcessId(String id, String processId) {
		return null;
	}

}
