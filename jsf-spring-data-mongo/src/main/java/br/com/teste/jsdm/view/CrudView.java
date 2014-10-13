package br.com.teste.jsdm.view;

import br.com.teste.jsdm.enums.OperationViewEnum;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
public abstract class CrudView extends BaseView {

	/** A constante serialVersionUID. */
	private static final long serialVersionUID = 7590374246822921637L;
	
	/** operation. */
	private OperationViewEnum operation = OperationViewEnum.SEARCH;
	
	/**
	 * New register.
	 */
	public void newItem(Integer operation) {
		setOperation(OperationViewEnum.valueOf(operation));
		newItem();
	}
	
	protected abstract void newItem();
	
	public void editItem(Integer operation) {
		setOperation(OperationViewEnum.valueOf(operation));
		
	}
	
	protected abstract void editItem();
	
	public void backToSearchOperation() {
		setOperation(OperationViewEnum.SEARCH);
	}
	
	//GET e SET
	/**
	 * Obtém operation.
	 *
	 * @return operation
	 */
	public OperationViewEnum getOperation() {
		return operation;
	}
	
	/**
	 * Define operation.
	 *
	 * @param operation novo operation
	 */
	public void setOperation(OperationViewEnum operation) {
		this.operation = operation;
	}

}
