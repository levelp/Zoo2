package ru.levelp.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

/**
 * Зоопарк
 */
public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    /**
     * @param animals Массив животных
     */
    public Zoo(Animal... animals) {
        this.animals.addAll(asList(animals));
    }

    public void show() {
        System.out.println("Все животные:");
        for (Animal animal : animals) {
            System.out.println("* " + animal);
        }
    }

    private Random gen = new Random();

    public void meet() {
        // Выбираем 2-х животных
        // 1. Случайно
        // 2. По-порядку
        // 3. Выбираем хищника и травоядного
        int idx1 = gen.nextInt(animals.size());
        int idx2 = gen.nextInt(
                animals.size() - 1);
        if (idx2 == idx1)
            idx2 = animals.size() - 1;
        // Получаем животных по индексу
        Animal a1 = animals.get(idx1);
        Animal a2 = animals.get(idx2);
        a1.meet(a2);
    }
}
