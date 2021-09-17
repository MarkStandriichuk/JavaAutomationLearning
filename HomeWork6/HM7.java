import java.util.Scanner;

public class HM7 {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter an integer");

        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        if (number> 1 && number< 30) {
            System.out.println(number+" is in given range");
        }
        else {
            System.out.println(number+" is NOT in given range");
        }
    }
}
