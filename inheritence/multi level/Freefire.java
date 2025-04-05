class Character {
    String name;

    void move() {
        System.out.println(name + " moves around.");
    }
}

class Hayota extends Character {
    void attack() {
        System.out.println(name + " attacks with a sword.");
    }
}

class Chrono extends Hayota {
    void defend() {
        System.out.println(name + " raises a shield to defend.");
    }
}

public class Freefire {
    public static void main(String[] args) {
        Chrono hero = new Chrono();
        hero.name = "Sir Codealot";
        hero.move();    
        hero.attack();  
        hero.defend();     }
}
