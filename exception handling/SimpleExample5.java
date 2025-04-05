public class SimpleExample5 {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Divide error.");
        } finally {
            System.out.println("Finally block always runs.");
        }
    }
}
