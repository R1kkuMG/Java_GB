package Pets.Interface;

import Pets.Animals.Animal;

public interface Pet {
    String getCall();
    void Hungry(Animal target);
    void getHungry(int hungry);
    String sayHungry();
    void eat(int food);
    void comeToHuman();
}
