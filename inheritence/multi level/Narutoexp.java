class AnimeCharacter {
    String name;

    void introduce() {
        System.out.println("I am " + name + ", an anime character.");
    }
}

class Ninja extends AnimeCharacter {
    void Jutsu() {
        System.out.println(name + " performs Shadow Clone Jutsu!");
    }
}

class Hokage extends Ninja {
    void Village() {
        System.out.println(name + " protects the Hidden Leaf Village!");
    }

    void ultimateMove() {
        System.out.println(name + " unleashes the Sage Mode Rasengan!");
    }
}

public class Narutoexp {
    public static void main(String[] args) {
        Hokage naruto = new Hokage();
        naruto.name = "Naruto Uzumaki";

        naruto.introduce();       // from AnimeCharacter
        naruto.Jutsu();    // from Ninja
        naruto.Village();  // from Hokage
        naruto.ultimateMove();    // from Hokage
    }
}
