package p1correccionevabautistadayanara;

import java.util.Scanner;

/**
 *
 * @author Dayanara Bautista
 */
public class Persona {//Clase padre
    //ATRIBUTOS
    String nombre;
    private Long cedula;
    Long telefono;
    String direccion;
    //Constructor
    public Persona(String nombre, Long cedula, Long telefono, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    //Metodos Getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public void mostrarInformacion(){     
        Scanner sc = new Scanner (System.in);
       
        do {
            System.out.println("Ingrese su nombre (debe comenzar con una letra mayúscula y no contener números): ");
            nombre = sc.nextLine();

            // Verificar que el usuario ingrese un nombre que comienza con una letra mayúscula y no contiene números
            if (!nombre.matches("^[A-Z][a-z]*$")) {
                System.out.println("Error! Ingrese un nombre válido que comience con una letra mayúscula y no contenga números.");
            }
        } while (!nombre.matches("^[A-Z][a-z]*$"));
        
        do{
                System.out.print("Cedula: ");
                while(!sc.hasNextLong()){
                    System.out.println("Numero de cedula incorrecto, intentelo de nuevo");
                    System.out.println("Numero de cedula: ");
                    sc.next();
                }
                cedula =sc.nextLong();
                if(String.valueOf(cedula).length() != 10){
                    System.out.println("Numero de cedula incorrecto, intentelo de nuevo");
                }
            }while(String.valueOf(cedula).length() != 10); 

  
        //Validacion de Numero de telefono
            do{
                System.out.println("Escribir tu numero apartir del 0");
                System.out.print("Numero de celular: ");
                while(!sc.hasNextInt()){
                    System.out.println("Numero de celular incorrecto, intentelo de nuevo");
                     System.out.println("Escribir tu numero apartir del 0");
                    System.out.print("Numero de celular: ");
                    sc.nextLine();
                }
                telefono = sc.nextLong();
                if(String.valueOf(telefono).length() != 9 || !String.valueOf(telefono).startsWith("9")){
                    System.out.println("Numero de celular incorrecto, intentelo de nuevo");
                }
            }while(String.valueOf(telefono).length() != 9 || !String.valueOf(telefono).startsWith("9"));
        sc.nextLine(); 
        //Validacion de Direccion
        //Validacion del nombre 
        do{
          System.out.println("Direccion: "); 
          direccion = sc.nextLine();
          //Verifico que el usuario solo ingrese letras
          if(!nombre.matches("^[A-Z][a-z]*$")){ //Si es diferente de nombres....
              
              System.out.println("Vuelva a ingresar la Direccion comenzando con Mayuscula: ");
          }
        }while(!nombre.matches("^[A-Z][a-z]*$"));  
       
        System.out.println("Nombre: "+getNombre());
        System.out.println("Cedula: "+getCedula());
        System.out.println("Telefono: "+getTelefono());
        System.out.println("Direccion: "+getDireccion());
        

    }
    
    
}
