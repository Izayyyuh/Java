public class Mammal {

    protected int energyLevel;

    public Mammal() {
        energyLevel = 100;
    }

    public String displayEnergy(){
        String showEnergyLevel = "Energy level: " + energyLevel;
        System.out.println(showEnergyLevel);
        return showEnergyLevel;
    }

}