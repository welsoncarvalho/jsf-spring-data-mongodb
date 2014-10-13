package br.com.teste.jsdm.service;

import java.util.List;

import br.com.teste.jsdm.model.Process;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
public interface ProcessService extends Service {

	/**
	 * Save.
	 *
	 * @param process process
	 */
	public void save(Process process);
	
	/**
	 * Find by filter.
	 *
	 * @param process process
	 */
	public List<Process> findByFilter(Process process);
	
}
