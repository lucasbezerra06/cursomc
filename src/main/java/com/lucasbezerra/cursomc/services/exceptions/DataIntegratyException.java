package com.lucasbezerra.cursomc.services.exceptions;

public class DataIntegratyException extends RuntimeException{

    public DataIntegratyException(String msg){super(msg);}

    public DataIntegratyException(String msg, Throwable cause){
        super(msg, cause);
    }
}
