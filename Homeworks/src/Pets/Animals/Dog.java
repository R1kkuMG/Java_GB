package Pets.Animals;

public class Dog extends Animal implements Pets.Interface.Pet {

    @Override
    public String getCall() {
        return super.getName();
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
        return "Woof-woof!";
    }

}

