package com.devsuperior.dscommerce.dto;

public class FieldMessage {
	
	//mensagens para exceções de validação
	
	private String fieldName;
	private String message;
	
	public FieldMessage(String fieldName, String message) {
		this.fieldName = fieldName;
		this.message = message;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	public String getMessage() {
		return message;
	}
	
}
