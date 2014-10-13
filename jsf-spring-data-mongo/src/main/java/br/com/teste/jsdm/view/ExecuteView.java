package br.com.teste.jsdm.view;

import javax.faces.bean.ManagedBean;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.SimpleJob;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.batch.core.step.builder.SimpleStepBuilder;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.core.step.tasklet.TaskletStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;

import br.com.teste.jsdm.tasklet.StepProcessor;
import br.com.teste.jsdm.tasklet.StepReader;
import br.com.teste.jsdm.tasklet.StepWriter;
import br.com.teste.jsdm.tasklet.TestTasklet;

@Controller
@Scope("request")
@ManagedBean(name = "executeView")
public class ExecuteView extends BaseView {

	/**
	 * 
	 */
	private static final long serialVersionUID = -854425122968611962L;
	
	@Autowired
	private JobRepository jobRepository;
	
	@Autowired
	private PlatformTransactionManager transactionManager;
	
	@Autowired
	private JobLauncher jobLauncher;

	public void execute() {
		
		JobParameters parameters = new JobParameters();
		
		TaskletStep taskletStep = new TaskletStep();
		taskletStep.setName("step1");
		taskletStep.setJobRepository(jobRepository);
		taskletStep.setTransactionManager(transactionManager);
		
		Tasklet tasklet = new TestTasklet();
		taskletStep.setTasklet(tasklet);
		
		SimpleJob job = new SimpleJob("testeJob");
		job.addStep(taskletStep);
		job.setJobRepository(jobRepository);
		
		try {
			jobLauncher.run(job, parameters);
		} catch (JobExecutionAlreadyRunningException | JobRestartException
				| JobInstanceAlreadyCompleteException
				| JobParametersInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void executeJobStep() {
		
		JobParameters parameters = new JobParameters();
		
		StepBuilder stepBuilder = new StepBuilder("simpleStep");
		stepBuilder.repository(jobRepository);
		
		SimpleStepBuilder<String, Integer> simpleStepBuilder = new SimpleStepBuilder<>(stepBuilder);
		simpleStepBuilder.reader(new StepReader());
		simpleStepBuilder.processor(new StepProcessor());
		simpleStepBuilder.writer(new StepWriter());
		simpleStepBuilder.transactionManager(transactionManager);
		
		Step step = simpleStepBuilder.build();
		
		SimpleJob job = new SimpleJob("simpleJob");
		job.addStep(step);
		job.setJobRepository(jobRepository);
		
		try {
			jobLauncher.run(job, parameters);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void executeJobSplit() {
		
		
	}
	
}
