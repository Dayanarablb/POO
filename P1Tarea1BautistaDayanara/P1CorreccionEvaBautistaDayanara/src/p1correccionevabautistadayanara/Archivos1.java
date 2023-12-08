
package p1correccionevabautistadayanara;

import java.io.FileWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos1 {

    public Archivos1() {
        
            
    }
    public void escribirArchivoJsonProfesor(Profesor profesor) throws IOException {      
        try (JsonWriter writer = new JsonWriter(new FileWriter("Profesores.json", true))) {
            System.out.println("Archivo.json creado con exito!");

            writer.setIndent("   ");
            Gson jsonString = new GsonBuilder().setPrettyPrinting().create();
            jsonString.toJson(profesor, Profesor.class, writer);          
        }
    }
     public void leerArchivoJsonProfesor() throws FileNotFoundException, IOException{
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
  public void escribirArchivoCSV(Estudiante estudiante) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos.csv", true))) {
        // Agregar datos al final del archivo (true indica modo append)
        if (new File("datos.csv").length() == 0) {
            // Si el archivo está vacío, escribir encabezados
            writer.write("Nombre,Cedula,Telefono,Direccion,Nivel,Carrera,Costo Matricula\n");
        }

        // Escribir datos
        writer.write(estudiante.getNombre() + "," + estudiante.getCedula() + "," + estudiante.getTelefono() +
                "," + estudiante.getDireccion() + "," + estudiante.getNivel() + "," + estudiante.getCarrera() +
                "," + estudiante.getCostoMatricula() + "\n");

        System.out.println("Archivo CSV actualizado con éxito!");
    } catch (IOException e) {
        e.printStackTrace();
    }
}

public void leerArchivoCSV() {
    try (BufferedReader reader = new BufferedReader(new FileReader("datos.csv"))) {
        String linea;

        // Leer encabezados
        System.out.println("Encabezados: " + reader.readLine());

        // Leer datos
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            Estudiante estudiante = new Estudiante("","",0.0, "", 0L, 0L, "");

            estudiante.setNombre(datos[0]);
            estudiante.setCedula(Long.parseLong(datos[1]));
            estudiante.setTelefono(Long.parseLong(datos[2]));
            estudiante.setDireccion(datos[3]);
            estudiante.setNivel(datos[4]);
            estudiante.setCarrera(datos[5]);
            estudiante.setCostoMatricula(Double.parseDouble(datos[6]));
            System.out.println(estudiante);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

  }

    


