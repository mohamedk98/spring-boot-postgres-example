package com.demo.pgExample.exceptions;

public class BadRequestErrorException extends RuntimeException{
    
    public BadRequestErrorException(String message) {
        super(message);
    }
    public BadRequestErrorException(Throwable cause){
        super(cause);
    }
    public BadRequestErrorException(String message,Throwable cause){
        super(message,cause);
    }
}
