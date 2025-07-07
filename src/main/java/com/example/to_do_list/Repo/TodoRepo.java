package com.example.to_do_list.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.to_do_list.model.ToDoListItem;

public interface TodoRepo extends JpaRepository<ToDoListItem, Long> {

    
}
