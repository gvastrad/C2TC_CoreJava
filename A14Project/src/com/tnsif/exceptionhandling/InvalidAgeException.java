package com.tnsif.exceptionhandling;

public class InvalidAgeException extends Exception {
String message;

public InvalidAgeException(String message) {
	super();
	this.message = message;
}

@Override
public String getMessage() {
	return " The age must be greater than 18";
}


}
