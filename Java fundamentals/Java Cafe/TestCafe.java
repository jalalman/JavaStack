import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {

    /*
      You will need add 1 line to this file to create an instance
      of the CafeUtil class.
      Hint: it will need to correspond with the variable name used below..
    */
    CafeUtil C1= new CafeUtil();
    System.out.println("\n----- Price Chart -----");
    C1.printPriceChart("coffe",3.5, 3);
        /* ============ App Test Cases ============= */

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", C1.getStreakGoal(10));

        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",C1.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");
        ArrayList<Double> prices= new ArrayList<Double>();
        prices.add(3.5);
        prices.add(2.5);
        prices.add(1.5);
        prices.add(5.5);
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        C1.displayMenu(menu);
        System.out.println("-----Overloaded Display Menu Test-----");
        C1.displayMenu(menu, prices);
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            C1.addCustomer(customers);
            System.out.println("\n");
        }

    }
}