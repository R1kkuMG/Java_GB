package Pets;

import Pets.Animals.Animal;
import Pets.Animals.Cat;
import Pets.Animals.Dog;
import Pets.Animals.Hamster;
import Pets.Interface.Pet;
import Pets.Persons.Gender;
import Pets.Persons.Human;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Ваня", Gender.MALE);

        Cat cat = new Cat();
        System.out.println(cat.getInfo());
//        Animal dog = new Dog();
//        System.out.println(dog.getInfo());
//        Hamster hamster = new Hamster();
//        System.out.println(hamster.getInfo());

        // Механизм взаимодействия между человеком и животным: животное проголодалось, человек его покормил
        System.out.println();
        cat.Hungry(cat);
        human.giveFood(cat);
        System.out.println(cat.getInfo());

        System.out.println();

        // механизм взаимодействия между человеком и животным: человек зовет животное по имени, животное откликается
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Hamster());
        System.out.println(animals.get(0).getInfo());
        System.out.println(animals.get(1).getInfo());
        System.out.println(animals.get(2).getInfo());

        human.callPet((Pet)animals.get(1));
        animals.get(1).comeToHuman();
    }
}
