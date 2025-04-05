class Car {

    void start() {
        System.out.println("Car started with a key.");
    }

    void start(String method) {
        System.out.println("Car started using: " + method);
    }

    void start(String method, int distance) {
        System.out.println("Car started using " + method + " from " + distance + " meters away.");
    }
}

public class Exp10b {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();                          
        myCar.start("Push Button");             
        myCar.start("Remote", 15);              
    }
}
