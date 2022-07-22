package Pets.Persons;

import Pets.Interface.Pet;

import java.util.Random;

public class Human implements Pets.Interface.Human {
    private static String name;
    private Gender gender;
    protected static Random r;

    /**
     * Конструктор для создания объекта класса Human
     * @param name - имя
     * @param gender - пол
     */
    public Human(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    /**
     * Метод вызова человеком животного по имени
     * @param target - животное
     */
    public void callPet(Pet target) {
        System.out.println("Human say: '" + target.getCall() + "!'");
    }

    /**
     * Метод кормления животного
     * @param target - животное
     */
    public void giveFood(Pet target) {
        if (target.sayHungry() != "") {
            int food = new Random().nextInt(20, 40);
            target.eat(food);
        }
    }
}
