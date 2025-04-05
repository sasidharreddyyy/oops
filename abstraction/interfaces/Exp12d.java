interface FoodDelivery {
    void placeOrder(String item);
}

class Zomato implements FoodDelivery {
    public void placeOrder(String item) {
        System.out.println("Order placed for " + item + " via Zomato.");
    }
}

class Swiggy implements FoodDelivery {
    public void placeOrder(String item) {
        System.out.println("Order placed for " + item + " via Swiggy.");
    }
}

public class Exp12d {
    public static void main(String[] args) {
        FoodDelivery order = new Swiggy();
        order.placeOrder("Paneer Pizza");
    }
}
