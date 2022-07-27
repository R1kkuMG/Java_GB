package Pets.Animals;

import java.util.Comparator;

public class FoodComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal animal1, Animal animal2) {
        return Integer.compare(animal1.food, animal2.food);
    }

}
