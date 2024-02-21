package Classes;
import java.util.Date;
public class fishing {
    private String code;
    private String species;
    private int quantity;
    private Date date;
    private String status;
    private double cost;
    private String conservation;
    private String store;
    private String temperature;

    public fishing(String code, String species, int quantity, Date date, String status, double cost, String conservation, String store, String temperature) {
        this.code = code;
        this.species = species;
        this.quantity = quantity;
        this.date = date;
        this.status = status;
        this.cost = cost;
        this.conservation = conservation;
        this.store = store;
        this.temperature = temperature;
    }
    public fishing (){
        
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getConservation() {
        return conservation;
    }

    public void setConservation(String conservation) {
        this.conservation = conservation;
    }

    public String getStore() {
        return store;
    }
    public void setStore(String store) {
        this.store = store;
    }
    public String getTemperature() {
        return temperature;
    }
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }   
}
