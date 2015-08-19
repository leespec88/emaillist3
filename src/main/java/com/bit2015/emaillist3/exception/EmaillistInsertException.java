package com.bit2015.emaillist3.exception;

public class EmaillistInsertException extends RuntimeException {

	public EmaillistInsertException(){
		super("EmaillistDao:insert Exception");
	}
	
	public EmaillistInsertException( String msg ){
		super( msg );
	}
}
