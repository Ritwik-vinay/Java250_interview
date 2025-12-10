public class polymorphismExample {
    static void main() {
        //Overloading and Overriding {Polymorphism means many forms }
        polymorphismExample pe= new polymorphismExample();
        System.out.println(pe.add(35,54));
        System.out.println(pe.add(35,54,56));
    }
    int add(int a , int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}
