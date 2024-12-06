package mammal.gorilla;

import mammal.Mammal;

public class Gorilla extends Mammal{
    public void throwSomething(){
        this.energy-=5;
        System.out.println("The gorilla has thrown Something at you!! it lost 5 Energy");
    }
    public void eatBananas(){
        this.energy+=10;
        System.out.println("The gorilla is satisfied bananna is Yummy ! and gained 10 Energy");
    }
    public void climb(){
        this.energy-=10;
        System.out.println("the gorilla has climbed the tree and lost 10 Energy doing that");
    }
}
