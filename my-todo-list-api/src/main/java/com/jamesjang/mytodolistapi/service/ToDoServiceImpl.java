package com.jamesjang.mytodolistapi.service;


import com.jamesjang.mytodolistapi.exception.ToDoNotFoundException;
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
        return toDoRepository.findById(id)
                .orElseThrow(() -> new ToDoNotFoundException(String.format("To-do with id '%s' not found", id)));
    }

    @Override
    public List<ToDo> getToDos() {
        return toDoRepository.findAll();
    }

    @Override
    public ToDo addToDo(String desc) {
        ToDo toDo = new ToDo();
        toDo.setDesc(desc);
        return toDoRepository.save(toDo);
    }

    @Override
    public void deleteToDo(long id) {
        toDoRepository.deleteById(id);
    }

    @Override
    public void updateToDo(long id, boolean completed) {
        ToDo toDo = getToDo(id);
        toDo.setCompleted(completed);
        toDoRepository.save(toDo);
    }
}
