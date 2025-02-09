
import java.util.Scanner;

public class loops {

    public static void main(String[] args) {

        // loops in java f
        // 1. for loop
        // 2. while loop
        // 3. do-while loop
        // for loop
        //  for(int i=100; i>=1; i--){
        //     System.out.println(i); 
        //  }
        // while loop
        // int i = 100;
        // while(i>=1){
        //     System.out.println(i);
        //     i--;
        // }
        // do while loop
        // int a = 100;
        // do{
        //     System.out.println(a); 
        //     a--;
        // }
        // while(a>=1);
        Scanner sc = new Scanner(System.in);
        int number;  // already initialize with zero
        do {
            System.out.println("Input a number");
            number = sc.nextInt();
            System.out.println("Here is your number: ");
            System.out.println(number);
        } while (number >= 0);
        System.out.println("The End");
    }
}
