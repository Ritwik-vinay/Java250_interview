package Chapter_3_;

public class exercise3a {
    public static void main(String[] args) {
        Book[] book = new Book[3];
        int x=0;
        book[0]= new Book();
        book[1]= new Book();
        book[2]= new Book();

        book[0].title="The Grapes of Java";
        book[1].title= "The Java Gatsby";
        book[2].title= "The Java CookBook";
        book[0].author= "bob";
        book[1].author= "sue";
        book[2].author= "ian";
        while (x<3){
            System.out.print(book[x].title);
            System.out.print(" by ");
            System.out.println(book[x].author);
            x=x+1;
        }
    }

}
class Book{
    String title;
    String author;

}
