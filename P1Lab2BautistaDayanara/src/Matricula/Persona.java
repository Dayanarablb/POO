package Matricula;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dayanara Bautista
 * Laboratorio 2 de Programacion Orientada a Objetos
 * Sistema de Matriculas Estudiantes
 */
public class Persona { //Clase Padre
    //Atributos propios de la clase persona
    private int id;
    private String nombres;
    private String apellidos;
    long cedula;
    long telefono;
    private String direccion;
    
    //Constructor ----> Inicializa los atributos de la clase

    public Persona(int id, String nombres, String apellidos, Long cedula, Long telefono, String direccion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
    }  
    //Metodos Getters and Setters
    public int getId() { // Get permite obtener el valor actual del atributo id
        return id;      // Acceso de solo lectura a un atributo
    }

    public void setId(int id) { //Set permite asignar valores a los atributos 
        this.id = id;          // Acceso de escritura a un atributo
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String Direccion) {
        this.direccion = Direccion;
    }
    public void MostrarInformacion(){
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese su ID (debe tener 5 dígitos y ser positivo):");
            setId(sc.nextInt());
            if (getId() < 0 || getId() < 10000 || getId() > 99999) {
                System.out.println("Error! ID incorrecto, vuelva a ingresar");
            }
        } while (getId() < 0 || getId() < 10000 || getId() > 99999);

        sc.nextLine(); // Limpiar el buffer
       

        System.out.println("Ingrese sus Nombres:");
        setNombres(sc.nextLine());

        System.out.println("Ingrese sus Apellidos:");
        setApellidos(sc.nextLine());

        do{
                System.out.print("Numero de Cedula: ");
                while(!sc.hasNextLong()){
                    System.out.println("Numero de cedula incorrecto, intentelo de nuevo");
                    System.out.println("Numero de cedula: ");
                    sc.next();
                }
                cedula = sc.nextLong();
                if(String.valueOf(cedula).length() != 10){
                    System.out.println("Numero de cedula incorrecto, intentelo de nuevo");
                }

            }while(String.valueOf(cedula).length() != 10);
        
        //Numero de telefono
            do{
                System.out.println("Escribir tu numero apartir del 0");
                System.out.print("Numero de celular: ");
                while(!sc.hasNextInt()){
                    System.out.println("Numero de celular incorrecto, intentelo de nuevo");
                     System.out.println("Escribir tu numero apartir del 0");
                    System.out.print("Numero de celular: ");
                    sc.nextLine();
                }
                telefono = sc.nextInt();
                if(String.valueOf(telefono).length() != 9 || !String.valueOf(telefono).startsWith("9")){
                    System.out.println("Numero de celular incorrecto, intentelo de nuevo");
                }

            }while(String.valueOf(telefono).length() != 9 || !String.valueOf(telefono).startsWith("9"));
        sc.nextLine();
        System.out.println("Ingrese su Dirección:");
        setDireccion(sc.nextLine());  
        
        
        }
    }
    
        
    
    
      

