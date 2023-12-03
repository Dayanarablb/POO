
package Matricula;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ManejoEstudiantes {
    private List<Estudiante> estudiantes1;

    public ManejoEstudiantes() {
        this.estudiantes1 = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante1) {
        this.estudiantes1.add(estudiante1);
    }

    public void escribirArchivoCSV(Estudiante estudiante1) {
        String salidaArchivo = "Matricula.csv";

        // Eliminar archivo existente
        File archivoEstudiantes = new File(salidaArchivo);
        if (archivoEstudiantes.exists()) {
            archivoEstudiantes.delete();
        }

        try {
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');

            salidaCSV.write("ID");
            salidaCSV.write("Nombres");
            salidaCSV.write("Apellidos");
            salidaCSV.write("Cedula");
            salidaCSV.write("Telefono");
            salidaCSV.write("Direccion");
            salidaCSV.write("Carrera");
            salidaCSV.write("Nivel");
            salidaCSV.write("Costo Matricula");

            salidaCSV.endRecord();

            for (Estudiante estudiante : this.estudiantes1) {
                salidaCSV.write(String.valueOf(estudiante.getId()));
                salidaCSV.write(estudiante.getNombres());
                salidaCSV.write(estudiante.getApellidos());
                salidaCSV.write(String.valueOf(estudiante.getCedula()));
                salidaCSV.write(String.valueOf(estudiante.getTelefono()));
                salidaCSV.write(estudiante.getDireccion());
                salidaCSV.write(estudiante.getCarrera());
                salidaCSV.write(estudiante.getNivel());
                salidaCSV.write(String.valueOf(estudiante.getCostoMatricula()));

                salidaCSV.endRecord();
            }

            salidaCSV.close();
            System.out.println("Datos exportados con éxito a Matricula.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Estudiante> leerArchivoCSV(Estudiante estudiante1) {
    List<Estudiante> estudiantes1 = new ArrayList<>();

    try {
        CsvReader leerEstudiantes = new CsvReader("Matricula.csv");
        leerEstudiantes.readHeaders();
        

        while (leerEstudiantes.readRecord()) {
    int id1 = Integer.parseInt(leerEstudiantes.get(0));
    String nombres = leerEstudiantes.get(1);
    String apellidos = leerEstudiantes.get(2);

    // Tratamiento de la cédula
    long cedula1;
    try {
        cedula1 = Long.parseLong(leerEstudiantes.get(3));
    } catch (NumberFormatException e) {
        System.out.println("Error al convertir la cédula en la línea " + leerEstudiantes.getCurrentRecord() + ": " + e.getMessage());
        continue; // Salta a la siguiente iteración del bucle
    }

    long telefono = Long.parseLong(leerEstudiantes.get(4));
    String direccion = leerEstudiantes.get(5);
    String carrera = leerEstudiantes.get(6);
    String nivel = leerEstudiantes.get(7);
    double costoMatricula = Double.parseDouble(leerEstudiantes.get(8));

    Estudiante estudiante = new Estudiante(id1, nombres, apellidos, cedula1, telefono, direccion, carrera, nivel, costoMatricula);
    estudiantes1.add(estudiante);
}
        

        leerEstudiantes.close();
        System.out.println("Datos importados con éxito desde Estudiantes.csv");
    } catch (FileNotFoundException e) {
        System.out.println("El archivo Estudiantes.csv no existe.");
    } catch (IOException | NumberFormatException e) {
        e.printStackTrace();
    }

    return estudiantes1;
}
}
    

