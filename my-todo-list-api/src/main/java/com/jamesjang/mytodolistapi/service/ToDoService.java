package com.jamesjang.mytodolistapi.service;

import com.jamesjang.mytodolistapi.model.ToDo;

import java.util.List;

public interface ToDoService {

    ToDo getToDo(long id);
    List<ToDo> getToDos();
    ToDo addToDo (String desc);
    void deleteToDo(long id);
    void updateToDo(long id, boolean completed);


}
