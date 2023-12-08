package p1correccionevabautistadayanara;

import java.io.IOException;

/**
 *
 * @author Dayanara Bautista
 * Correccion Evaluacion Practica
 */
public class P1CorreccionEvaBautistaDayanara {

    public static void main(String[] args) {
        
        Persona p =new Persona(" ",0L,0L,"" );
        //p.mostrarInformacion();
        
        Profesor pr = new Profesor ("",""," ",0L,0L,"");
        Archivos1 ar = new Archivos1();
        //pr.mostrarInformacion();
        //ar.escribirArchivoJsonProfesor(pr);
        //ar.leerArchivoJsonProfesor();
       /* try {
                        pr.mostrarInformacion();
                        ar.escribirArchivoJsonProfesor(pr);
                        ar.leerArchivoJsonProfesor();
                        //pr.prepararMaterialDidactico();
                        } catch (IOException e) {
                        e.printStackTrace();
                        } */
        Estudiante estudiante = new Estudiante("","",0.0, "", 0L, 0L, "");
        estudiante.matricularse();
        ar.escribirArchivoCSV(estudiante);
        ar.leerArchivoCSV();
    }
    
    
}
