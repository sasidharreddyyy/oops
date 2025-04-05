class Chocolate {
    String brand;
    double price;

    void Details() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

class KinderJoy extends Chocolate {
    String surpriseToy;

    void Surprise() {
        System.out.println("Surprise Toy: " + surpriseToy);
    }
}

public class Kinderjoyy {
    public static void main(String[] args) {
        KinderJoy k = new KinderJoy();
        k.brand = "Kinder";
        k.price = 40.00;
        k.surpriseToy = "Mini Car";

        k.Details();           
        k.Surprise();       }
}
