package com.jamesjang.mytodolistapi.exception;

public class ToDoNotFoundException extends RuntimeException {


    public ToDoNotFoundException(String msg){
        super(msg);
    }

}
