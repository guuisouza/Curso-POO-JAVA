package entities;

import org.w3c.dom.ls.LSOutput;

public class Product {

    public String name;
    public double price;
    public int quantity;

    /* Methods */
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        /* Utilizando o this podemos referenciar automaticamente
        o atributo da nossa classe, diferenciando do parâmetro */
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString(){
        return "Product data: " + this.name + ", $ " + String.format("%.2f", this.price) + ", " + this.quantity +
                " units, Total: $ " + String.format("%.2f", this.totalValueInStock());
    }
}
