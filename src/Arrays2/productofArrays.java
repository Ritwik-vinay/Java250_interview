package Arrays2;

public class productofArrays {
    public static void main(String[] args) {
        int[] arrays= {2,3,4,5};
        int product =1;
        for (int i=0; i<arrays.length;i++){
            product= product* arrays[i];
        }
        System.out.println(product);
    }
}
