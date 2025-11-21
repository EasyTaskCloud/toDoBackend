package com.example.toDoBackend.todo;

import com.example.toDoBackend.benutzer.Benutzer;
import com.example.toDoBackend.benutzer.BenutzerRepository;
import org.springframework.stereotype.Component;

@Component
public class TodoMapper {

    private final BenutzerRepository benutzerRepository;

    public TodoMapper(BenutzerRepository benutzerRepository) {
        this.benutzerRepository = benutzerRepository;
    }

    public TodoDTO toDTO(Todo todo) {
        return new TodoDTO(todo.getId(), todo.getTitle(), todo.getSummary(), todo.getDueDate(), todo.getBenutzer().getId());
    }

    public Todo fromDTO(TodoDTO dto) {
        Todo todo = new Todo();
        todo.setId(dto.getId());
        todo.setTitle(dto.getTitle());
        todo.setSummary(dto.getSummary());
        todo.setDueDate(dto.getDueDate());
        if (dto.getUserId() != 0) {
            Benutzer benutzer = benutzerRepository.findById(dto.getUserId()).orElseThrow(() -> new RuntimeException("Benutzer nicht gefunden"));
            todo.setBenutzer(benutzer);
        }

        return todo;
    }
}


