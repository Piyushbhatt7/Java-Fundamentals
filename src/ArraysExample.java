public class ArraysExample {
    
    public static void main(String[] args) {
        
        // int age = 30;
        // int physics = 97;
        // int chem = 56;
        // int eng = 89;
        // length
        // sort
        // casting

        // int [] marks = new int[4];
       
        // marks[0] = 97;
        // marks[1] = 9;
        // marks[2] = 89;
        // marks[3] = 88;
       
 
        //System.out.println(marks[3]);
        //System.out.println(marks.length);

        // System.out.println("Before sorting :" + marks[0]);
        // Arrays.sort(marks);
        // System.out.println("After sorting:" + marks[0]);

       // int [] marks = {97, 89, 88, 9};
        
       // int [][] finalMarks = {{2,3,5,6}, {90,89,78,76}};         // 2D array
       // System.out.println(finalMarks[1][2]);
        
        // casting

        double price = 100.0;
        double finalPrice = price+18;  // double can store int value and it is called Implicit casting

        System.out.println(finalPrice);

        // int p = 100;
        // int Fp = p + 18.0;              // casting occur because a glass can fill a bucket but a bucket can't fill a glass

        int p = 100;
        int Fp = p + (int)18.0;          // by Explicit casting we can store double value in int
        System.out.println(Fp);

    }
}
