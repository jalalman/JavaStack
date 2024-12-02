import java.util.ArrayList;

public class Order {
    private String name;
    public double total;
    private boolean ready;
    private ArrayList<Item>items;
    ///CONTSRUCTOR
    Order(){
        this.name="Guest";
        this.items= new ArrayList<Item>();
    }
    //CONTSRUCTOR OVERLOADED
    Order(String name){
        this.name=name;
        this.items= new ArrayList<Item>();
    }
    //setters
    void setName(String name){
        this.name=name;
    }
    void setReady(boolean ready){
        this.ready=ready;
    }
    void setItems(ArrayList<Item> items){
        this.items=items;
    }
    //getters
    String getName(){
        return this.name;

    }
    double getTotal(){
        return this.total;
    }
    boolean isReady(){
        return this.ready;
    }
    //additem
    void additem(Item Item ){
        this.items.add(Item);
    }
   

    //getStatusMessage
    String getStatusMessage(){
        if (isReady()){
            return "Your order is ready.";
        }
        return "Thank you for waiting. Your order will be ready soon.";
    }

    //getOrderTotal
    double getOrderTotal(){
        for (Item item : items) {
            this.total+=item.getPrice();
        }
        return this.total;
    }
    //display
    void display(){
        System.out.println("Cutomer name: "+this.getName());
        for (Item item : items) {
            System.out.println(item.getName()+" - $"+item.getPrice());
        }
        System.out.println("Total: "+getOrderTotal());
    }
}