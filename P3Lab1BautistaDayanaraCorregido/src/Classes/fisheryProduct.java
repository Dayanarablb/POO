package Classes;

public class fisheryProduct {
    private String species;
    private double coste;
    private int quantity;

    public fisheryProduct(String species, int quantity, double coste) {
        this.species = species;
        this.quantity = quantity;
        this.coste = coste;
        
    }
    public fisheryProduct(){
        
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public double getCoste() {
        return coste;
    }
    public void setCoste(double coste) {
        this.coste = coste;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    // Método para calcular el precio total
    public double calculateTotalPrice() {
        return quantity * coste;
    }
    
 

}

    




  

