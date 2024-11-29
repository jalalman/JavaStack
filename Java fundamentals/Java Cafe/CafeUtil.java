import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {

     int getStreakGoal(int numWeeks){
        int sum=0;
        for(int i =1; i<=numWeeks; i++){
            sum+=i;
        }
        return sum;
    }
    double getOrderTotal(double[] prices){
        double total=0;
        for(int i=0; i< prices.length;i++){
            total+=prices[i];
        }

        return total;
    }
    void displayMenu(ArrayList<String> menuItems){
        for(int i =0 ;i<menuItems.size();i++){
            System.out.printf("%d %s \n",i+1,menuItems.get(i));
        }
    }
    void addCustomer(ArrayList<String> customers){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String username= scanner.nextLine();
        customers.add(username);
        System.out.println("Hello "+username);
        System.out.println(String.format("there is %d in front of you ", customers.size()));
    }
}

