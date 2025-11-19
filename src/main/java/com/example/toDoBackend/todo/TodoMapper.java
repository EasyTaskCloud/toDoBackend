package com.example.toDoBackend.todo;

import org.springframework.stereotype.Component;

@Component
public class TodoMapper {

    public TodoDTO toDTO(Todo todo) {
        return new TodoDTO(todo.getTitle(), todo.getSummary(), todo.getDueDate());
    }

    public Todo fromDTO(TodoDTO dto) {
        Todo todo = new Todo();
        todo.setTitle(dto.getTitle());
        todo.setSummary(dto.getSummary());
        todo.setDueDate(dto.getDueDate());
        return todo;
    }
}


