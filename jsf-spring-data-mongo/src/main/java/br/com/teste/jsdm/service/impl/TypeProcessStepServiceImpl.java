package br.com.teste.jsdm.service.impl;

import org.springframework.stereotype.Service;

import br.com.teste.jsdm.model.TypeProcessStep;
import br.com.teste.jsdm.service.TypeProcessStepService;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
@Service("typeProcessStepService")
public class TypeProcessStepServiceImpl extends ServiceImpl implements
		TypeProcessStepService {

	/** A constante serialVersionUID. */
	private static final long serialVersionUID = 3446007937548082412L;
	
	@Override
	public TypeProcessStep findFirstStepOfProcess(String processId) {
		return null;
	}
	
	@Override
	public TypeProcessStep findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
