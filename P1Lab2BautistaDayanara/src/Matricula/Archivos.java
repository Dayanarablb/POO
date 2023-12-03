
package Matricula;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Archivos {
// Constructor Vacio
    public Archivos() {
    }
    //Llamamos a la clase File
    File studentFile;
    File teachersFile;
    
    public void crearArchivoDeTextoEstudiantes(){
        studentFile = new File ("Estudiantes.txt");
        try{
            if(studentFile.createNewFile()){ // createNewFile---------> crea nuevo archivo
                System.out.println("Archivo.txt creado con exito...");
            }
            else{
                System.out.println("Error al crear archivo.txt"); 
            }     
        }catch(IOException excepcion){
            excepcion.printStackTrace(System.out);   
        }       
    }
    private void eliminarArchivoDeTextoEstudiantes(){
            if(studentFile.delete()){ // delete ------> elimina el archivo
                System.out.println("Archivo.txt eliminado con exito...");
            }
            else{
                System.out.println("Error al eliminar archivo.txt"); 
        }     
    }
    
    //Metodo para escribir en el archivo de texto 
    public void escribirArchivoDeTextoEstudiantes(Estudiante estudiante){

        try{
            FileWriter escritura = new FileWriter(studentFile, true);//true para que no se borre nada
            escritura.write("================ REGISTRO DE ESTUDIANTES ===============");
             escritura.write("\nID: "+estudiante.getId());
            escritura.write("\nNombres: "+estudiante.getNombres());
            escritura.write("\nApellidos: "+estudiante.getApellidos());
            escritura.write("\nCI: "+estudiante.getCedula());
            escritura.write("\nTelefono: "+estudiante.getTelefono());
            escritura.write("\nDireccion: "+estudiante.getDireccion());
            escritura.write("\nCarrera: "+estudiante.getCarrera());
            escritura.write("\nNivel: "+estudiante.getNivel());
            
            escritura.close();
            System.out.println("Datos escritos con exito en Archivo.txt!");
        }catch(IOException excepcion){
            excepcion.printStackTrace(System.out);    
        } 
    }
    //Metodo para leer el archivo de texto desde Java
    public void leerArchivoDeTextoEstudiantes(){
        //para leer un archivo de texto usamos la clase FileReader
        try{
            String contenido;//En esta variable voy a guardar lo que voy a leer en mi archivo de texto
            FileReader lector = new FileReader(studentFile);//Indicamos el archivo que vamos a leer "archivo"
        //Aplicamos la clase BufferedReader para leer lo que contiene el archivo de texto
        BufferedReader lectura = new BufferedReader(lector);//Pasamos el archivo a leer
        //Buffer ---> memoria temporal
        contenido = lectura.readLine();
        while(contenido !=null){ // mientras el contenido sea diferente de nulo se imprimira la cadena y se va a seguir leyendo la siguiente linea
            System.out.println(contenido);
            contenido = lectura.readLine();
        }
        System.out.println(contenido);
        }catch(IOException excepcion){
           excepcion.printStackTrace(System.out);   
           System.out.println("Datos Leidos con exito en Archivo.txt!"); 
        }   
    }
    
    public static int obtenerIDDesdeUsuario() {
        
        Scanner scanner = new Scanner(System.in);
        int idIngresado = 0;

        System.out.print("Ingrese el ID del estudiante que desea buscar: ");
        while (true) {
            try {
                idIngresado = Integer.parseInt(scanner.nextLine());
                if (String.valueOf(idIngresado).length() == 5) {
                    break;
                } else {
                    System.out.println("Por favor, ingrese un ID de 5 dígitos.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }

        return idIngresado;
    }
    public void buscarIdEstudianteRegistrado(int idBuscar) {
        try (BufferedReader lectura = new BufferedReader(new FileReader(studentFile))) {
            String linea;
            boolean encontrado = false;

            while ((linea = lectura.readLine()) != null) {
                if (linea.contains("ID: " + idBuscar)) {
                    System.out.println("Estudiante encontrado:");

                    // Muestra todas las líneas del bloque asociado al estudiante
                    while ((linea = lectura.readLine()) != null && !linea.trim().isEmpty()) {
                        System.out.println(linea);
                    }

                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Estudiante con ID " + idBuscar + " no encontrado.");
            }
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
        }
    }
    public static void escribirArchivoJsonProfesor(Profesor profesor) throws IOException {
        
        try (JsonWriter writer = new JsonWriter(new FileWriter("Profesores.json", true))) {
            System.out.println("Archivo.json creado con exito!");

            writer.setIndent("   ");
            Gson jsonString = new GsonBuilder().setPrettyPrinting().create();
            jsonString.toJson(profesor, Profesor.class, writer);          
        }
    }
     public static void leerArchivoJsonProfesor() throws FileNotFoundException, IOException{
        File archivo = new File("Profesores.json");
        if(archivo.exists()){
            StringBuilder stringBuilder;
            try (BufferedReader reader = new BufferedReader(new FileReader("Profesores.json"))) {
                stringBuilder = new StringBuilder();
                String line;
                String ls = System.getProperty("line.separator");
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                    stringBuilder.append(ls);
                    System.out.println(line);
                }
            }
        }   
    }
    }
    



    
    
       

       
        
        
    
    
       

