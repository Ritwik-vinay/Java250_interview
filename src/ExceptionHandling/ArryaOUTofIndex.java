package ExceptionHandling;

public class ArryaOUTofIndex {
    public static void main(String[] args) {

        try {
            int[] a  = {1,2,4,5,6};
            for (int i=0;i<=a.length;i++){
                System.out.println(a[i]*2);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
