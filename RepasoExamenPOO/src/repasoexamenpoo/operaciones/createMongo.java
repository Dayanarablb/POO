/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoexamenpoo.operaciones;

import com.mongodb.client.MongoCollection;
import javax.swing.JOptionPane;
import org.bson.Document;
import repasoexamenpoo.Singleton.Conexion;

/**
 *
 * @author EFRAIN
 */
public class createMongo {
    
    Conexion c;
    MongoCollection <Document> collection;
    
    public createMongo(){
        
        this.c = Conexion.UnicaInstancia();
        this.collection = c.getConexion();
    }
    
    public void addDocument (Document doc){
        
        collection.insertOne(doc);       
        JOptionPane.showMessageDialog(null, "Registro Exitoso");
        
    }
}
