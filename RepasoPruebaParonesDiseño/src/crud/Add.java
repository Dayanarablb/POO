/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import conexion.conexion;

/**
 *
 * @author EFRAIN
 */
public class Add {
    
    
    public void AddDocument(String Name){
        conexion c = conexion.unicaInstancia();
        BasicDBObject doc = new BasicDBObject();
        DBCollection colect = c.getDatabase().getCollection("Registro");
        
        doc.put("Nombre", Name);
        colect.insert(doc);
               
    }
    
    
}
