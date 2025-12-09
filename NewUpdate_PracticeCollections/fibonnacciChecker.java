public class fibonnacciChecker {
    static void main() {
        fibonacciSeries fs = new fibonacciSeries();
        fs.fibonacciPrint(3);
    }
}
class fibonacciSeries{
    void fibonacciPrint(int n){
        int a=0, b=1;
        System.out.println(a + " "+ b+" ");
        for (int i =2; i<n; i++){
            int c=a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;
        }
    }
}