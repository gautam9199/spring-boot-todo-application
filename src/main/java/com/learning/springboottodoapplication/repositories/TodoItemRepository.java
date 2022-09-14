package com.learning.springboottodoapplication.repositories;
import org.springframework.data.repository.CrudRepository;

import com.learning.springboottodoapplication.models.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long>{
    
}
