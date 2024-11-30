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

    void printPriceChart(String product,double price ,int maxQuantity){
        if (maxQuantity<=3){
            System.out.println(product);
        for(int i =1 ;i <= maxQuantity ; i++){
            if (i == 1){
                System.out.printf("%d - $ %.2f \n",i,(price*i));
            }
            else{
                System.out.printf("%d - $ %.2f \n",i,(price*i)-0.5);
            }
            }
        }
        else{
        System.out.println("you not allowed to buy more that 3 items per time");
    }}

    boolean displayMenu(ArrayList<String> menuItems,ArrayList<Double> prices){
        if (menuItems.size()== prices.size()){
            for(int i =0 ;i<menuItems.size();i++){
                System.out.printf("%d %s -- $%.2f \n",i,menuItems.get(i),prices.get(i));
            }
            return true;
        }

        return false;
    }
    ArrayList<String> addCustomers(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> clients=new ArrayList<String>();
        String username= scanner.nextLine();
        while(username != "q" || username != "Q"){
            System.out.println("Please enter your name: ");
            username= scanner.nextLine();
            clients.add(username);
        }
        return clients;
    }
}




