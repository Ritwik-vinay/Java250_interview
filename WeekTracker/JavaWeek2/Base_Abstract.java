package JavaWeek2;

public class Base_Abstract {
    public static void main(String[] args) {
        AutomationTest at = new AutomationTest();
        at.clickElement();
        at.browser();

    }
}
class AutomationTest extends base   {
    public void browser(){
        System.out.println("Automation Test Opening the Browser");
    }
    @Override
    void clickElement(){
        System.out.println("Clicking the Element");
    }

}
abstract class  base implements StartBrowser{
   abstract void clickElement();


}
interface StartBrowser{
    void browser();
}