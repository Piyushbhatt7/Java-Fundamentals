import java.util.Arrays;
public class ArraysExample {
    
    public static void main(String[] args) {
        
        // int age = 30;
        // int physics = 97;
        // int chem = 56;
        // int eng = 89;
        // length
        // sort

        int [] marks = new int[4];
       
        marks[0] = 97;
        marks[1] = 90;
        marks[2] = 89;
        marks[3] = 88;
       
 
        //System.out.println(marks[3]);
        //System.out.println(marks.length);

        System.out.println("Before sorting :" + marks[0]);
        Arrays.sort(marks);
        System.out.println("After sorting:" + marks[0]);


    }
}
