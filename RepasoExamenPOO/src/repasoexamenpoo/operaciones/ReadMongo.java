/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoexamenpoo.operaciones;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import repasoexamenpoo.Singleton.Conexion;

public class ReadMongo {
    Conexion c;
    MongoCollection <Document> collection;
    Cliente client;

    public ReadMongo() {
        this.c = Conexion.UnicaInstancia();
        this.collection = c.getConexion();
        
    }
    
    public List<Cliente> DevuelveLista(){
        List <Cliente> cliente = new ArrayList<>();
        FindIterable <Document> cursor = collection.find();
        
        for (Document d : cursor) {
            
            String nom  = d.getString("Nombre");
            long num = d.getLong("Numero de Cuenta");
            double saldo = d.getDouble("Saldo");
            String c = d.getString("Tipo de Cuenta");
            
            client = new Cliente(nom, num, saldo, c);
            cliente.add(client);      
        }
        return cliente;   
    }
    
      
}
