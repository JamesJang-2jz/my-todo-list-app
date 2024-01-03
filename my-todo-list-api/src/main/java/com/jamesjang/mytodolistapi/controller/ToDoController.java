package com.jamesjang.mytodolistapi.controller;

import com.jamesjang.mytodolistapi.model.ToDo;
import com.jamesjang.mytodolistapi.service.ToDoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/todos")
@CrossOrigin("http://localhost:3000")
public class ToDoController {


    /* this doesn't instantitate the interface but Spring will provide bean and inject when needed.
    ToDoServiceImpl implements the ToDoService interface. @Service in ToDoServiceImpl tells Spring that this class is service bean
    @RequiredArgsConstructor generates constructor that takes ToDoService parameter and inject when creating instance of ToDoController
    @RequiredArgsConstructor implicitly has @Autowired included
    */
    private final ToDoService toDoService;

    @GetMapping
    public List<ToDo> getToDos() {
        return toDoService.getToDos();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ToDo addToDo (@Valid @RequestBody AddToDoRequest addToDoRequest){
        return toDoService.addToDo(addToDoRequest.description());
    }

    @DeleteMapping("/{id}")
    public void deleteToDo(@PathVariable Long id){
        toDoService.deleteToDo(id);
    }

    @PatchMapping("/{id}")
    public void updateToDo(@PathVariable Long id, @RequestParam Boolean completed){
        toDoService.updateToDo(id, completed);
    }

}
