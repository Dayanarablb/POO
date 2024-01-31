
package com.mycompany.p2tarea3grupo2.classe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Subject {
    private String nameSubject;
    private Map<String, Double> notes;
    
    private List<Subject> subject = new ArrayList<>();

    public Subject(String nameSubject, Map<String, Double> notes) {
        this.nameSubject = nameSubject;
        this.notes = notes;
    }
  
    public Subject() {
    }
    
    // Método para agregar una nota a la materia
    public void agregarNota(String subject, String assignment, double note) {
        nameSubject = subject;
        notes.put(assignment, note);
    }

    // Método para obtener la nota de una evaluación específica
    public Double obtenerNota(String evaluacion) {
        return notes.get(evaluacion);
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public Map<String, Double> getNotes() {
        return notes;
    }

    public void setNotes(Map<String, Double> notes) {
        this.notes = notes;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }
    
    
    
    
}
