class Vehicle {
    void fuelUp() {
        System.out.println("Filling vehicle with fuel.");
    }
}

class Rocket extends Vehicle {
    void launch() {
        System.out.println("Rocket is launching into space.");
    }
}

class SpaceShuttle extends Rocket {
    void deploy() {
        System.out.println("Deploying satellite into orbit.");
    }
}

public class Space2 {
    public static void main(String[] args) {
        SpaceShuttle shuttle = new SpaceShuttle();
        shuttle.fuelUp();      
        shuttle.launch();          
        shuttle.deploy();     
    }
}
