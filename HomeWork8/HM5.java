package homework8;

import java.util.Scanner;

public class HM5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        for (int row = 0; row < size; row++)
        {
            for (int col = size - row; col > 1; col--)
            {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
