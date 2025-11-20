package com.example.toDoBackend.todo;

import org.springframework.stereotype.Component;

@Component
public class TodoMapper {

    public TodoDTO toDTO(Todo todo) {
        return new TodoDTO(todo.getId(), todo.getTitle(), todo.getSummary(), todo.getDueDate(), todo.getBenutzer().getId());
    }

    public Todo fromDTO(TodoDTO dto) {
        Todo todo = new Todo();
        todo.setId(dto.getId());
        todo.setTitle(dto.getTitle());
        todo.setSummary(dto.getSummary());
        todo.setDueDate(dto.getDueDate());
        todo.setBenutzer(todo.getBenutzer());
        return todo;
    }
}


