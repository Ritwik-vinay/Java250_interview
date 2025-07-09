package Chapter_2_;

public class exercide2d {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        //Echo e2 = e1;   //output is 24
        Echo e2 = new Echo(); // For the output 10
        int x = 0;
        while (x < 4) {
            e1.Hello();
            e1.count = e1.count + 1;
            if (x==3){
                e2.count=e2.count+1;
            }
            if (x>0){
                e2.count=e2.count+e1.count;
            }
            x=x+1;
        }
        System.out.println(e2.count);

    }
}

class Echo {
    int count = 0;

    void Hello() {
        System.out.println("Hello..........");
    }
}
