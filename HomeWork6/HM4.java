import java.util.Scanner;

public class HM4 {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers (hit 'Enter' after each):");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        if(num1>num2 && num1>num3) {
            System.out.println("Largest number is: "+num1);
        }
        else if(num2>num3) {
            System.out.println("Largest number is: "+num2);
        }
        else {
            System.out.println("Largest number is: "+num3);
        }
    }
}
