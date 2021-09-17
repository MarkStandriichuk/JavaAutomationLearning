import java.util.Scanner;

public class HM14 {
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a pont with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        input.close();

        double xDistance = Math.pow(x * x, 0.5D);
        double yDistance = Math.pow(y * y, 0.5D);

        if ((yDistance <= 2.5) && (xDistance <= 5.0)) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle.");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle.");
        }
    }
}
