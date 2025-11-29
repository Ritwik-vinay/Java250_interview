public class arrFunc2 {
    static void main() {
        int[][] marks= {{65,45},{80,79},{40,75}};
        System.out.println(marks[0][0]);
     for (int i=0;i<marks.length;i++){
         for (int j=0;j<marks[i].length;j++){
             System.out.print(marks[i][j] + " ");
         }
         System.out.println();
     }
    }
}
