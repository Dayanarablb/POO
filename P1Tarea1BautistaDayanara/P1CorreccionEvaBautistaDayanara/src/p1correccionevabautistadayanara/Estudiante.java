
package p1correccionevabautistadayanara;

import java.util.Scanner;

/**
 *
 * @author DAYANARA
 */
public class Estudiante extends Persona {
    
    String Carrera;
    String nivel;
    double costoMatricula;

    public Estudiante(String Carrera, String nivel, double costoMatricula, String nombre, Long cedula, Long telefono, String direccion) {
        super(nombre, cedula, telefono, direccion);
        this.Carrera = Carrera;
        this.nivel = nivel;
        this.costoMatricula = costoMatricula;
    }
    public String getCarrera() {
        return Carrera;
    }
    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
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

    public void matricularse(){
    Scanner sc = new Scanner (System.in); 
    System.out.println("U N I V E R S I D A D   D E   L A S   F U E R Z A S    A M A D A S " + "     E S P E ");
    System.out.println("    B I E N V E N I D O    A L    P R O C E S O    D E    M A T R I C U L A   ");
    super.mostrarInformacion();
    System.out.println("Carrera: ");
    Carrera = sc.nextLine();
    System.out.println("Nivel: ");
    Carrera = sc.nextLine();
    System.out.println("Nombre: "+getNombre());
    System.out.println("Cedula: "+getCedula());
     System.out.println("Ingrese en cuantas materias desea matricularse: ");
    int cantidadMaterias = sc.nextInt();
    // Arreglos para almacenar la información de cada materia
    String[] nombresMaterias = new String[cantidadMaterias];
    int[] creditosMaterias = new int[cantidadMaterias];
    // Matricula en cada materia
    for (int i = 0; i < cantidadMaterias; i++) {
        System.out.println("\nIngrese la información para la materia " + (i + 1));
        System.out.println("Nombre de la materia: ");
        sc.nextLine();  // Limpiar el buffer del scanner
        nombresMaterias[i] = sc.nextLine();
       
        System.out.println("Créditos de la materia: ");//Validacion de los creditos de la materia
        creditosMaterias[i] = sc.nextInt();
        while (creditosMaterias[i] < 4 || creditosMaterias[i] > 6) {
            System.out.println("Error! Los créditos deben ser entre 4 y 6.");
            System.out.println("Créditos de la materia: ");
            creditosMaterias[i] = sc.nextInt();
        }
    }
    // Calcular costo de matricula e imprimir resumen
    System.out.println("\nResumen de Matrícula para " + getNombre());
    for (int i = 0; i < cantidadMaterias; i++) {
        // Calculo del costo por crédito
        double costoPorCredito = creditosMaterias[i] * 17.25;
        // Costo total de la materia incluyendo $10 adicionales que se paga por materia
        double costoMateria = costoPorCredito + 10;
        costoMatricula += costoMateria;
       // Imprimir informacion de la materia
        System.out.println("Materia " + (i + 1) + ": " + nombresMaterias[i] +
                ", Créditos: " + creditosMaterias[i] +
                ", Costo: $" + costoMateria + ")");
    }
    System.out.println("\nCosto de matrícula por créditos: $" + costoMatricula);
}}
    
    
