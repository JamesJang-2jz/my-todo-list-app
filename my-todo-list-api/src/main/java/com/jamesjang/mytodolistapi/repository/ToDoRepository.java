package com.jamesjang.mytodolistapi.repository;

import com.jamesjang.mytodolistapi.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;


// uses spring data JPA repository for CRUD operations without need to write these methods out manually
public interface ToDoRepository extends JpaRepository<ToDo, Long>{
}
