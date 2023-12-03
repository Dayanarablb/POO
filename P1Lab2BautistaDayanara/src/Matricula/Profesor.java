
package Matricula;

import java.util.Scanner;

/**
 * @author Dayanara Bautista
 * Laboratorio 2 de Programacion Orientada a Objetos
 * Sistema de Matriculas Estudiantes
 */
public class Profesor extends Persona { //Clase Hija
    
    String departamento;
    String tituloAcademico;
    
    //Constructor

    public Profesor(int id, String nombres, String apellidos, Long cedula, Long telefono, String Direccion, String departamento, String tituloAcademico) {
        super(id, nombres, apellidos, cedula, telefono, Direccion);
        this.departamento = departamento;
        this.tituloAcademico = tituloAcademico;
    }
    //Metodos Getters and Setters

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }
    public void prepararMaterialDidactico(){
        System.out.println("Preparando material didactico...");
        
    }
    @Override
    public void MostrarInformacion(){
        super.MostrarInformacion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Departamento:");
        setDepartamento(sc.nextLine());

        System.out.println("Titulo Academico:");
        setTituloAcademico(sc.nextLine());
    }
    
}
