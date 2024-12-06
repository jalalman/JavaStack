package mammal.bat;

import mammal.Mammal;

public class Bat extends Mammal{


    public Bat(){
        this.energy=300;
    }
    public void fly(){
        this.energy-=50;
        System.out.println("The bat is flying and it lost 50 energy");
    }
    public void eatHumans(){
        this.energy+=25;
        System.out.println("The bat is satisfied Human Blood is tasty ! and gained 25 Energy");
    }
    public void attackTown(){
        this.energy-=100;
        System.out.println("the bat attack the town and lost 100 Energy");
    }
    }

