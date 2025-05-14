package Arrays2;

public class oddevenarr {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("even number: ");
        for (int numb : array) {
            if (numb % 2 == 0) {
                System.out.print(numb+" ");
            }
        }
        System.out.println("\nodd number: ");
        for (int numb2: array){
            if (numb2%2!=0){
                System.out.print(numb2+" ");
            }
        }
    }
}
