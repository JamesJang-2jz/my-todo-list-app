package com.jamesjang.mytodolistapi.controller;

import com.jamesjang.mytodolistapi.model.ToDo;
import com.jamesjang.mytodolistapi.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/todos")
@CrossOrigin("http://localhost:3000")
public class ToDoController {

    private final ToDoService toDoService;

    @GetMapping
    public List<ToDo> getToDos() {
        return toDoService.getToDos();
    }

    

}
