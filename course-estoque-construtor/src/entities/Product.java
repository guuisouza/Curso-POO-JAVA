package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(){
        // Construtor padrão - sobrecarga
    }
    // Agora vamos criar nosso construtor, que inicia após os atributos

    public Product(String name, double price, int quantity) {
        // this significa uma referência para o proprio objeto
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Vamos criar um construtor opcional, o qual recebe apenas nome e
    //preço do produto. A quantidade em estoque deste novo produto, por
    //padrão, deverá então ser iniciada com o valor zero.

    public Product(String name, double price) {
        // this significa uma referência para o proprio objeto
        this.name = name;
        this.price = price;
    }

    // Sobrecarga = disponibilizar mais de uma versão da mesma operação
    // A diferença entre elas será a lista de parâmetros.

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