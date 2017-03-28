package ru.levelp.list;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class ConModDemo {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(
                asList(1, 3, 4, 10, 5));
        int sum = 0;
        for (int value : integers) {
            sum += value; // sum = sum + value;
            integers.remove(new Integer(3));
        }
        System.out.println("sum = " + sum);
    }
}
