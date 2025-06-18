package Arrays_and_ArrayList;

public class copyOneArrToAnotherArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8};

        int[] copy= new int[arr.length];
        for (int i=0;i<=arr.length-1;i++){
            copy[i]= arr[i];
            System.out.print(copy[i] + " , ");
        }

    }
}
