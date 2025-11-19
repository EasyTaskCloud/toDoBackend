package com.example.toDoBackend.todo;

import java.time.LocalDate;

public class TodoDTO {

    private String title;
    private String summary;
    private LocalDate dueDate;

    public TodoDTO() {}

    public TodoDTO(String title, String summary, LocalDate dueDate) {
        this.title = title;
        this.summary = summary;
        this.dueDate = dueDate;
    }

    // Getter & Setter
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
}
