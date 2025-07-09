package JavaWeek1;

public class InhetCreation {
    public static void main(String[] args) {
        //Single level Inheritence where the Derived class is having the attributes of base class
        // To use the attributes of other class it used the "Extendsd Keyword"
        base b = new base();
        b.setX("I am in derived from base Object");
        System.out.println(b.getX());
        derived d = new derived();
        System.out.println("===================");
        d.setX("I am in derived class from derived object");
        System.out.println(d.getX());
        System.out.println("===================");


        d.setY(15);
        System.out.println(d.getY());

    }
    static class derived extends  base{
        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        int  y;

    }
    static class base{
        public String getX() {
            System.out.println("I am in Base class ");
            return x;
        }

        public void setX(String x) {
            this.x = x;
        }

        String x;
    }
}
