package JavaWeek1;

public class abctract_Java_BookDetails {
    public static void main(String[] args) {
        Book book = new Book();
        book.detailsOfBook();
        book.BooksDetailedDesc();
    }

}
class Book extends BookDetails{
    public void detailsOfBook(){
        System.out.println("Abstract method is extended");
    }
}

abstract class BookDetails{
    abstract void detailsOfBook();
    public void BooksDetailedDesc(){
        System.out.println("I am having details of book in the abstract class");
    }
}
