package com.bit2015.emaillist3.exception;

public class EmaillistGetListException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public EmaillistGetListException(){
		super("EmaillistDao:getList Exception");
	}
	
	public EmaillistGetListException( String msg ) {
		super( msg );
	}
	

}
