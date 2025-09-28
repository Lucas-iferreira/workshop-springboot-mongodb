package com.lucasiago.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String id) {
        super("Object not Found. Id: " + id);
    }
}
