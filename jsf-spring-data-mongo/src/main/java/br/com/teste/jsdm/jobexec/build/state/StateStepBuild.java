package br.com.teste.jsdm.jobexec.build.state;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.flow.State;
import org.springframework.batch.core.job.flow.support.state.StepState;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.SimpleStepBuilder;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

import br.com.teste.jsdm.model.TypeProcessStep;
import br.com.teste.jsdm.service.StepService;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
@Component("stateStepBuild")
public class StateStepBuild extends StateBuild {

	/** step service. */
	@Autowired
	private StepService stepService;
	
	/** job repository. */
	@Autowired
	private JobRepository jobRepository;
	
	/** transaction manager. */
	@Autowired
	private PlatformTransactionManager transactionManager;
	
	/* (non-Javadoc)
	 * @see br.com.teste.jsdm.jobexec.build.state.StateBuild#build(br.com.teste.jsdm.model.TypeProcessStep)
	 */
	@Override
	public State build(TypeProcessStep typeProcessStep) {
		
		Step step = montarStep(getStepProcess(typeProcessStep));
		return new StepState(step);
	}
	
	/**
	 * Obtém step process.
	 *
	 * @param typeProcessStep type process step
	 * @return step process
	 */
	private br.com.teste.jsdm.model.Step getStepProcess(TypeProcessStep typeProcessStep) {
		return stepService.findByIdAndProcessId(typeProcessStep.getId(), typeProcessStep.getProcessId());
	}
	
	/**
	 * Montar step.
	 *
	 * @param stepProcess step process
	 * @return step
	 */
	private Step montarStep(br.com.teste.jsdm.model.Step stepProcess) {
		return montarSimpleStepBuilder(stepProcess).build();
	}
	
	/**
	 * Montar simple step builder.
	 *
	 * @param stepProcess step process
	 * @return simple step builder
	 */
	@SuppressWarnings("unchecked")
	private SimpleStepBuilder<String, String> montarSimpleStepBuilder(br.com.teste.jsdm.model.Step stepProcess) {
		SimpleStepBuilder<String, String> simpleStepBuilder = new SimpleStepBuilder<String, String>(montarStepBuilder(stepProcess.getName()));
		
		simpleStepBuilder.reader((ItemReader<String>) newInstance(stepProcess.getReader()));
		simpleStepBuilder.processor((ItemProcessor<String, String>) newInstance(stepProcess.getProcess()));
		simpleStepBuilder.writer((ItemWriter<String>) newInstance(stepProcess.getWriter()));
		simpleStepBuilder.transactionManager(transactionManager);
		
		return simpleStepBuilder;
	}
	
	/**
	 * Montar step builder.
	 *
	 * @param name name
	 * @return step builder
	 */
	private StepBuilder montarStepBuilder(String name) {
		StepBuilder stepBuilder = new StepBuilder(name);
		stepBuilder.repository(jobRepository);
		return stepBuilder;
	}

	/**
	 * New instance.
	 *
	 * @param clazz clazz
	 * @return object
	 */
	private Object newInstance(String clazz) {
		try {
			return Thread.currentThread().getContextClassLoader().loadClass(clazz).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
