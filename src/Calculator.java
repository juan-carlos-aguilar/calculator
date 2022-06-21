import java.util.Scanner;

import static Operations.Divide.div;
import static Operations.Multiply.mult;
import static Operations.Subtract.sub;
import static Operations.Sum.sum;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read values from user
        System.out.println("Enter x value: ");
        int x = sc.nextInt();
        System.out.println("Enter y value: ");
        int y = sc.nextInt();

        // Let user choose an operation to run
        System.out.println("""
                1 - Sum
                2 - Subtract
                3 - Divide
                4 - Multiply
                Enter a number for an operation:\s""");
        int op = sc.nextInt();

        // Switch case to choose an operation
        switch (op) {
            case 1 -> {
                int sum = sum(x, y);
                System.out.println("The result is: " + sum);
            }
            case 2 -> {
                int sub = sub(x, y);
                System.out.println("The result is: " + sub);
            }
            case 3 -> {
                int div = div(x, y);
                System.out.println("The result is: " + div);
            }
            case 4 -> {
                int mult = mult(x, y);
                System.out.println("The result is: " + mult);
            }
        }
    }
}
