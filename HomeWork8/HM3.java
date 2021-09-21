package homework8;

import java.util.Scanner;

public class HM3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size(a non-negative integer): ");
        int size = sc.nextInt();

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        for (int row = 0; row < size; row++) {
            for (int col = 2*(size - row); col >= 0; col--)
            {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }


        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col < row) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }

    }
}
