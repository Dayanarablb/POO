/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoexamenpoo.operaciones;

import java.util.List;

/**
 *
 * @author EFRAIN
 */
public class Busqueda {
    
    ReadMongo read;  
    List <Cliente> cliente;
    
    public Cliente getClient(String nombre){
        read = new ReadMongo();
        cliente = read.DevuelveLista();
        for (Cliente c : cliente) {
            
            if(c.getNombre().equals(nombre)){
                return c;
            }
            
        }
      
        return null;
    }
    
}
