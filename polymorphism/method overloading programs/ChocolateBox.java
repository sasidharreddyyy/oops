class KinderJoy {

    // Method 1 - no arguments
    void surprise() {
        System.out.println("You got a random toy inside your Kinder Joy!");
    }

    // Method 2 - by toy type
    void surprise(String toyType) {
        System.out.println("You got a " + toyType + " toy in your Kinder Joy!");
    }

    // Method 3 - by toy and number of stickers
    void surprise(String toyType, int stickers) {
        System.out.println("You got a " + toyType + " toy with " + stickers + " stickers!");
    }
}

public class ChocolateBox {
    public static void main(String[] args) {
        KinderJoy kj1 = new KinderJoy();
        kj1.surprise();
        kj1.surprise("Car");
        kj1.surprise("Dinosaur", 3);
    }
}
