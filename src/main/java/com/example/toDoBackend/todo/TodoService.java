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

    public List<TodoDTO> getTodosByUserId(Long id) {
        return todoRepository.findByBenutzerId(id).stream().map(mapper::toDTO).toList();
    }

    public void deleteTodo(Long id) {
        if (!todoRepository.existsById(id)) {
            throw new RuntimeException("Todo not found");
        }
        todoRepository.deleteById(id);
    }

    public TodoDTO createTask(TodoDTO dto) {
        Todo todo = mapper.fromDTO(dto);
        Todo saved = todoRepository.save(todo);
        return mapper.toDTO(saved);
    }
}
