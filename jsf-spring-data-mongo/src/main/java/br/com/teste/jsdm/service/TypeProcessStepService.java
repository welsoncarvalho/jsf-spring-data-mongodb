package br.com.teste.jsdm.service;

import br.com.teste.jsdm.model.TypeProcessStep;

/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
public interface TypeProcessStepService extends Service {

	public TypeProcessStep findFirstStepOfProcess(String processId);
	
	public TypeProcessStep findById(String id);
	
}
