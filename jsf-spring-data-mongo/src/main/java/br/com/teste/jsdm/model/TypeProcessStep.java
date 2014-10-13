package br.com.teste.jsdm.model;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
public class TypeProcessStep extends EntidadeBase {

	/** A constante serialVersionUID. */
	private static final long serialVersionUID = 3418999782733808655L;

	/** id. */
	private String id;
	
	/** type. */
	private String type;
	
	/** process id. */
	private String processId;
	
	/** order. */
	private Integer order;
	
	/** next. */
	private String next;
	
	/** types process steps. */
	private List<TypeProcessStep> typesProcessSteps;

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
	 * Obtém type.
	 *
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Define type.
	 *
	 * @param type novo type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Obtém process id.
	 *
	 * @return process id
	 */
	public String getProcessId() {
		return processId;
	}
	
	/**
	 * Define process id.
	 *
	 * @param processId novo process id
	 */
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	/**
	 * Obtém order.
	 *
	 * @return order
	 */
	public Integer getOrder() {
		return order;
	}

	/**
	 * Define order.
	 *
	 * @param order novo order
	 */
	public void setOrder(Integer order) {
		this.order = order;
	}
	
	/**
	 * Obtém next.
	 *
	 * @return next
	 */
	public String getNext() {
		return next;
	}
	
	/**
	 * Define next.
	 *
	 * @param next novo next
	 */
	public void setNext(String next) {
		this.next = next;
	}

	/**
	 * Obtém types process steps.
	 *
	 * @return types process steps
	 */
	public List<TypeProcessStep> getTypesProcessSteps() {
		return typesProcessSteps;
	}

	/**
	 * Define types process steps.
	 *
	 * @param typesProcessSteps novo types process steps
	 */
	public void setTypesProcessSteps(List<TypeProcessStep> typesProcessSteps) {
		this.typesProcessSteps = typesProcessSteps;
	} 
	
	/* (non-Javadoc)
	 * @see br.com.teste.jsdm.model.EntidadeBase#getID()
	 */
	@Override
	public Object getID() {
		return getId();
	}
	
}
