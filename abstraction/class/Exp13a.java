abstract class Rocket {
    abstract void launch();

    void prepareFuel() {
        System.out.println("Filling rocket with fuel...");
    }
}

class ISRO extends Rocket {
    void launch() {
        System.out.println("ISRO rocket launching into orbit.");
    }
}

class NASA extends Rocket {
    void launch() {
        System.out.println("NASA rocket launching to the Moon.");
    }
}

public class Exp13a {
    public static void main(String[] args) {
        Rocket rocket = new ISRO();
        rocket.prepareFuel();
        rocket.launch();
    }
}
