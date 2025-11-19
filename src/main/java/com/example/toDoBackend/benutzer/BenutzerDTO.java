package com.example.toDoBackend.benutzer;

import com.example.toDoBackend.todo.TodoDTO;

import java.util.List;

public class BenutzerDTO {

    private String vorname;
    private String nachname;
    private String bildpfad;

    public BenutzerDTO() {}

    public BenutzerDTO(String vorname, String nachname, String bildpfad) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.bildpfad = bildpfad;
    }

    // Getter & Setter
    public String getVorname() { return vorname; }
    public void setVorname(String vorname) { this.vorname = vorname; }

    public String getNachname() { return nachname; }
    public void setNachname(String nachname) { this.nachname = nachname; }

    public String getBildpfad() { return bildpfad; }
    public void setBildpfad(String bildpfad) { this.bildpfad = bildpfad; }
}
