package opps;

public class classes {

    public static void main(String[] args){
               
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "Gel";
        pen1.write();
    }

   
    public static class Pen{
        String color;
        String type; // ballpoint, gel point

        public void write(){
            System.out.println("Writing something");
        }
    }
}