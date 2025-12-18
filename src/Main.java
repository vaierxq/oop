public class Main {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem(1, "Pizza", 8.99, "Main", true);
        MenuItem item2 = new MenuItem(2, "Burger", 6.50, "Main", true);

        Restaurant restaurant = new Restaurant("Food House", "Almaty");

        restaurant.addMenuItem(item1);
        restaurant.addMenuItem(item2);

        Order order1 = new Order(101);
        order1.addItem(item1);
        order1.addItem(item2);

        Order order2 = new Order(102);
        order2.addItem(item1);

        restaurant.addOrder(order1);
        restaurant.addOrder(order2);

        restaurant.showMenu();
        System.out.println();
        restaurant.showOrders();
        if (order1.calculateTotal() > order2.calculateTotal()) {
            System.out.println("Order 1 is more expensive than Order 2");
        }
    }
}