import java.util.Scanner;

public class HM2 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if(num1<num2) {
            System.out.println(num1);
        }
        else if(num2<num1) {
            System.out.println(num2);
        }
    }
}
