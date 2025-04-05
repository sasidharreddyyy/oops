interface InternetConnection {
    void connect();
}

class Wifi implements InternetConnection {
    public void connect() {
        System.out.println("Connected to the internet via Wi-Fi.");
    }
}

class MobileData implements InternetConnection {
    public void connect() {
        System.out.println("Connected to the internet via Mobile Data.");
    }
}

public class Exp12b {
    public static void main(String[] args) {
        InternetConnection connection = new Wifi();
        connection.connect();
    }
}
