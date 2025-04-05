interface Delivery {
    void deliverPackage(String address);
}

class DroneDelivery implements Delivery {
    public void deliverPackage(String address) {
        System.out.println("Delivering package via drone to: " + address);
    }
}

class TruckDelivery implements Delivery {
    public void deliverPackage(String address) {
        System.out.println("Delivering package via truck to: " + address);
    }
}

public class Exp12a {
    public static void main(String[] args) {
        Delivery service = new DroneDelivery();
        service.deliverPackage("Amrita Chennai campus");
    }
}
