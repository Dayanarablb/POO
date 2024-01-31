/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2tarea3grupo2.classe;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author HOME
 */
public class Teacher extends Person {
    private String departament;
    private String academicTitle;

    public Teacher(String name, String lastName, long identification, String gender, long phone, String address, String personalMail, String bloodType, String academicRole, int universityId, String user, String password, String birthdate, String departament, String academicTitle ) {
        super(name, lastName, identification, gender, phone, address, personalMail,bloodType, academicRole, universityId, user, password, birthdate);
        this.departament = departament;
        this.academicTitle = academicTitle;
    }
    
    public Teacher(){
        
    }

    public Document createCollection(Teacher teacher){
        Document document = new Document();
        document.put("name", teacher.getName());
        document.put("lastName", teacher.getLastName());
        document.put("identification", teacher.getIdentification());
        document.put("gender", teacher.getGender());
        document.put("phone", teacher.getPhone());
        document.put("address", teacher.getAddress());
        document.put("personalMail", teacher.getPersonalMail());
        document.put("bloodType", teacher.getBloodType());
        document.put("academicRole", teacher.getAcademicRole());
        document.put("universityId", teacher.getUniversityId());
        document.put("user", teacher.getUser());
        document.put("password", teacher.getPassword());
        document.put("birthDate", teacher.getBirthdate());
        document.put("departament", teacher.getDepartament());
        document.put("academicTitle", teacher.getAcademicTitle());
        return document;
    }
    
    public Type getType() {
        Type type = new TypeToken<List<Student>>(){}.getType();       
        return type;
    }
    
    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }
    
    
            
    
}
