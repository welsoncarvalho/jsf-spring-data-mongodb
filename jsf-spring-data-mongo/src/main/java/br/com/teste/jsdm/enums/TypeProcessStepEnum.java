package br.com.teste.jsdm.enums;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
public enum TypeProcessStepEnum {

	/** step. */
	STEP ("step", "stateStepBuild"),
	
	/** split. */
	SPLIT ("split", "stateSplitBuild");
	
	/** type. */
	private String type;
	
	/** state build. */
	private String stateBuild;
	
	/**
	 * Instancia um novo type process step enum.
	 *
	 * @param type type
	 * @param stateBuild state build
	 */
	private TypeProcessStepEnum(String type, String stateBuild) {
		this.type = type;
		this.stateBuild = stateBuild;
	}
	
	/**
	 * Value of type.
	 *
	 * @param type type
	 * @return type process step enum
	 */
	public static TypeProcessStepEnum valueOfType(String type) {
		for(TypeProcessStepEnum tpse : values()) {
			if(tpse.getType().equals(type)) {
				return tpse;
			}
		}
		
		return null;
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
	 * Obtém state build.
	 *
	 * @return state build
	 */
	public String getStateBuild() {
		return stateBuild;
	}
	
}
