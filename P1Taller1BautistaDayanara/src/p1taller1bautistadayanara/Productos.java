/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1taller1bautistadayanara;

/**
 *
 * @author ESPE
 */
public class Productos {
    
    String nombreProducto;
    String precios;
    String FechaCaducidad;

    public Productos(String nombreProducto, String precios, String FechaCaducidad) {
        this.nombreProducto = nombreProducto;
        this.precios = precios;
        this.FechaCaducidad = FechaCaducidad;
    }   
    public Productos(){
        
    }
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getPrecios() {
        return precios;
    }

    public void setPrecios(String precios) {
        this.precios = precios;
    }

    public String getFechaCaducidad() {
        return FechaCaducidad;
    }

    public void setFechaCaducidad(String FechaCaducidad) {
        this.FechaCaducidad = FechaCaducidad;
    }
       
}
