package ru.levelp.zoo;

public class Main {

    public static void main(String[] args) {
        Animal rabbit = new Animal("Ушастик", 2,
                AnimalType.HERBIVORE);
        rabbit.setHungry(true);
        Animal wolf = new Animal("Эвтаназия", 7, AnimalType.PREDATOR);
        wolf.setHungry(true);

        Zoo zoo = new Zoo(rabbit, wolf);
        zoo.show();
        zoo.meet();
    }
}
