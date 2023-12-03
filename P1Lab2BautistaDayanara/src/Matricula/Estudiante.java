package Matricula;

import java.util.Scanner;

/**
 * @author Dayanara Bautista
 * Laboratorio 2 de Programacion Orientada a Objetos
 * Sistema de Matriculas Estudiantes
 */
public class Estudiante extends Persona { //Clase Hija
    // Atributos propios 
    String carrera;
    String nivel;
    double costoMatricula = 0;
    
    //Constructor
    public Estudiante( int id, String nombres, String apellidos, Long cedula, Long telefono, String Direccion, String carrera, String nivel, double costoMatricula) {
        super(id, nombres, apellidos, cedula, telefono, Direccion);
        this.carrera = carrera;
        this.nivel = nivel;
        this.costoMatricula = costoMatricula;

    }
    //  Metodos Getters and Setters
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public double getCostoMatricula() {
        return costoMatricula;
    }
    public void setCostoMatricula(double costoMatricula) {
        this.costoMatricula = costoMatricula;
    }
    
    @Override
    public void MostrarInformacion(){
        super.MostrarInformacion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Carrera:");
        setCarrera(sc.nextLine());

        System.out.println("Nivel:");
        setNivel(sc.nextLine());
 
    }  
        
    public void matricularse() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("U N I V E R S I D A D   D E   L A S   F U E R Z A S    A M A D A S " + "     E S P E ");
    System.out.println("    B I E N V E N I D O    A L    P R O C E S O    D E    M A T R I C U L A   ");
    
    do {
            System.out.println("ID: ");
            setId(scanner.nextInt());
            if (getId() < 0 || getId() < 10000 || getId() > 99999) {
                System.out.println("Error! ID incorrecto, vuelva a ingresar");
            }
        } while (getId() < 0 || getId() < 10000 || getId() > 99999);

        scanner.nextLine();
    
    System.out.println("Nombres: " );
    setNombres(scanner.nextLine());
    //scanner.nextLine();


    System.out.println("Apellidos: ");
    setApellidos(scanner.nextLine());
    
    do{
                System.out.print("Cedula: ");
                while(!scanner.hasNextLong()){
                    System.out.println("Numero de cedula incorrecto, intentelo de nuevo");
                    System.out.println("Numero de cedula: ");
                    scanner.next();
                }
                setCedula(scanner.nextLong());
                if(String.valueOf(cedula).length() != 10){
                    System.out.println("Numero de cedula incorrecto, intentelo de nuevo");
                }

            }while(String.valueOf(cedula).length() != 10);
        
        //Numero de telefono
            do{
                System.out.println("Escribir tu numero apartir del 0");
                System.out.print("Numero de celular: ");
                while(!scanner.hasNextInt()){
                    System.out.println("Numero de celular incorrecto, intentelo de nuevo");
                     System.out.println("Escribir tu numero apartir del 0");
                    System.out.print("Numero de celular: ");
                    scanner.nextLine();
                }
                telefono = scanner.nextInt();
                if(String.valueOf(telefono).length() != 9 || !String.valueOf(telefono).startsWith("9")){
                    System.out.println("Numero de celular incorrecto, intentelo de nuevo");
                }

            }while(String.valueOf(telefono).length() != 9 || !String.valueOf(telefono).startsWith("9"));
        scanner.nextLine();
    
    System.out.println("Direccion: ");
    setDireccion(scanner.nextLine());


    System.out.println("Carrera: ");
    setCarrera(scanner.nextLine());

    System.out.println("Nivel: ");
    setNivel(scanner.nextLine());

    System.out.println("Ingrese en cuantas materias desea matricularse: ");
    int cantidadMaterias = scanner.nextInt();

    // Arreglos para almacenar la información de cada materia
    String[] nombresMaterias = new String[cantidadMaterias];
    int[] nrcMaterias = new int[cantidadMaterias];
    int[] creditosMaterias = new int[cantidadMaterias];

    // Matriculación en cada materia
    for (int i = 0; i < cantidadMaterias; i++) {
        System.out.println("\nIngrese la información para la materia " + (i + 1));

        System.out.println("Nombre de la materia: ");
        scanner.nextLine();  // Limpiar el buffer del scanner
        nombresMaterias[i] = scanner.nextLine();
        int nrc;

        do {
            
            System.out.println("NRC : ");
            nrc = scanner.nextInt();
            if (nrc < 0 || nrc < 10000 || nrc > 99999) {
                System.out.println("Error! ID incorrecto, vuelva a ingresar");
            }
          
        } while (nrc < 0 || nrc < 10000 || nrc > 99999);

        scanner.nextLine();

        System.out.println("Créditos de la materia: ");
        creditosMaterias[i] = scanner.nextInt();
        while (creditosMaterias[i] < 4 || creditosMaterias[i] > 6) {
            System.out.println("Error! Los créditos deben ser entre 4 y 6.");
            System.out.println("Créditos de la materia: ");
            creditosMaterias[i] = scanner.nextInt();
        }
    }

    // Calcular costo de matrícula e imprimir resumen
    System.out.println("\nResumen de Matrícula para " + getNombres() + " " + getApellidos());
    for (int i = 0; i < cantidadMaterias; i++) {
        // Calculo del costo por crédito
        double costoPorCredito = creditosMaterias[i] * 17.25;
        // Costo total de la materia incluyendo $10 adicionales que se paga por materia
        double costoMateria = costoPorCredito + 10;
        costoMatricula += costoMateria;

        // Imprimir información de la materia
        System.out.println("Materia " + (i + 1) + ": " + nombresMaterias[i] +
                " (NRC: " + nrcMaterias[i] + ", Créditos: " + creditosMaterias[i] +
                ", Costo: $" + costoMateria + ")");
    }
    System.out.println("\nCosto de matrícula por créditos: $" + costoMatricula);

   
}
}