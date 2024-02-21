
package Classes;
import Connection.connection;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class fishingBoat {
      
    connection c = new connection();
    private Gson gson = new Gson();

    public void showFishData(JTable table) {
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Especie");
        model.addColumn("Cantidad");
        model.addColumn("Fecha de Pesca");
        model.addColumn("Estado");
        model.addColumn("Precio");
        model.addColumn("Espacio de Conservacion");
        model.addColumn("Bodega Refrigerada");
        model.addColumn("Temperatura");
        
          try {
            c.createConnection();
            DBCollection colec = c.getDatabase().getCollection("PescaBautista");
            DBCursor cursor = colec.find();
  

            while (cursor.hasNext()) {
                BasicDBObject obj = (BasicDBObject) cursor.next();
                model.addRow(new Object[]{
                    obj.getString("Codigo"),
                    obj.getString("Especie"),
                    obj.getInt("Cantidad"),
                    obj.getString("Fecha de Pesca"),
                    obj.getString("Estado"),
                    obj.getDouble("Precio"),
                    obj.getString("Espacio de Conservacion"),
                    obj.getString("Bodega Refrigerada"),
                    obj.getString("Temperatura")
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }                     
        table.setModel(model);
    }
  
    public void showTransportationData(JTable table1) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Especie Trasportada");
        model.addColumn("Nombre del Barco");
        model.addColumn("Numero de Registro");
        model.addColumn("Destino");
        model.addColumn("Hora Salida");
        model.addColumn("Hora Llegada");
        model.addColumn("Costo Trasportacion");

        try {
            c.createConnection();
            DBCollection colec = c.getDatabase().getCollection("TrasportacionBautista");
            DBCursor cursor = colec.find();

            while (cursor.hasNext()) {
                BasicDBObject obj = (BasicDBObject) cursor.next();
                model.addRow(new Object[]{
                    obj.getString("Especie Trasportada"),
                    obj.getString("Nombre del Barco"),
                    obj.getString("Numero de Registro"),
                    obj.getString("Destino"),
                    obj.getString("Hora Salida"),
                    obj.getString("Hora Llegada"),
                    obj.getDouble("Costo Trasportacion")
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 

        table1.setModel(model);
    }
    
}

       
    

 