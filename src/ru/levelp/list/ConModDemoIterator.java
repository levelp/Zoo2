package ru.levelp.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

public class ConModDemoIterator {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(
                asList(1, 3, 4, 10, 5));
        int sum = 0;

        Iterator<Integer> it = integers.iterator();
        while (it.hasNext()) {
            int value = it.next();
            sum += value; // sum = sum + value;
            if (value == 3)
                it.remove();
        }
        System.out.println("sum = " + sum);
        System.out.println(integers);
    }
}
