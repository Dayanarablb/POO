
package com.mycompany.p2tarea3grupo2.classe;


public class Person {
    
    private String name;
    private String lastName;
    private long identification;
    private String gender;
    private long phone;
    private String address;
    private String personalMail;
    private String bloodType;
    private String academicRole;
    private int universityId;
    private String user;
    private String password;
    private String birthdate;

    public Person(String name, String lastName, long identification, String gender, long phone, String address, String personalMail, String bloodType, String academicRole, int universityId, String user, String password, String birthdate) {
        this.name = name;
        this.lastName = lastName;
        this.identification = identification;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.personalMail = personalMail;
        this.bloodType = bloodType;
        this.academicRole = academicRole;
        this.universityId = universityId;
        this.user = user;
        this.password = password;
        this.birthdate = birthdate;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getIdentification() {
        return identification;
    }

    public void setIdentification(long identification) {
        this.identification = identification;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersonalMail() {
        return personalMail;
    }

    public void setPersonalMail(String personaMail) {
        this.personalMail = personaMail;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getAcademicRole() {
        return academicRole;
    }

    public void setAcademicRole(String academicRole) {
        this.academicRole = academicRole;
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    
}
