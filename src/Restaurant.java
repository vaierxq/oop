import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String address;
    private ArrayList<MenuItem> menu;
    private ArrayList<Order> orders;

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void showMenu() {
        System.out.println("Menu:");
        for (MenuItem item : menu) {
            item.displayInfo();
        }
    }

    public void showOrders() {
        for (Order order : orders) {
            order.displayOrder();
            System.out.println();
        }
    }
}
