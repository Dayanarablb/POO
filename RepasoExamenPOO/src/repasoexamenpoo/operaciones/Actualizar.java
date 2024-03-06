/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoexamenpoo.operaciones;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import repasoexamenpoo.Singleton.Conexion;

/**
 *
 * @author EFRAIN
 */
public class Actualizar {
    Conexion c;
    MongoCollection <Document> collection;
    Cliente client; 

    public Actualizar() {
         
        this.c = Conexion.UnicaInstancia();
        this.collection = c.getConexion(); 
        
    }
    public void ActualizarMongo(Document antiguo, Document nuevo){
        
        Document update = new Document ("$set",new Document(nuevo));
        collection.updateOne(antiguo, update);
 
    }
 
}
