package br.com.teste.jsdm.enums;


public enum OperationViewEnum {

	SEARCH(1),
	INCLUDE(2),
	EDIT(3),
	INCLUDE_EDIT(4);
	
	private Integer code;
	
	public static OperationViewEnum valueOf(Integer operation) {
		
		for(OperationViewEnum operationViewEnum : values()) {
			if(operationViewEnum.getCode().equals(operation)) {
				return operationViewEnum;
			}
		}
		
		return null;
	}
	
	private OperationViewEnum(Integer code) {
		this.code = code;
	}
	
	public Integer getCode() {
		return code;
	}
	
}
