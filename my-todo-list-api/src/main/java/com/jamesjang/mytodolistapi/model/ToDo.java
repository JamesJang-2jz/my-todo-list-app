package com.jamesjang.mytodolistapi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

// model for the to do items into db
// data annotation to generate common methods getters/setters
@Data
@Entity
public class ToDo {

    @Id
    @GeneratedValue
    private Long id;

    private String desc;
    private boolean completed;


}
