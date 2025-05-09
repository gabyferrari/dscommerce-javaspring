package com.devsuperior.dscommerce.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError {

	public ValidationError(Instant timestamp, Integer status, String error, String path) {
		super(timestamp, status, error, path);
	}
	
	private List<FieldMessage> errors = new ArrayList<>(); //lista para ter todas as exceções de validação da clase ProductDTO e suas mensagens 

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String message) { //colocar as mensagens
		errors.removeIf(x -> x.getFieldName().equals(fieldName));
		errors.add(new FieldMessage(fieldName, message));
	}
	
}
