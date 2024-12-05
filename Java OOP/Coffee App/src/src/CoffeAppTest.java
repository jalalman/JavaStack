import java.util.Scanner;

public class CoffeAppTest {
    public static void main(String[] args){

        CoffeeKiosk c1= new CoffeeKiosk();
        c1.addMenuItem("bannana",2.00);
        c1.addMenuItem("coffee",1.50);
        c1.addMenuItem("latte",4.50);
        c1.addMenuItem("capuccino",3.00);
        c1.addMenuItem("muffin",4.00);
        c1.AddMenuItemByInput();
        c1.newOrder();


    }
}
