package homework8;

import java.util.Scanner;

public class HM4 {
    public static void main(String[] args) {

        double num = 0,reverse = 0;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter some double value: ");
        num = sc.nextDouble();

        while (num > 0)
        {
            reverse = (reverse * 10) + num % 10;
            num = num / 10;
        }

        System.out.println("Reverse value: "+reverse);

    }
}
