package ru.levelp.zoo;

import static ru.levelp.zoo.AnimalType.HERBIVORE;
import static ru.levelp.zoo.AnimalType.OMNIVOROUS;
import static ru.levelp.zoo.AnimalType.PREDATOR;

/**
 * Животное
 */
public class Animal {
    /**
     * Имя животного
     */
    private final String name;

    /**
     * Возраст (лет)
     */
    private final int age;

    /**
     * Тип животного
     */
    private final AnimalType type;

    /**
     * Голоден ли?
     */
    private boolean hungry;

    /**
     * Болен ли?
     */
    private boolean sick;

    /**
     * Жив ли?
     */
    private boolean alive;

    public Animal(String name, int age, AnimalType type) {
        this.name = name;
        this.age = age;
        this.type = type;
        sick = false; // Здорово
        alive = true; // Живо
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    @Override
    public String toString() {
        return name +
                "  возраст = " + age +
                "  тип = " + type +
                "  голоден = " + hungry +
                "  жив = " + alive +
                "  болен = " + sick;
    }

    public void meet(Animal other) {
        System.out.println("Встреча: " + name + " " + other.name);
        if (type == PREDATOR && other.type == HERBIVORE) {
            conflict(this, other);
        }
        if (type == HERBIVORE && other.type == PREDATOR) {
            conflict(other, this);
        }
    }

    private static void conflict(Animal predator, Animal herbivore) {
        if (!predator.hungry) return;

        System.out.println(predator.name + ": нападаю на " + herbivore.name);
        if (herbivore.sick) {
            herbivore.alive = false;
        } else {
            System.out.println(herbivore.name + " убегает");
            System.out.println(predator.name + " остался голоден");
        }
    }
}
