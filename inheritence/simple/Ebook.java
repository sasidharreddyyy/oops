class Product {
    String name;
    double price;

    void displayInfo() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

class DigitalProduct extends Product {
    String downloadLink;

    void DownloadLink() {
        System.out.println("Download at: " + downloadLink);
    }
}

public class Ebook {
    public static void main(String[] args) {
        DigitalProduct ebook = new DigitalProduct();
        ebook.name = "Darken eye";
        ebook.price = 69.69;
        ebook.downloadLink = "https://oracle.com";

        ebook.displayInfo();
        ebook.DownloadLink();
    }
}
