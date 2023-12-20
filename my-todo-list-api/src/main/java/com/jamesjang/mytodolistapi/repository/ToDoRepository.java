package com.jamesjang.mytodolistapi.repository;

import com.jamesjang.mytodolistapi.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long>{


}
