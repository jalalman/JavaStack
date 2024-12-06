package mammal;

public class Mammal {
    protected int energy=100;
    public int displayEnergy(){
        System.out.printf("the current energy for this %s is %d \n\n",getClass().getSimpleName(),this.energy);
        return this.energy;
    }
}
