import java.util.Scanner;

public class exceptionHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] myNumbers = { 0, 1, 2, 3 };
            try {
                System.out.print("Please enter a number - ");
                int num = sc.nextInt();
                int upSo = myNumbers[0];
                System.out.println("The calculated number is " + num / upSo);
            } catch (Exception e) {
                System.out.println("The error type is --  " + e);
            }
            System.out.println(myNumbers[10]);

        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("Finally we are here");
        }
    }
}
