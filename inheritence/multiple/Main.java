class BreathingStyle {
    void BreathingTechnique() {
        System.out.println("Uses Water Breathing: Tenth Form – Constant Flux!");
    }
}

class SwordStyle {
    void attack() {
        System.out.println("Performs precise sword slash on the demon!");
    }
}

class DemonSlayer {
    String name;
    BreathingStyle breathing = new BreathingStyle();
    SwordStyle sword = new SwordStyle();

    DemonSlayer(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("I am " + name + ", a Demon Slayer!");
    }

    void fightDemon() {
        breathing.BreathingTechnique();
        sword.attack();
    }
}

public class Main {
    public static void main(String[] args) {
        DemonSlayer tanjiro = new DemonSlayer("Tanjiro Kamado");
        tanjiro.introduce();
        tanjiro.fightDemon();
    }
}
