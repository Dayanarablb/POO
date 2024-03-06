/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoexamenpoo.Singleton;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Conexion {
    
    public static Conexion instanciaUnica;
    MongoClient mongo;
    MongoDatabase db;
    MongoCollection <Document> dc;
    
    
    private Conexion(){
        
        this.mongo = new MongoClient("localhost",27017);
        this.db = mongo.getDatabase("ExamenP3");  
        this.dc = db.getCollection("Transacciones");
           
    }
    
    public static Conexion UnicaInstancia (){   
       if(instanciaUnica==null){
           
           return new Conexion();    
       }
       return instanciaUnica;
    }
    
    public MongoCollection <Document> getConexion(){        
        return dc;     
    }
    
}
