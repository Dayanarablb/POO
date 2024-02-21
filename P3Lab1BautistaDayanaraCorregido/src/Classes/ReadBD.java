
package Classes;

import Connection.connection;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ESPE
 */
public class ReadBD {
    
    connection c = new connection();;
    DB db;
    DBCollection colec;
    
    public ReadBD(){
        
    }
    public List<String> ProductsAgregados(){
        c.createConnection();
        db = c.getDatabase();
        colec = db.getCollection("PescaBautista");
        fishing fi = new fishing();
        List<String> productos = new ArrayList();
        DBCursor cursor = colec.find();

            while (cursor.hasNext()) {
                BasicDBObject obj = (BasicDBObject) cursor.next();
               
                String code =  obj.getString("Codigo");
                String Especie = obj.getString("Especie"); 
                int cantidad = obj.getInt("Cantidad");
                String data =   obj.getString("Fecha de Pesca");
                String estado = obj.getString("Estado");
                double precio = obj.getDouble("Precio");                        
                String conservacion = obj.getString("Espacio de Conservacion");
                String bodega = obj.getString("Bodega Refrigerada");
                String tmp = obj.getString("Temperatura");
                
                productos.add(Especie);                               
            }
            return productos;
        
    }  
}
