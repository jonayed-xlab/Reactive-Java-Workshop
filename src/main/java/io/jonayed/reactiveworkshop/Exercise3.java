package io.jonayed.reactiveworkshop;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        List<Integer> integers = ReactiveSources.intNumbersFlux().toStream().toList();
        System.out.println("List is " + integers);
        System.out.print("List Size " + integers.size());

    }

}
