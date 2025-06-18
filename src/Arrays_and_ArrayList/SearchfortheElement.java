package Arrays_and_ArrayList;

public class SearchfortheElement {
    public static void main(String[] args) {
        //Search for an element in an array.
        int[] arr= {2,3,4,5,6,7};
        int targetelement= 5;
        for (int i: arr){
            int j= arr[i];
            if (j==targetelement){
                System.out.println(i);
                break;
            }
        }
    }
}
