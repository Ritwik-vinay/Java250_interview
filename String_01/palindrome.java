public class palindrome {
    // Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)

    // Input "String " amd output string -> is palindrome or not palindrome
    // Plaindrome original string matches -> reverse string then it is a palindrome
    public static void main(String[] args) {
        String originalString  = "Ritwik";
        String reverseString ="";

        for (int i=originalString.length()-1; i>=0;i--){
            //4 3 2 1 0
            reverseString= reverseString+ originalString.charAt(i);

        }
        if (originalString.equalsIgnoreCase(reverseString)){
            System.out.println("It is a Palindrome ");
        }
        else {
            System.out.println("It is not a palindrome");
        }
        }

    }




