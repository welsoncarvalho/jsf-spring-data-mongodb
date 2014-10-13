package br.com.teste.jsdm.jobexec.build;

import org.springframework.batch.core.job.flow.State;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import br.com.teste.jsdm.enums.TypeProcessStepEnum;
import br.com.teste.jsdm.jobexec.build.state.StateBuild;
import br.com.teste.jsdm.model.Process;
import br.com.teste.jsdm.model.TypeProcessStep;
import br.com.teste.jsdm.service.TypeProcessStepService;

public class FlowBuild {

	@Autowired
	private TypeProcessStepService typeProcessSteService;
	
	@Autowired
	private ApplicationContext appContext;
	
	public SimpleFlow buildFlowToJob(Process process) {
		
		SimpleFlow simpleFlow = new SimpleFlow(process.getId());
		
		TypeProcessStep firstTypeProcess = getFirstTypeProcessSte(process);
		
		return simpleFlow;
	}
	
	private void setFirstTypeProcessOnFlow(SimpleFlow simpleFlow, TypeProcessStep typeProcessStep) {
		
		if(typeProcessStep.getType().equals(TypeProcessStepEnum.SPLIT)) {
			
		}
		
	}
	
	private TypeProcessStep getFirstTypeProcessSte(Process process) {
		return typeProcessSteService.findFirstStepOfProcess(process.getId());
	}
	
	private State buildState(TypeProcessStep typeProcessStep) {
		TypeProcessStepEnum typeProcessStateEnum = TypeProcessStepEnum.valueOfType(typeProcessStep.getType());
		StateBuild stateBuild = getBean(typeProcessStateEnum.getStateBuild());
		return stateBuild.build(typeProcessStep);
	}
	
	@SuppressWarnings("unchecked")
	private <T extends Object> T getBean(String name) {
		return (T) appContext.getBean(name);
	}
	
}
