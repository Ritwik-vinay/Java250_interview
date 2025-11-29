public class arraysFunc {
   public static void main() {
        String[][] arr= new String[3][2];
        arr[0][0]= "Admin";
       arr[0][1]= "Adam";
       arr[1][0]= "Bhaskar";
       arr[1][1]= "Bahadur";
       arr[2][0]= "Chetan";
       arr[2][1]= "Chaubey";
       for (int i=0; i<arr.length;i++){
           for (int j=0 ; j<arr[i].length;j++){
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }



    }
}
