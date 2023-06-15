public class Bat extends Mammal {

    public Bat() {
        energyLevel = 300;
    }

    public void fly() {
        System.out.println("Bat is flying away... ");

        energyLevel -= 50;
    }

    public void eatHumans() {
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("Building are burning!!");
        energyLevel -= 100;
    }
}