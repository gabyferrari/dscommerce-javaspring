package com.devsuperior.dscommerce.services.exceptions;

public class DataBaseException extends RuntimeException {

	//exceção para quando se tenta excluir um produto com chava estrangeira
	
	private static final long serialVersionUID = 1L;
	
	public DataBaseException(String msg) {
		super(msg);
	}
	
}
