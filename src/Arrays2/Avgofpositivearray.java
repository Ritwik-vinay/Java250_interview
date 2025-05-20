package Arrays2;

public class Avgofpositivearray {
    public static void main(String[] args) {
        int[] arr={-1,0,-2,20,30,-4,10};
        int sum=0;
        int count=0;
        for(int i=0; i<arr.length;i++){
            if (arr[i]>0){
                sum= sum+arr[i];
                count++;

            }
        }
        if (sum>0){
            double average=(double) sum/count;
            System.out.println("the average of positive number is " + average);
        }
        else {
            System.out.println("No positive number in this array");
        }
    }

}
