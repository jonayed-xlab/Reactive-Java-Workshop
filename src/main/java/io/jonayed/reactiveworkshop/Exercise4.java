package io.jonayed.reactiveworkshop;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono().subscribe(e -> System.out.println(e));

        // Get the value from the Mono into an integer variable
        Integer val = ReactiveSources.intNumberMono().block();
        System.out.println(val);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
