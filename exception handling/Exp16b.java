public class Exp16b {
    public static void main(String[] args) {
        String surprise = null;

        try {
            System.out.println("You got: " + surprise.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("No surprise inside the box ");
        }
    }
}
