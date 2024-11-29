public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double coffee=2.5;
        double cappuccino=3.0;
        double latte=4.0;

        // Customer name variables (add yours below)
        String customer1 = "Shatha";
        String customer2="Ahmad";
        String customer3="Sali";
        String customer4="Adam";


        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2=true;
        boolean isReadyOrder3=true;
        boolean isReadyOrder4=true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:


        // ** Your customer interaction print statements will go here ** //
        //sali order 1
        if (isReadyOrder1){
            System.out.println(String.format("%s %s %s", generalGreeting, customer3 ,readyMessage));
        }
        else{
            System.err.println(String.format("%s %s",customer3 ,pendingMessage));
        }
        //Ahmad Order 2
        if (isReadyOrder2){
            System.out.print(String.format("%s %s %s ,", generalGreeting, customer2 ,readyMessage));
            System.out.println(String.format("%s %.2f", displayTotalMessage,cappuccino));
        }
        else{
            System.err.println(String.format("%s %s",customer2 ,pendingMessage));
        }
        // Sali order 3
        if (isReadyOrder3){
            double items=2;
            System.out.println(String.format("%s, %s %.2f", customer3,displayTotalMessage,latte*items));
        }
        else{
            System.err.println(String.format("%s %s",customer3 ,pendingMessage));
        }
        //Adam order 4
        if (isReadyOrder2){
            System.out.print(String.format("%s %s %s ,", generalGreeting, customer4 ,readyMessage));
            System.out.println(String.format("%s %.2f", displayTotalMessage,latte));
        }
        else{
            System.err.println(String.format("%s %s",customer4 ,pendingMessage));
        }
    }
}