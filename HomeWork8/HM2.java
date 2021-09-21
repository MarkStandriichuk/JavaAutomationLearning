package homework8;

import java.util.Scanner;

public class HM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms = ");
        int n = sc.nextInt();
        int t1 = 0;
        int t2 = 1;
        int t3 = 1;
        int t4 = 0;
        System.out.print(t1 + "," + t2 + "," + t3 + ",");

        for (int i = 3; i <= n; i++) {
            t4 = t1 + t2 + t3;
            System.out.print(t4 + ",");
            t1 = t2;
            t2 = t3;
            t3 = t4;
        }
    }
}
