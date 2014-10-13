package br.com.teste.jsdm.jobexec.build.state;

import org.springframework.batch.core.job.flow.State;

import br.com.teste.jsdm.model.TypeProcessStep;

public abstract class StateBuild {

	public abstract State build(TypeProcessStep typeProcessStep);
	
}
