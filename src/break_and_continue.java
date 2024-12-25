public class break_and_continue {
        
    public static void main(String[] args) {
         

        // Break and Continue
        int i = 0;
        while(true){
           
            if(i==3){
                i++;
                continue;
            }

            System.out.println(i);
            i++;
            if(i > 5){
             break;
            // continue;
            }
            
        }

    }
}
