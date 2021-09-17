import java.util.Scanner;

public class HM11 {
    public static void main(String[] args) {
        int mod;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number to define it modulus");
        mod = in.nextInt();
        System.out.println(Math.abs(mod));
    }
}
