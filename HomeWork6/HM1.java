import java.util.Scanner;

public class HM1 {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter an integer number:");

        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        if (number % 2 == 0 )
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");
    }
}
