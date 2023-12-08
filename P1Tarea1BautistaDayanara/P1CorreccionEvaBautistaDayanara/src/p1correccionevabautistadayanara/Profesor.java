
package p1correccionevabautistadayanara;

import java.util.Scanner;

public class Profesor extends Persona {
    String Departamento;
    String TituloAcademico;

    public Profesor(String Departamento, String TituloAcademico, String nombre, Long cedula, Long telefono, String direccion) {
        super(nombre, cedula, telefono, direccion);
        this.Departamento = Departamento;
        this.TituloAcademico = TituloAcademico;
    }
    public String getDepartamento() {
        return Departamento;
    }
    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }
    public String getTituloAcademico() {
        return TituloAcademico;
    }
    public void setTituloAcademico(String TituloAcademico) {
        this.TituloAcademico = TituloAcademico;
    }
    @Override
    public void mostrarInformacion(){
        Scanner sc = new Scanner(System.in);
        super.mostrarInformacion(); 
        System.out.println("Departamento: ");
        setDepartamento(sc.nextLine());
        System.out.println("Titulo Academico: ");
        setTituloAcademico(sc.nextLine());
        
        System.out.println("Departamento: "+getDepartamento());
        System.out.println("Titulo Academico: "+getTituloAcademico());
        
        
    }
    
}
