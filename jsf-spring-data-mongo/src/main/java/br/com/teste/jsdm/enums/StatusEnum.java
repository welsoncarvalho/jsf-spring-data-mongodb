package br.com.teste.jsdm.enums;

public enum StatusEnum {

	ACTIVE(1),
	INACTIVE(2);
	
	private Integer code;
	
	private StatusEnum(Integer code) {
		this.code = code;
	}
	
	public Integer getCode() {
		return code;
	}
	
}
