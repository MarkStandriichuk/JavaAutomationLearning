import java.util.Scanner;

public class HM12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a number:");
        int num = in.nextInt();
        while(num!=0){
            num = num/4;
            count++;
        }
        System.out.println("Number of digits in the entered integer are: "+count);
    }
}
