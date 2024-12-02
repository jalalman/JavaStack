public class Item {
    private String name;
    private double price;

    //CONTSRUCTOR

    Item(String name,double price){
        this.name=name;
        this.price=price;
    }

    //SETTERS
    void setName(String name){
        this.name=name;
    }
    void setPrice(double price){
        this.price=price;
    }
    //GETTERS
    String getName(){
        return this.name;
    }
    double getPrice(){
        return this.price;
    }
}
