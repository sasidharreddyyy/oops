abstract class Maintenance {
    abstract void service();

    void showReminder() {
        System.out.println("Service due in 500km 🔧");
    }
}

class MarutiSuzuki extends Maintenance {
    void service() {
        System.out.println("Maruti Suzuki: Basic servicing started...");
    }
}

class Audi extends Maintenance {
    void service() {
        System.out.println("Audi: Premium full-body check-up initiated...");
    }
}

public class Exp13d {
    public static void main(String[] args) {
        Maintenance car = new Audi();
        car.showReminder();
        car.service();
    }
}
