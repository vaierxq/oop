import java.util.ArrayList;
public class Order {
    private int orderId;
    private ArrayList<MenuItem> items;
    private String status;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.status = "New";
    }

    public int getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        for (MenuItem item : items) {
            item.displayInfo();
        }
        System.out.println("Total: $" + calculateTotal());
    }
}
