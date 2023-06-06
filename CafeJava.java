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
        double dripCoffee = 3.75;
        double latte = 5.0;
        double cappucino = 7.0;
        double priceDifference = ((latte - dripCoffee));
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)

    	// ** Your customer interaction print statements will go here ** //

        if(isReadyOrder1) {
            System.out.println(customer1 + readyMessage + '\n' + displayTotalMessage + dripCoffee);
        }
            else{
                System.out.println(customer1 + pendingMessage); 
            }
        
        if(isReadyOrder4) {
            System.out.println(customer4 + readyMessage + '\n' + displayTotalMessage + cappucino);
        }
        else{
            System.out.println(customer4 + pendingMessage);
        }
        
        if(isReadyOrder2) {
            System.out.println(customer2 + ',' + displayTotalMessage + (latte*2));
        }
        else{
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(customer3 + ',' + displayTotalMessage + priceDifference);
    }
}
