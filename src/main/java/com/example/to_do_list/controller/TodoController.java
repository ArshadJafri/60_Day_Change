package com.example.to_do_list.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.to_do_list.Repo.TodoRepo;
import com.example.to_do_list.model.ToDoListItem;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoRepo todorepo;
    
    @GetMapping
    public List<ToDoListItem> getAllTodos() {
        return todorepo.findAll();
    }

    @PostMapping
    public ToDoListItem createTodo(@Valid @NotNull @RequestBody ToDoListItem todo) {
        return todorepo.save(todo);
    }

    @PutMapping
    public ToDoListItem updateTodo(@Valid @NotNull @RequestBody ToDoListItem todo){
        return todorepo.save(todo);
    }
    
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id){
        todorepo.deleteById(id);
    }

}
