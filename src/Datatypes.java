
public class Datatypes {

    public static void main(String[] args) {

        // Data types in java
        // bytes - 1 [-128 to 127]
        // short - 2 
        // int - 4
        // long int - 8 
        // float - 4
        // double - 8 
        // char - 2
        // boolean - 1 true/false
        // premetive data types in java
        // byte age = 30;
        // int phone = 1234567890;
        // long phone2 = 12345678900L;                 // L is used to tell the compiler that it is a long value
        // float pi = 3.14F;                           // F is used to tell the compiler that it is a float value
        // char letter = 'A';
        // boolean isAdult = true;
        // Non-premetive datatypes in java
        // String name = "Piyush";    // not fixed size
        //  String friend = new String("Priya");  // we can also create string using new keyword
        //  System.out.println(name.length());
        // Strings
        // Concatenate
        // String name1 = "Piyush";
        // String name2 = "Bhatt";
        // String fullname = name1 + " " + name2;
        // System.out.println(fullname);
        // Strings
        // charAt
        // replace
        // substring
        //String name = "Piyush";
        // System.out.println(name.charAt(5));
        // String name2 = name.replace('P', 'b');
        // System.out.println(name2);
        String name3 = "Piyush and Sasha";
        System.out.println(name3.substring(0, 16));

    }
}
