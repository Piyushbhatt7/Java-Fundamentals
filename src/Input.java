
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hi " + name);
    }
}
