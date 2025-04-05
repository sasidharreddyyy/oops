class Shoe {
    void wear() {
        System.out.println("Wearing shoes...");
    }

    void material() {
        System.out.println("Material: Generic Shoe Material");
    }
}

class SportsShoe extends Shoe {
    void brand() {
        System.out.println("Brand: Nike");
    }

    void performance() {
        System.out.println("Great for running and gym.");
    }
}

class FormalShoe extends Shoe {
    void brand() {
        System.out.println("Brand: Clarks");
    }

    void style() {
        System.out.println("Perfect for office or formal events.");
    }
}

class CasualShoe extends Shoe {
    void brand() {
        System.out.println("Brand: Vans");
    }

    void comfort() {
        System.out.println("Comfortable for daily wear.");
    }
}

public class Shoesexp {
    public static void main(String[] args) {
        System.out.println("Sports Shoe");
        SportsShoe sport = new SportsShoe();
        sport.wear();
        sport.material();
        sport.brand();
        sport.performance();

        System.out.println("Formal Shoe");
        FormalShoe formal = new FormalShoe();
        formal.wear();
        formal.material();
        formal.brand();
        formal.style();

        System.out.println("Casual Shoe");
        CasualShoe casual = new CasualShoe();
        casual.wear();
        casual.material();
        casual.brand();
        casual.comfort();
    }
}
