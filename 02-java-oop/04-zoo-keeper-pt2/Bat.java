public class Bat extends Mammal{
    // Constructor
    public Bat (){
        super(300);
    }
    // methods
    public void fly(){
        System.out.print(" The bat is flying highhhhh");
        this.energyLevel -= 50;
    }
    public void eatHumans(){
        this.energyLevel += 25;
    }
    public void attackTown(){
        System.out.println(" Oh no the town has been attacked. This town is on FIREEEE!");
        this.energyLevel -=100;
    }
}