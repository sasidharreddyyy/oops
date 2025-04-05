class Car {
    void start() {
        System.out.println("Car is starting in a standard way...");
    }
}

class SportsCar extends Car {
        void start() {
        System.out.println("Vroom! SportsCar roars to life with a button start!");
    }
}

class ElectricCar extends Car {
        void start() {
        System.out.println("Silent start... ElectricCar is now on.");
    }
}

public class Exp11b {
    public static void main(String[] args) {
        Car myCar1 = new SportsCar();
        Car myCar2 = new ElectricCar();

        myCar1.start();
        myCar2.start();
    }
}
