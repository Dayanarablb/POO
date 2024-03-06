
package repasoexamenpoo;

import org.bson.Document;
import repasoexamenpoo.operaciones.Cliente;
import repasoexamenpoo.operaciones.createMongo;
import repasoexamenpoo.view.Banco;


public class RepasoExamenPOO {
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    createMongo creatmongo = new createMongo();
    
    Cliente client;
    
    long num = 2110083054L;
    double saldo = 780.0D;
    String nom ="Anthony";
    String c = "Cuenta Corriente";
    /*
            public Cliente(String Nombre, int numCuenta, double Saldo, String TipoCuenta) {

        */  
    client = new Cliente(nom, num, saldo, c);
    Document doc = client.DevuelveDoc(client);
    //creatmongo.addDocument(doc);
      
    Banco b = new Banco();
    b.setVisible(true);
    
    }
    
    
    
}
