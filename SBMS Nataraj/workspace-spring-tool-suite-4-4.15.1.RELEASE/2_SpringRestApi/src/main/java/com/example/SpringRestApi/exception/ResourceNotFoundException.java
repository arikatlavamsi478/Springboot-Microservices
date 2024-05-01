package com.example.SpringRestApi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private String Resource;
    private String fieldName;
    private String fieldValue;

    public String getResource() {
        return Resource;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public ResourceNotFoundException(String resource, String fieldName, String fieldValue) {

        // Get() not found id : 111
        super(String.format("%s Resource Not Found %s : '%s' ",resource,fieldName,fieldValue));
        this.Resource = resource;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;




    }
}
