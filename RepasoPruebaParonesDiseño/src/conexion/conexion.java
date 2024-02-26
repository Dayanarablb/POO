/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import javax.swing.JOptionPane;

/**
 *
 * @author EFRAIN
 */
public class conexion {
    //Instancia unica
    private static conexion instanciaUnica;//Instancia unica
    private DB db;
    private MongoClient mongo;
    
    
    private conexion(){ //Privado para no tener acceso a este constructor
        
        mongo = crearConexion();
        
    }
    //Metodo que proporciona acceso a la unica instancia
    public static conexion unicaInstancia(){
    
    //Si la instancia aun no exite se crea de los contrario se devuelve la instancia existente
        if(instanciaUnica == null){
            instanciaUnica = new conexion();//vamos a obtener esta instancia
        }
        return instanciaUnica;
       
    }
    private  MongoClient crearConexion(){
        
        try{
            MongoClient mongo = new MongoClient("localhost",27017);
            db = mongo.getDB("BasePrueba3");
            return mongo;
        }catch(MongoException e){
            JOptionPane.showMessageDialog(null, "Error de Conexion" + e.getMessage());
            e.printStackTrace();
            return null;
        }       
    } 
    public DB getDatabase() {
        return db;
    }
    
}
    

 
        
        
   
