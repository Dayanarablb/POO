
package Connection;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import javax.swing.JOptionPane;

// DAYANARA BAUTISTA / LAB 1 / UNIDAD 3 / POO
public class connection {
    
    DB dataBase;
    MongoClient mongo;    
       
    public connection() {
        mongo = createConnection();
    }
    
    public MongoClient createConnection() {
        try {
            if (mongo != null) {
                dataBase = mongo.getDB("BarcoPesqueroBautista");   
            }
            MongoClient mongo = new MongoClient("localhost", 27017);
            return mongo;
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "Error de Conexion" + e.getMessage());
            e.printStackTrace();
            return null;
        }       
    } 
    public DB getDatabase() {
        return dataBase;
    }
    
}

