package com.example.toDoBackend.todo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;
    private final TodoMapper mapper;

    public TodoService(TodoRepository todoRepository, TodoMapper mapper) {
        this.todoRepository = todoRepository;
        this.mapper = mapper;
    }

    public List<TodoDTO> allTodos() {
        return todoRepository.findAll().stream().map(mapper::toDTO).toList();
    }
}
