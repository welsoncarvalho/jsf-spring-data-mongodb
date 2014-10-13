package br.com.teste.jsdm.dao;

import java.util.List;

import br.com.teste.jsdm.model.Process;

public interface ProcessDao extends Dao<Process> {

	List<Process> findByFilter(Process process);
	
}
