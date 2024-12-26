
import java.util.Scanner;



public class project {
    
    // Mini projects

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int myNum = (int)Math.random()*100;
    
       
        do { 
              System.out.println("Guess my number: ");
              int userNum = sc.nextInt();
              if(userNum == myNum){
                System.out.println("Woah! You guessed it right");
              }
              else if(userNum > myNum) {

                System.out.println("Your umber is too large");
              }

              else {
                System.out.println("Your number is too small");
              }

        } 
          while ();
    }
}
