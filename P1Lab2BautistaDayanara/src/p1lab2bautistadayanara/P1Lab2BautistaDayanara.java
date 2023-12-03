package p1lab2bautistadayanara;
import Matricula.Archivos;
import Matricula.Estudiante;
import Matricula.ManejoEstudiantes;
import Matricula.Profesor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * @author Dayanara Bautista
 * Laboratorio 2 de Programacion Orientada a Objetos
 * Sistema de Matriculas Estudiantes
 */
public class P1Lab2BautistaDayanara {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(0,"","",0L, 0L, "","","",0.0);
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        

        do {
            try {
                System.out.println("----- MENU -----");
                System.out.println("1. Ingresar Informacion - Profesor/Alumnos");
                System.out.println("2. Matricularse");
                System.out.println("3. Salir");
                System.out.print("Selecciona una opcion: ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Error! Debe ingresar un número.");
                    scanner.nextLine();  // Limpiar el buffer del scanner
                }

                opcion = scanner.nextInt();

                if (opcion < 1 || opcion > 3) {
                    System.out.println("Opción no válida. Por favor, elija una opción correcta.");
                    continue;  // Vuelve al inicio del bucle sin limpiar el buffer
                }
                switch (opcion) {
                    case 1:
                        IngresarInformacion(scanner);
                        break;
                    case 2:
                        
                        ManejoEstudiantes manejoEstudiantes = new ManejoEstudiantes();
                        Estudiante estudiante1 = new Estudiante(0,"","",0L, 0L, "","","",0.0);
                        estudiante1.matricularse();
                        manejoEstudiantes.agregarEstudiante(estudiante1);
                        manejoEstudiantes.escribirArchivoCSV(estudiante1);
                        break;
                    case 3:
                         System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elija una opción correcta.");
                        
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error! Debe ingresar un número.");
                scanner.nextLine();  // Limpiar el buffer del scanner para evitar un bucle infinito
            }
        } while (opcion != 3);
    }

    public static void IngresarInformacion(Scanner scanner) {
      Estudiante estudiante = new Estudiante(0,"","",0L, 0L, "","","",0.0);
      Profesor profesor = new Profesor(0,"","",0L, 0L, "","","");
      Archivos archivotxt = new Archivos();
        int opcion;

        do {
            try {
                System.out.println("========Registro Alumnos y Estudiantes=========");
                System.out.println("1. Estudiante");
                System.out.println("2. Profesor");
                System.out.println("3. Buscar Estudiante por ID");
                System.out.println("4. Salir");
                System.out.print("Elija como se desea registrar: ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Error! Debe ingresar un número.");
                    scanner.nextLine();  // Limpiar el buffer del scanner
                }

                opcion = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer del scanner

                switch (opcion) {
                    case 1:
                        estudiante.MostrarInformacion();
                        archivotxt.crearArchivoDeTextoEstudiantes();
                        archivotxt.escribirArchivoDeTextoEstudiantes(estudiante);
                        archivotxt.leerArchivoDeTextoEstudiantes();  
                        break;
                    case 2:
                        try {
                        profesor.MostrarInformacion();
                        archivotxt.escribirArchivoJsonProfesor(profesor);
                        archivotxt.leerArchivoJsonProfesor();
                        profesor.prepararMaterialDidactico();
                        } catch (IOException e) {
                        e.printStackTrace();
                        } 
                
                        break;
                    case 3:
                        int idBuscado = archivotxt.obtenerIDDesdeUsuario(); 
                        archivotxt.buscarIdEstudianteRegistrado(idBuscado);
                        break;
                    case 4:
                        System.out.println("Volviendo al Menu Principal...");
                        break;
                    default:
                        System.out.println("Opción incorrecta. Por favor, elige una opción del 1 al 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error! Debe ingresar un número.");
                scanner.nextLine();  // Limpiar el buffer del scanner para evitar un bucle infinito
                opcion = -1; // Establecer un valor no válido para que el bucle continúe
            } catch (NoSuchElementException e) {
                // Manejar la excepción NoSuchElementException
                System.out.println("Error! No se encontró la línea.");
                break;
            }
        } while (opcion != 4);
    }
}
       