class Cake {
    String flavor;
    int size;

    Cake() {
        flavor = "Vanilla";
        size = 6;
        System.out.println("Default cake created: " + flavor + " - " + size + " inches");
    }

    Cake(String flavor, int size) {
        this.flavor = flavor;
        this.size = size;
        System.out.println("Custom cake created: " + flavor + " - " + size + " inches");
    }

    void display() {
        System.out.println("Cake Flavor: " + flavor + ", Size: " + size + " inches");
    }
}

public class Bakery {
    public static void main(String[] args) {
        Cake cake1 = new Cake();
        Cake cake2 = new Cake("Chocolate", 8);
        Cake cake3 = new Cake("Strawberry", 10);

        cake1.display();
        cake2.display();
        cake3.display();
    }
}
