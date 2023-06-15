public class Driver extends Car {
    public void useBoosters() {
        gas -= 3;
    }

    public void refuel() {
        gas += 2;
    }

    public void drive() {
        gas -= 1;
    }
}