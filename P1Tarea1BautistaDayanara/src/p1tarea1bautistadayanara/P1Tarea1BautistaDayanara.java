
package p1tarea1bautistadayanara;

import java.util.Scanner;

/**
 * Nombre: Dayanara Bautista
 * Fecha: 08/11/2023
 * Programacion Orientada a Objetos
 * 
 */
public class P1Tarea1BautistaDayanara {

    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);
    
    String nombre;
    String apellido;
    int edad;
    String carrera;
    float nota1;
    float nota2;
    float nota3;
    float promedio;
    float suma; 
    
    System.out.println("Ingrese sus Datos personales");
    
    System.out.println("Nombre: ");
    nombre = sc.nextLine();
    System.out.println("Apellido: ");
    apellido = sc.nextLine();
    System.out.println("Edad: ");
    apellido = sc.nextLine();
    System.out.println("Carrera: ");
    apellido = sc.nextLine();
    
    System.out.println("Ingrese notas que esten en el rango de 0 a 20");
    
    System.out.println("Ingrese la nota 1: ");
    nota1 = sc.nextFloat();
    System.out.println("Ingrese la nota 2: ");
    nota2 = sc.nextFloat();
    System.out.println("Ingrese la nota 3: ");
    nota3 = sc.nextFloat();
    if (nota1 >= 0 && nota1 <= 20 && nota2 >= 0 && nota2 <= 20 && nota3 >= 0 && nota3 <= 20) {
            System.out.println("Las Notas estan en el Rango de 0 - 20");
        } else {
            System.out.println("Intentelo nuevamente");
        }
    //Operacion para sacar el promedio de las notas
    suma = nota1+nota2+nota3;
    promedio = suma/3;
    System.out.println("Su promedio es: "+promedio);
    //Ahora utilizare un condicional para saber si el estudiatea aprobo o reprobo 
    
    if (promedio>=14 && promedio<=20){
        System.out.println("Usted esta Aprobado!");
    }else{
         System.out.println("Usted esta Reprobado!");   
        
    }
 
    }
    
}
    

