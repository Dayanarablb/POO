
package repasoexamenpoo.operaciones;

import org.bson.Document;

public class Cliente {
    
    String Nombre;
    long numCuenta;
    double Saldo;
    String TipoCuenta;

    public Cliente(String Nombre, long numCuenta, double Saldo, String TipoCuenta) {
        this.Nombre = Nombre;
        this.numCuenta = numCuenta;
        this.Saldo = Saldo;
        this.TipoCuenta = TipoCuenta;
    }

   
   

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }
   
    public Document DevuelveDoc(Cliente client){
        
        Document d = new Document();
        
        d.put("Nombre", client.getNombre());
        d.put("Numero de Cuenta", client.getNumCuenta() ); 
        d.put("Saldo", client.getSaldo());
        d.put("Tipo de Cuenta", client.getTipoCuenta());
        
        return d;
    }
   
    
    
}
