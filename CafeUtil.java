import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {

    public int getStreakGoal() {
        int purchasesNeeded = 0;
        int zero = 0;
        int ten = 10;
        for(int i = zero; i<=ten; i++) {
            purchasesNeeded += i;
        }
        return purchasesNeeded;
    }

    public double getOrderTotal(double[]prices) { // takes in array of double values named 'prices'

        double totalCostOfPrices = 0.0;  

        for (int i = 0; i < prices.length; i++) {
            totalCostOfPrices += prices[i]; //adds each index value of prices to the total cost
        }
        return totalCostOfPrices;
    }

    public void displayMenu(ArrayList<String> menuItems) {

        for (int i = 0; i < menuItems.size(); i++){
            String menuItem = menuItems.get(i); //each item on the menu at every index position is converted into a string object as a 'menu item'
            System.out.println(i + "\t" + menuItem); //prints index position and name of menu item
        }
        
    }

    public void addCustomer(ArrayList<String> customers){
    // int customersArrayLength = customers.array
    System.out.println("Please enter your name.");
    String userName = System.console().readLine();
    customers.add(userName);
    System.out.println("Hello, " + userName + "!");
    System.out.println("There are " +  (customers.size() - 1) + " people in font of you.");
    }
    

}