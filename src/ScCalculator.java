import java.util.Scanner;

import static Operations.Cos.cos;
import static Operations.Sin.sin;
import static Operations.SquareRoot.squareRootX;

public class ScCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read values from user
        System.out.println("Enter x value: ");
        int x = sc.nextInt();

        // Let user choose an operation to run
        System.out.println("1 - Square root of x\n" +
                            "2 - Sin(x)\n" +
                            "3 - Cos(x)\n" +
                            "Enter a number for an operation: ");
        int op = sc.nextInt();

        // Switch case to choose an operation
        switch(op) {
            case 1: double sqrRtX = squareRootX(x);
                System.out.println("The result is: " + sqrRtX);
                break;
            case 2: double sin = sin(x);
                System.out.println("The result is: " + sin);
                break;
            case 3: double cos = cos(x);
                System.out.println("The result is: " + cos);
                break;
        }

    }
}
