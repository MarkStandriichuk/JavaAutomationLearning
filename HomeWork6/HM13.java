import java.util.Scanner;

public class HM13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you would like to be checked if it is a palindrome:");
        int num = in.nextInt();
        int rev=0;
        int i = 0;
        int originalNum = num;

        while(num!=0){
            rev = num % 10;
            i = i*10 + rev;
            num = num / 10;
        }

        if(originalNum == i)
            System.out.println("The number you input is a palindrome.");
        else
            System.out.println("The number you input is not a palindrome.");
    }
}
