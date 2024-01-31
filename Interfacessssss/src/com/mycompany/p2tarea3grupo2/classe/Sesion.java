
package com.mycompany.p2tarea3grupo2.classe;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Sesion {
    String academicRol;
    String user;
    String password;

    public Sesion(String academicRol, String user, String password) {
        this.academicRol = academicRol;
        this.user = user;
        this.password = password;
    }

    public Sesion() {
    }
    
    public void createFileJson(Sesion list){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("userVerific.json"))){
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String listS = gson.toJson(list);
            writer.write(listS);

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"No se pudo guardar el registro");
        }
    }
    
    public Sesion readFileJson(){
        Sesion sesion = null;       
        File file = new File("userVerific.json");
        if(!file.exists()){
            return null;
        }
        try(BufferedReader read = new BufferedReader(new FileReader("userVerific.json"))) {
            Gson gson = new Gson();
            sesion = gson.fromJson(read,Sesion.class);          
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"No existe el archivo");
        }
        return sesion;
    }

    public String getAcademicRol() {
        return academicRol;
    }

    public void setAcademicRol(String academicRol) {
        this.academicRol = academicRol;
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

    
    
    
}
