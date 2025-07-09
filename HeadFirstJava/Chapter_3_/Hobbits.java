package Chapter_3_;

public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] hobbits = new Hobbits[3];
        int z=-1;

        while (z<2){
            z=z+1;
            hobbits[z]= new Hobbits();
            hobbits[z].name="bilbo";
            if(z==1){
                hobbits[z].name= "sam";
            }
            System.out.print(hobbits[z].name + " is a");
            System.out.println("good habbit name");

        }

    }
}
