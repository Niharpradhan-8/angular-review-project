package com.example.springbootangular.exception;

public class RecordAlreadyExistException extends RuntimeException{

    public RecordAlreadyExistException() {
    }

    public RecordAlreadyExistException(String message) {
        super(message);
    }
}
