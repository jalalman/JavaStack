import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeKiosk {
    ArrayList<Item> menu;
    ArrayList<Order> orders;

    public CoffeeKiosk(){
        this.menu=new ArrayList<Item>();
        this.orders=new ArrayList<Order>();
    }
    void addMenuItem(String name,double price){
        Item item=new Item();
        item.name=name;
        item.price=price;
        this.menu.add(item);

    }
    void displayMenu(){
        for (Item item : this.menu){
            System.out.println(menu.indexOf(item)+" " +item.name +" $"+item.price);
        }
    }

    void newOrder(){

        Scanner sacnner=new Scanner(System.in);
        System.out.print("Please enter customer name for new order: ");
        String userInputName=sacnner.nextLine();
        Order order =new Order();
        order.name=userInputName;
        this.displayMenu();


        String itemNumber= "";
        while (!itemNumber.equals("q")){
            System.out.println("Please enter a menu item index or q to Quit: ");
            try {
                itemNumber= sacnner.nextLine();
                Item item=this.menu.get(Integer.parseInt(itemNumber));
                order.items.add(item);
                order.total+=item.price;
            }
            catch (Exception e){
                System.out.println("Error: Please enter a menu item index or q to Quit: ");

            }

        }
        sacnner.close();
        System.out.println("Customer name: "+userInputName);
        for (Item item : order.items){
           System.out.println(item.name+"--"+item.price);
       }
        System.out.println("Total: $"+order.total);
    }

    void AddMenuItemByInput(){
        Scanner input= new Scanner(System.in);

        while(true){
            try {
                System.out.println("Enter item name or 'q' to quit : ");
                String name = input.nextLine();

                if (name.equals("q")) break;
                System.out.println("Enter item price: ");
                double price = input.nextDouble();
                input.nextLine();

                addMenuItem(name, price);
                System.out.println("Item added: " + name + " - $" + price);
            }
            catch (Exception e){
                System.out.println("Invalid price. Please enter a number.");
                input.nextLine();
            }

    }}

}
