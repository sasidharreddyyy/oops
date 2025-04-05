class Box {
    int length, width, height;

    Box() {
        length = width = height = 1;
    }

    Box(int side) {
        length = width = height = side;
    }

    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int volume() {
        return length * width * height;
    }
}

public class Volbox {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(3);
        Box b3 = new Box(2, 4, 6);

        System.out.println("Volume 1: " + b1.volume());
        System.out.println("Volume 2: " + b2.volume());
        System.out.println("Volume 3: " + b3.volume());
    }
}
