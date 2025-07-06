package Chapter_1_;

public class BottleSong {
    public static void main(String[] args) {
        int bottlesnum = 10;
        String word = "bottles";
        while (bottlesnum > 0) {
            if (bottlesnum == 1) {
                word = "bottle";
            }
            System.out.println(bottlesnum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesnum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall, ");
            bottlesnum = bottlesnum - 1;
            if (bottlesnum > 0) {
                System.out.println("There will be " + bottlesnum + " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There will be no green bottles, hanging on the wall");
            }
        }
    }


}

