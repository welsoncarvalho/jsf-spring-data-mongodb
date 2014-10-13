package br.com.teste.jsdm.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 * 
 * @author Welson
 */
/**
 * @author Welson
 *
 */
@Document(collection = "processo")
public class Process extends EntidadeBase {

	/** A constante serialVersionUID. */
	private static final long serialVersionUID = -2627838000703437321L;

	/** id. */
	@Id
	private String id;

	/** description. */
	private String description;
	
	/** is paralel. */
	private Boolean isParalel;
	
	/** time execution. */
	private String timeExecution;

	/** dependent process. */
	private List<String> dependentProcess;

	/**
	 * Obtém id.
	 *
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Define id.
	 *
	 * @param id novo id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Obtém description.
	 *
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Define description.
	 *
	 * @param description novo description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Obtém checks if is paralel.
	 *
	 * @return checks if is paralel
	 */
	public Boolean getIsParalel() {
		return isParalel;
	}
	
	/**
	 * Define checks if is paralel.
	 *
	 * @param isParalel novo checks if is paralel
	 */
	public void setIsParalel(Boolean isParalel) {
		this.isParalel = isParalel;
	}
	
	/**
	 * Obtém time execution.
	 *
	 * @return time execution
	 */
	public String getTimeExecution() {
		return timeExecution;
	}
	
	/**
	 * Define time execution.
	 *
	 * @param timeExecution novo time execution
	 */
	public void setTimeExecution(String timeExecution) {
		this.timeExecution = timeExecution;
	}

	/**
	 * Obtém dependent process.
	 *
	 * @return dependent process
	 */
	public List<String> getDependentProcess() {
		return dependentProcess;
	}

	/**
	 * Define dependent process.
	 *
	 * @param dependentProcess novo dependent process
	 */
	public void setDependentProcess(List<String> dependentProcess) {
		this.dependentProcess = dependentProcess;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.teste.jsdm.model.EntidadeBase#getID()
	 */
	@Override
	public Object getID() {
		return getId();
	}

}
