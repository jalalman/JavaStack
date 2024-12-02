public class TestOrders {
    public static void main(String[] args) {
        //Item menu
        Item it1=new Item("coffe", 22);
        Item it2=new Item("latte", 33);
      Order o1= new Order();
      o1.additem(it1);
      o1.additem(it2);
      o1.setName("sami"); 
      o1.display();
        
    }
}
