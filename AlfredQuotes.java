import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello " + name;
    }

    public String guestGreeting(String name, int favNumber) {
        // YOUR CODE HERE
        return "Hello " + name + ", is your favorite number " + favNumber + "?";
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date (); //create new instance of date
        return "Today's date is " + date; 
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        return "Alexis, turn on the lights." + '\n' + conversation;
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

