

public class operate {

    public static void main(String[] args) {
        
        // operators in java

        // 1. Arithmetic operators
        // 2. Assignment operators
        // 3. Comparison operators
        // 4. Logical operators
        // 5. Bitwise operators


        // 1. Arithmetic operators  

        // int a = 1;
        // int b = 2;
        // int sum = a+b;
        // System.out.println(sum);

        // unary operators

    //     int num = 1;
    //     //num = num+1;
    //    // num+=1;
    //     num--;  // unary operator
    //     System.out.println(num);


        // Maths
       // System.out.println(Math.min(5, 6));
      //    System.out.println((int)(Math.random()*100));


      // Comparission operator
      // a =b
      // a !=b
      // a < b
      // a > b
      // a <= b
      // a >= b

      // Logical operator

    //   boolean isSunUp = false;
    //   if(isSunUp == true){
    //     System.out.println("Good Morning");
    //   }

    //   else {
    //     System.out.println("Good Night");
    //   }


    // int age = 30;

    // if(age > 18)
    // System.out.println("Can vote");
    // else
    // System.out.println("Can't vote");
 
    // logical operator
    // && operator
    // || operator
    // ! operator

    // int a = 30;
    // int b = 20;

    // if(a<50 && b<50){
    //     System.out.println("Both are less than 50");
    // }

    // if(a<50 || b<50){
    //     System.out.println("Both are less than 50");
    // }

    // boolean isAdult = false;
    // if(!isAdult)
    // System.out.println("is adult");
    // else
    // System.out.println("is not adult");
    // System.out.println("Enter the amount");
    // Scanner sc = new Scanner(System.in);
    // int cash = sc.nextInt();
    // if(cash < 10){
    //      System.out.println("You can't buy anything");
    // }

    // else if (cash > 10 && cash < 50) {
    //     System.out.println("You can buy a chocolate");
    // }

    // else {
    //     System.out.println("Can get both");
    // }
      
    // Switch Statment

  //  int day = 1; // 1- monday 2- tuesday 3- wednesday 4- thursday 5- friday 6- saturday 7- sunday

    switch(day){
        case 1: 
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 3: 
        System.out.println("Wednesday");
        break;
        case 4:
        System.out.println("Thursday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("Saturday");
        break;
        case 7:
        System.out.println("Sunday");
        break;
        
        default:
        System.out.println("Invalid day");
    }

     }

}