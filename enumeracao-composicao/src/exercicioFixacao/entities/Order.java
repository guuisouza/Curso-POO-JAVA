package exercicioFixacao.entities;

import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> orderItemList = new ArrayList<>();

   public Order(){
   }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void addItem(OrderItem item){
       orderItemList.add(item);
    }

    public void remove(OrderItem item){
        orderItemList.remove(item);
    }

    public Double total(){
       double totalPrice = 0.0;
       for (OrderItem x : orderItemList){
           totalPrice += x.subTotal();
       }

       return  totalPrice;
    }

    public String toString(){
       StringBuilder sb = new StringBuilder();
       sb.append("Order moment: ");
       sb.append(moment.format(format) + "\n");
       sb.append("Order status: ");
       sb.append(status + "\n");
       sb.append("Client: ");
       sb.append(client + "\n");
       sb.append("Order items:\n");

       for (OrderItem item : orderItemList){
           sb.append(item + "\n");
       }
       sb.append("Total price: $");
       sb.append(String.format("%.2f", total()));

       return sb.toString();
    }

}
