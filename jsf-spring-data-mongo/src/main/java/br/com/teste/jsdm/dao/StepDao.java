package br.com.teste.jsdm.dao;

import java.util.List;

import br.com.teste.jsdm.model.Step;

public interface StepDao extends Dao<Step> {

	public List<Step> listStepByProcessId(String processId);
	
}
