import java.util.*;

public class Exp16c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            System.out.println("Your age is: " + age);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number");
        }
    }
}
