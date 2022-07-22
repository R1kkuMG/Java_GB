package Pets.Animals;

import Pets.Interface.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Animal {
    protected String name;
    protected int food;
    protected int maxFood;

    List<String> names = new ArrayList<>(List.of("Anny", "Fluffy", "Lordy", "Kitty", "Johnny", "Graf", "Baron",
            "Barsik", "Imperator", "Jimmy", "Bastinda", "Cleopatra", "Estella"));

    /**
     * Метод присвоения случайного имени элементу из коллекции names
     * @return случайное имя из коллекции
     */
    private String getRandomName() {
        Random r = new Random();
        int n = r.nextInt(names.size() - 1);
        return names.get(n);
    }

    /**
     * Конструктор для создания объекта класса Animal
     * @param name - имя
     * @param food - показатель еды
     */
    public Animal(String name, int food) {
        setName(name);
        this.food = food;
        this.maxFood = food;
    }

    /**
     * Конструктор для создания объекта со случайным показателем еды и случайным именем
     */
    public Animal() {
        this("", new Random().nextInt(100, 150));
        setName(getRandomName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод для получения информации об объекте
     * @return имя, уровень еды и тип животного
     */
    public String getInfo() {
        return String.format("Name: %s  Food: %d  Type: %s",
                this.name, this.food, this.getClass().getSimpleName());
    }

    /**
     * Метод установления случайного числа для снижения уровня еды
     * @param target - животное
     */
    public void Hungry(Animal target) {
        int hungry = new Random().nextInt(10, 40);
        target.getHungry(hungry);
        System.out.println(target.getInfo());
        if (this.food < 100) {
            System.out.println(sayHungry());
        }
    }

    /**
     * Метод получения снижения уровня еды
     * @param hungry - показатель голода
     */
    public void getHungry(int hungry) {
        if (this.food - hungry > 0) {
            this.food -= hungry;
        }
    }

    /**
     * Метод оповещения, что показатель еды у животного снизился
     * @return перегруженную строку в зависимости от типа объекта
     */
    public String sayHungry() {
        return "";
    }

    /**
     * Метод восполнения показателя еды
     * @param food - еда
     */
    public void eat(int food) {
        if (this.food < 100) {
            if (this.food + food > this.maxFood) {
                this.food = this.maxFood;
            } else {
                this.food = this.food + food;
            }
        }
    }

    /**
     * Метод реагирования животного на зов человека
     */
    public void comeToHuman() {
        System.out.println(name + " is coming...");
    }

}
