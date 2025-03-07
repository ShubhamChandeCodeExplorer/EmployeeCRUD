package com.csi.exception;

public class RecordNotFoundException extends RuntimeException{
    public RecordNotFoundException(String str){
        super(str);
    }
}
