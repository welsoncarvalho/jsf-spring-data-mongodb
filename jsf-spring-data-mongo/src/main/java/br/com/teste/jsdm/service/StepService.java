package br.com.teste.jsdm.service;

import java.util.List;

import br.com.teste.jsdm.model.Step;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
public interface StepService extends Service {

	/**
	 * Save.
	 *
	 * @param step step
	 */
	public void save(Step step);
	
	/**
	 * List step by process id.
	 *
	 * @param processId process id
	 * @return list
	 */
	public List<Step> listStepByProcessId(String processId);
	
	/**
	 * Find by id and process id.
	 *
	 * @param id id
	 * @param processId process id
	 * @return step
	 */
	public Step findByIdAndProcessId(String id, String processId);
	
}
