package org.kosta.stockmarket.model;

public class InvalidTransactionException extends Exception{
	private static final long serialVersionUID = 1L;
	public InvalidTransactionException(String message){
		super(message);
	}
}
