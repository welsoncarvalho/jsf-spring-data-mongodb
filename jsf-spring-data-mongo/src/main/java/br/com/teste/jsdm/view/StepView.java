
package br.com.teste.jsdm.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.teste.jsdm.model.Process;
import br.com.teste.jsdm.model.Step;
import br.com.teste.jsdm.service.ProcessService;
import br.com.teste.jsdm.service.StepService;

@Controller
@Scope("request")
@ManagedBean(name = "stepView")
public class StepView extends CrudView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5055281799501649412L;
	
	@Autowired
	private StepService stepService;
	
	@Autowired
	private ProcessService processService;
	
	private Step filter;
	private Step step;
	private List<Process> listProcess;
	
	@PostConstruct
	public void init() {
		setListProcess(processService.findByFilter(new Process()));
	}
	
	public void search() {
		
	}

	@Override
	protected void newItem() {
		erase();
	}

	@Override
	protected void editItem() {
		// TODO Auto-generated method stub
		
	}
	
	public void saveStep() {
		stepService.save(getStep());
		addInfoMessage("Cadastrado com sucesso");
		
		erase();
		backToSearchOperation();
	}
	
	public void erase() {
		setStep(new Step());
	}

	public Step getFilter() {
		return filter;
	}

	public void setFilter(Step filter) {
		this.filter = filter;
	}

	public Step getStep() {
		return step;
	}

	public void setStep(Step step) {
		this.step = step;
	}

	public List<Process> getListProcess() {
		return listProcess;
	}

	public void setListProcess(List<Process> listProcess) {
		this.listProcess = listProcess;
	}
	
}
