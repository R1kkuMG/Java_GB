package Pets;

import Pets.Animals.*;
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
        Animal dog = new Dog();
        System.out.println(dog.getInfo());
        Hamster hamster = new Hamster();
        System.out.println(hamster.getInfo());

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

        // сортировка животных по показателю еды
        List<Animal> animals2 = new ArrayList<>();
        animals2.add(new Cat());
        animals2.add(new Dog());
        animals2.add(new Hamster());

        // 1ый способ сортировки с созданием нового класса FoodComparator
        animals2.sort(new FoodComparator());
        System.out.println(animals2);

        // 2ой способ сортировки с созданием lambda функции
        animals2.sort((animal1, animal2) -> Integer.compare(animal1.getFood(), animal2.getFood()));
        System.out.println(animals2);

        // сортировка животных по имени
        animals2.sort(new NameComparator());
        System.out.println(animals2);


    }
}
