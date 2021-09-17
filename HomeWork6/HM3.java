import java.util.Scanner;

public class HM3 {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter an integer number:");

        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        if(number > 0) {
            System.out.println(number+" is positive");
        }
        else if(number < 0) {
            System.out.println(number+" is negative");
        }

    }
}
