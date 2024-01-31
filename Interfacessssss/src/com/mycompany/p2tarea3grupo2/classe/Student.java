
package com.mycompany.p2tarea3grupo2.classe;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;


public class Student extends Person{

    private String career;
    private String level;
    private List<Subject>subject;

    public Student(String name, String lastName, long identification, String gender, long phone, String address, String personalMail, String bloodType, String academicRole, int universityId, String user, String password, String birthdate, String career, String level, List<Subject> subject){
       super(name, lastName, identification, gender, phone, address, personalMail,bloodType, academicRole, universityId, user, password, birthdate);
       this.career = career;
       this.level = level;
       this.subject = subject;
    }
    
    public Student() {      
    }
    
    public Document getDocumentStudent(Student student){
        
        Document document = new Document();
        document.put("name", student.getName());
        document.put("lastName", student.getLastName());
        document.put("identification", student.getIdentification());
        document.put("gender", student.getGender());
        document.put("phone", student.getPhone());
        document.put("address", student.getAddress());
        document.put("personalMail", student.getPersonalMail());
        document.put("bloodType", student.getBloodType());
        document.put("academicRole", student.getAcademicRole());
        document.put("universityId", student.getUniversityId());
        document.put("user", student.getUser());
        document.put("password", student.getPassword());
        document.put("birthDate", student.getBirthdate());
        document.put("career", student.getCareer());
        document.put("level", student.getLevel());
        
        // Convertir la lista de Subject a un formato adecuado para el documento
        List<Document> subject = new ArrayList<>();
        for (Subject sub : student.getSubject()) {
            Document subjectDocument = new Document();
            subjectDocument.put("nameSubject", sub.getNameSubject());
            subjectDocument.put("notes", sub.getNotes());
            subject.add(subjectDocument);
        }
        
        document.put("subjects", subject);
        
        return document;
    }
    
    public Type getType() {
        Type type = new TypeToken<List<Student>>(){}.getType();       
        return type;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }   
    
}
