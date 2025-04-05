interface Camera {
    void capture();
}

class DSLR implements Camera {
    public void capture() {
        System.out.println("Capturing high-resolution image with DSLR.");
    }
}

class PhoneCamera implements Camera {
    public void capture() {
        System.out.println("Capturing photo with phone camera.");
    }
}

public class PhotographyExample {
    public static void main(String[] args) {
        Camera cam = new PhoneCamera();
        cam.capture();
    }
}
