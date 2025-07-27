package JavaWeek2;

public class smallest {
    public static void main(String[] args) {
        int[] a= {10,15,25,9,18};
        int smallest= a[0];
        for (int i=0;i <=a.length-1;i++){
            if (a[i]<smallest){
                smallest= a[i];
            }
        }
        System.out.println(smallest);
    }
}
