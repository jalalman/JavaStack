public class TestOrders {
    public static void main(String[] args) {
        //Item menu
        Item item1=new Item();
        item1.name="mocha";
        item1.price=3.75;
        Item item2=new Item();
        item2.name="latte";
        item2.price=2.50;
        Item item3=new Item();
        item3.name="drip coffee";
        item3.price=3.00;
        Item item4=new Item();
        item4.name="cappuccino";
        item4.price=4.0;
        // Orders List
        Order order1=new Order();
        order1.name="Cindhuri";
        order1.items.add(item1);
        order1.total=1;
        order1.ready=true;
        Order order2=new Order();
        order2.name="Jimmy";
        order2.ready=true;
        Order order3=new Order();
        order3.name="Noah";
        order3.items.add(item4);
        Order order4=new Order();
        order4.name="Sam";
        order4.items.add(item2);
        order4.items.add(item2);
        System.out.println(order1.total);

    }
}
