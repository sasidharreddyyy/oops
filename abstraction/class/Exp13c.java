abstract class Car {
    abstract void startEngine();

    void checkBattery() {
        System.out.println("Battery check passed ");
    }
}

class Tesla extends Car {
    void startEngine() {
        System.out.println("Tesla: Starting electric motor silently... ");
    }
}

class BMW extends Car {
    void startEngine() {
        System.out.println("BMW: Roaring petrol engine started! ");
    }
}

public class Exp13c {
    public static void main(String[] args) {
        Car car = new Tesla();
        car.checkBattery();
        car.startEngine();
    }
}
