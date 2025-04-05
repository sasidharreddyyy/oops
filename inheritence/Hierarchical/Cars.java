class CarBrand {
    void Brand() {
        System.out.println("This is a generic car brand.");
    }

    void startCar() {
        System.out.println("Starting the car...");
    }
}

class Toyota extends CarBrand {
    void Model() {
        System.out.println("Toyota Corolla - Reliable and fuel efficient.");
    }
}

class Tesla extends CarBrand {
    void Model() {
        System.out.println("Tesla Model S - Electric and high-tech.");
    }

    void autoPilot() {
        System.out.println("Activating Tesla Autopilot...");
    }
}

class BMW extends CarBrand {
    void Model() {
        System.out.println("BMW M3 - Luxury and performance.");
    }

    void sportMode() {
        System.out.println("Switching to BMW Sport Mode...");
    }
}

public class Cars {
    public static void main(String[] args) {
        System.out.println("Toyota");
        Toyota toyota = new Toyota();
        toyota.Brand();
        toyota.startCar();
        toyota.Model();

        System.out.println("Tesla");
        Tesla tesla = new Tesla();
        tesla.Brand();
        tesla.startCar();
        tesla.Model();
        tesla.autoPilot();

        System.out.println("BMW");
        BMW bmw = new BMW();
        bmw.Brand();
        bmw.startCar();
        bmw.Model();
        bmw.sportMode();
    }
}
