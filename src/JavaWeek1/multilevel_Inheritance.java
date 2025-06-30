package JavaWeek1;

public class multilevel_Inheritance {
    public static void main(String[] args) {
//        B b = new B();
//        b.bank();
//        System.out.println(b.currency);
        C c = new C();
        c.bank();
        System.out.println(c.currency);
        A a = new A();
        a.bank("Taka");



    }
    public static class B extends  A{
       void bank(){
           setCurrency(12);
           super.bank("Rupees");



       }
    }
    public static  class C extends B{
        @Override
        void bank() {
            super.bank("Dollar");
            setCurrency(42);

        }
    }
    public static class A{
        public int getCurrency() {
            return currency;
        }

        public void setCurrency(int currency) {
            this.currency = currency;
        }

        int currency;
        void bank(String currName){
             String currencyin= currName;
            System.out.println(currencyin);
        }
    }

}
