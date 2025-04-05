public class Exp16 {
    public static void main(String[] args) {
        String value = "abc";
        try {
            int num = Integer.parseInt(value);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("That's not a number!");
        }
    }
}
