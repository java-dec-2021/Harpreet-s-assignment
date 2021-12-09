public class Gorilla extends Mammal{
    public Gorilla(int energyLevel){
        super(energyLevel);
    }
    public void throwSomething(){
        System.out.println(" The gorilla has thrown something");
        this.energyLevel -= 5;
    }
    public void eatBananas(){
        System.out.println(" The gorilla has just feasted on some delicious bananas");
        this.energyLevel += 10;
    }
    
    public void climb(){
        System.out.println(" The gorilla has climbed on top of the tree");
        this.energyLevel -= 10;
    }
}