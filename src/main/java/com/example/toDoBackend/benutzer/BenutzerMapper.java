package com.example.toDoBackend.benutzer;

import com.example.toDoBackend.todo.Todo;
import com.example.toDoBackend.todo.TodoDTO;
import com.example.toDoBackend.todo.TodoMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BenutzerMapper {

    private final TodoMapper todoMapper;

    public BenutzerMapper(TodoMapper todoMapper) {
        this.todoMapper = todoMapper;
    }

    public BenutzerDTO toDTO(Benutzer benutzer) {
        return new BenutzerDTO(benutzer.getVorname(), benutzer.getNachname(), benutzer.getBildpfad());
    }

    public Benutzer fromDTO(BenutzerDTO dto) {
        Benutzer benutzer = new Benutzer();
        benutzer.setVorname(dto.getVorname());
        benutzer.setNachname(dto.getNachname());
        benutzer.setBildpfad(dto.getBildpfad());

        return benutzer;
    }
}
