package JavaWeek2;

public class Overriding_Polymorphism {
    public static void main(String[] args) {
        //Write a program demonstrating method overriding with Selenium-like scenario (Driver → ChromeDriver).
        start_the_browser browser= new start_Chrome_Browser();
        browser.start();
        }
}
class start_Chrome_Browser extends start_the_browser{
    @Override
    void start(){
        String browser= "chrome";
        System.out.println("Open the chrome Browser: "+ browser);
    }
}
class start_the_browser{
    void start(){
        String browser="Choose the browser";
        System.out.println("Opening the Browser: " + browser);
    }
}
