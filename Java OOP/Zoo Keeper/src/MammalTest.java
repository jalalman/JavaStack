import mammal.Mammal;
import mammal.gorilla.Gorilla;
import mammal.bat.Bat;
public class MammalTest {

    public static void main(String[] args) {
        Mammal m1=new Mammal();
        m1.displayEnergy();
        Gorilla g1= new Gorilla();
        g1.displayEnergy();
        g1.eatBananas();
        g1.climb();
        g1.throwSomething();
        g1.displayEnergy();

        Bat b1= new Bat();
        b1.attackTown();
        b1.eatHumans();
        b1.fly();
        b1.displayEnergy();
    }
}