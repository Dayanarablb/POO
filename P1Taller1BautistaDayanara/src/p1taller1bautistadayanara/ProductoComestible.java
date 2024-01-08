/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1taller1bautistadayanara;

/**
 *
 * @author ESPE
 */
public class ProductoComestible extends Productos{
    String sabor;

    public ProductoComestible(String sabor) {
        this.sabor = sabor;
    }
    
    public ProductoComestible(){
        
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
      
}
