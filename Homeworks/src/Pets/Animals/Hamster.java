package Pets.Animals;

public class Hamster extends Animal implements Pets.Interface.Pet {

    @Override
    public String getCall() {
        return getName();
    }

    @Override
    public void Hungry(Animal target) {
        super.Hungry(target);
    }

    @Override
    public void getHungry(int hungry) {
        super.getHungry(hungry);
    }

    @Override
    public String sayHungry() {
        return "Hamster is looking at you from the cage.";
    }
}
