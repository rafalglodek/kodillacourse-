package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    ArrayList<Integer> evenNumbersList = new ArrayList<>();

    public List<Integer> exterminate(List<Integer> numbers) {

        int element = 0;
        for (int n = 0; n < numbers.size(); n++) {
            element = numbers.get(n);
            // checking if an element is even or odd
            if (element % 2 == 0) {

                evenNumbersList.add(element);
            }
        }
        return evenNumbersList;
    }
}