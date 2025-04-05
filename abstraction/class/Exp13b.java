abstract class Order {
    abstract void prepare();

    void takeOrder(String item) {
        System.out.println("Order taken for: " + item);
    }
}

class VegOrder extends Order {
    void prepare() {
        System.out.println("Preparing vegetarian meal.");
    }
}

class NonVegOrder extends Order {
    void prepare() {
        System.out.println("Preparing non-vegetarian meal.");
    }
}

public class Exp13b {
    public static void main(String[] args) {
        Order order = new VegOrder();
        order.takeOrder("Paneer Butter Masala");
        order.prepare();
    }
}
