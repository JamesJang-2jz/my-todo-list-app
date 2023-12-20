package com.jamesjang.mytodolistapi.service;


import com.jamesjang.mytodolistapi.model.ToDo;
import com.jamesjang.mytodolistapi.repository.ToDoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ToDoServiceImpl implements ToDoService{

    private  final ToDoRepository toDoRepository;

    @Override
    public ToDo getToDo(long id) {
        return null;
    }

    @Override
    public List<ToDo> getToDos() {
        return null;
    }

    @Override
    public ToDo addToDo(String desc) {
        return null;
    }

    @Override
    public void deleteToDo(long id) {

    }

    @Override
    public void updateToDo(long id, boolean completed) {

    }
}
