class KinderJoy {
    void surprise() {
        System.out.println("You got a mystery toy!");
    }
}

class CarToy extends KinderJoy {
       void surprise() {
        System.out.println("You got a mini car toy in your Kinder Joy!");
    }
}

class DinoToy extends KinderJoy {
        void surprise() {
        System.out.println("You got a roaring dinosaur toy in your Kinder Joy!");
    }
}

public class Exp11a {
    public static void main(String[] args) {
        KinderJoy toy1 = new CarToy();
        KinderJoy toy2 = new DinoToy();

        toy1.surprise();
        toy2.surprise();
    }
}
