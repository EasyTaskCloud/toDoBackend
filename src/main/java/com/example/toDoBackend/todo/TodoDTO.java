package com.example.toDoBackend.todo;

import java.time.LocalDate;

public class TodoDTO {

    private Long id;
    private String title;
    private String summary;
    private LocalDate dueDate;
    public Long userId;

    public TodoDTO() {}

    public TodoDTO(Long id, String title, String summary, LocalDate dueDate, Long userId) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.dueDate = dueDate;
        this.userId = userId;
    }

    // Getter & Setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
