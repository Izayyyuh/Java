public class Gorilla extends Mammal {

    
    public void throwSomething() {
        energyLevel -= 5;

        System.out.println("The Gorilla has thrown something");
    }
    public void eatBananas() {
        energyLevel += 10;

        System.out.println("The Gorilla is satisfied with its bananas");
    }
    public void climb() {
        energyLevel -= 10;

        System.out.println("The Gorilla has climbed a tree");
    }

}