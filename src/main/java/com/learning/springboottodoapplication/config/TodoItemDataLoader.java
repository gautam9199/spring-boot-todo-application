package com.learning.springboottodoapplication.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.springboottodoapplication.models.TodoItem;
import com.learning.springboottodoapplication.repositories.TodoItemRepository;

@Component
public class TodoItemDataLoader implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(TodoItemDataLoader.class);

    @Autowired
    TodoItemRepository todoItemRepository ;

    @Override
    public void run(String... args) throws Exception {
        loadSeedData();
    }
    private void loadSeedData(){
        if (todoItemRepository.count() == 0){
            TodoItem todoItem1 = new TodoItem("Get the bananas");
            TodoItem todoItem2 = new TodoItem("Get the beans");

            todoItemRepository.save(todoItem1);
            todoItemRepository.save(todoItem2);
        }
        logger.info("Count of Items {}", todoItemRepository.count());
    }
}
