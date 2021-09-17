import java.util.Scanner;

public class HM6 {
    public static void main(String[] args) {
        System.out.println("Enter some character");
        Scanner in = new Scanner(System.in);
        if(in.hasNextInt()) {
            System.out.println(in.nextInt()+" is an Integer");
        }
        else {
            System.out.println("is not an Integer");
        }
    }
}
