package com.example.toDoBackend.todo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<TodoDTO> getAllTodos() {
        return todoService.allTodos();
    }

    @GetMapping("/{userId}")
    public List<TodoDTO> getTodosByUserId(@PathVariable Long userId) {
        return todoService.getTodosByUserId(userId);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return ResponseEntity.noContent().build(); // 204 OK
    }
}
