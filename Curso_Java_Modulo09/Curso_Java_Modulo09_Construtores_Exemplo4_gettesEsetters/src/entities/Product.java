package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(){

    }

    // GERAR CONTRUTORES AUTOMATICAMENTE
    //BOTAO DIREITO DO MOUSE "GENERATE" OU "ALT + INSERT"
    // "CONSTRUCTOR"

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //SOBRECARGA
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // GERAR GETTERS E SETTERS AUTOMATICAMENTE
    //BOTAO DIREITO DO MOUSE "GENERATE" OU "ALT + INSERT"
    // "GETTERS E SETTERS"

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    //Nao pode ser CRIADO um setQUANTITY, Justamente para proteger o objeto produto
    // de quaisquer alterações inconsistentes na quantidade dele.
    //
    /*public int setQuantity(int quantity) {
        this.quantity = quantity;
    }*/

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}