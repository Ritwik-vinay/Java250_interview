public class array2d {
    static void main() {
        //2D Array
        //{00},{0,1}
        String[][] fruits = {
                {"Apple",  "Avacardo"},
                {"Banana","Berries"},
                {"CranBerry","Cherry"}
        };
        for (int i =0; i<fruits.length;i++){
            for (int j =0;j<fruits[i].length; j++){
                System.out.print(fruits[i][j] + " ");
            }
            System.out.println();
        }

    }
}
