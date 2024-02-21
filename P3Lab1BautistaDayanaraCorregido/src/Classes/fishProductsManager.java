
package Classes;

import Connection.connection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
// DAYANARA BAUTISTA / LAB 1 / UNIDAD 3 / POO

public class fishProductsManager {//GESTOR PRODUCTOS PESQUEROS
    connection c = new connection();
    BasicDBObject documentOrg;

    public void Add(String code,String species,int quantity, String date,String status,double cost, String conservation, String store, String temperature){   
    c.createConnection();
    DBCollection colec = c.getDatabase().getCollection("PescaBautista");
    BasicDBObject doc = new BasicDBObject();
    
    doc.put("Codigo", code);
    doc.put("Especie", species);
    doc.put("Cantidad", quantity);
    doc.put("Fecha de Pesca", date);
    doc.put("Estado", status);
    doc.put("Precio", cost);
    doc.put("Espacio de Conservacion", conservation);
    doc.put("Bodega Refrigerada", store);
    doc.put("Temperatura", temperature);   
    colec.insert(doc);
}
    
    public void addTransportation(String speciesTransportation, String nameBoat, String numberRegistry, String destiny, String DepartureTime, 
    String timeOfArrival, double costeTrasportation){
    c.createConnection();
    DBCollection colec = c.getDatabase().getCollection("TrasportacionBautista");
    BasicDBObject doc1 = new BasicDBObject();
    
    doc1.put("Especie Trasportada",speciesTransportation );
    doc1.put("Nombre del Barco", nameBoat);
    doc1.put("Numero de Registro", numberRegistry);
    doc1.put("Destino", destiny);
    doc1.put("Hora Salida", DepartureTime);
    doc1.put("Hora Llegada", timeOfArrival);
    doc1.put("Costo Trasportacion", costeTrasportation);
    
    colec.insert(doc1); 
    
    }
    public void addTransportationToJsonFile(String speciesTransportation, String nameBoat, String numberRegistry, String destiny, String departureTime, 
            String timeOfArrival, double costeTransportation) {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("Especie Trasportada", speciesTransportation);
    jsonObject.addProperty("Nombre del Barco", nameBoat);
    jsonObject.addProperty("Numero de Registro", numberRegistry);
    jsonObject.addProperty("Destino", destiny);
    jsonObject.addProperty("Hora Salida", departureTime);
    jsonObject.addProperty("Hora Llegada", timeOfArrival);
    jsonObject.addProperty("Costo Trasportacion", costeTransportation);

    try (FileWriter file = new FileWriter("transportation.json", true)) {
        File archivo = new File("transportation.json");
        if (archivo.length() > 0) {
            file.write(",\n");
        }
        gson.toJson(jsonObject, file);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public void documentOrigin(String code,String species,int quantity, String date,String status,double cost, String conservation, String store, String temperature){
    documentOrg = new BasicDBObject();
    
    documentOrg.put("Codigo", code);
    documentOrg.put("Especie", species);
    documentOrg.put("Cantidad", quantity);
    documentOrg.put("Fecha de Pesca", date);
    documentOrg.put("Estado", status);
    documentOrg.put("Precio", cost);
    documentOrg.put("Espacio de Conservacion", conservation);
    documentOrg.put("Bodega Refrigerada", store);
    documentOrg.put("Temperatura", temperature);    
    }
    
    public void actualizar(String code,String species,int quantity, String date,String status,double cost, String conservation, String store, String temperature){
    c.createConnection();
    DBCollection colec = c.getDatabase().getCollection("PescaBautista");
    BasicDBObject docact = new BasicDBObject();
    
    docact.put("Codigo", code);
    docact.put("Especie", species);
    docact.put("Cantidad", quantity);
    docact.put("Fecha de Pesca", date);
    docact.put("Estado", status);
    docact.put("Precio", cost);
    docact.put("Espacio de Conservacion", conservation);
    docact.put("Bodega Refrigerada", store);
    docact.put("Temperatura", temperature);   
    
    colec.findAndModify(documentOrg, docact);
        
    }
    
    public void Delete(){
    c.createConnection();
    DBCollection colec = c.getDatabase().getCollection("PescaBautista");
    colec.findAndRemove(documentOrg);    
    }
    
    public void search(String especie, JTable table) {
    c.createConnection();
    BasicDBObject consulta = new BasicDBObject("Especie", especie);
    DBCollection colec = c.getDatabase().getCollection("PescaBautista");
    DBCursor cursor = colec.find(consulta);
    mostrarResultadosBusqueda(cursor,table);
    cursor.close();
}

private void mostrarResultadosBusqueda(DBCursor cursor, JTable table) {   
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
            }} catch (Exception e) {
            e.printStackTrace();
        }                     
        table.setModel(model);
    } 
}
