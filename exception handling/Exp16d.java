public class Exp16d {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        try {
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}
