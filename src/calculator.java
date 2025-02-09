
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        int num1, num2;
        double sum;
        String operator;

        System.out.println("Welcome to Calculator 🤪\n");

        System.out.println("Enter first number: ");
        Scanner sc1 = new Scanner(System.in);
        num1 = sc1.nextInt();

        System.out.println("Enter second number: ");
        Scanner sc2 = new Scanner(System.in);
        num2 = sc2.nextInt();

        System.out.println("EChoose any one operator: ('+, -, *, /, %')");
        Scanner sc3 = new Scanner(System.in);
        operator = sc3.nextLine();

        if (operator.equals("+")) {

            sum = num1 + num2;
            System.out.println("Sum of " + num1 + " and " + num2 + " is = " + sum);
        } else if (operator.equals("-")) {

            sum = num1 - num2;
            System.out.println("Difference of " + num1 + " and " + num2 + " is = " + sum);
        } else if (operator.equals("*")) {

            sum = num1 * num2;
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is = " + sum);
        } else if (operator.equals("/")) {

            sum = num1 / num2;
            System.out.println("Division of " + num1 + " and " + num2 + " is = " + sum);
        } else if (operator.equals("%")) {

            sum = num1 % num2;
            System.out.println("Modulor of " + num1 + " and " + num2 + " is = " + sum);
        } else {

            System.out.println("Wrong input!!");
        }

    }
}
