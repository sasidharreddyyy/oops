import java.util.Scanner;

public class LeapYear{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a year:");
    int y = scanner.nextInt();

    if ((y%4==0 && y%100==0) || (y%400==0)){
      System.out.println(y + " is a leap year!");
    }else{
      System.out.println(y + "is not a leap year!");
    }
  }
}