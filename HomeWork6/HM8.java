import java.util.Scanner;

public class HM8 {
    public static void main(String[] args) {
        int num1,num2;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        num1 = in.nextInt();
        System.out.println("Enter another number");
        num2 = in.nextInt();

        if ((num1 % num2) == 0) {
            System.out.println(num1+" in a multiple of "+num2);
        }
        else {
            System.out.println(num1+" is not a multiple of "+num2);
        }

    }
}
