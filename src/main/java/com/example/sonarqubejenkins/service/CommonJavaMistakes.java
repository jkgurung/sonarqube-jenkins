package com.example.sonarqubejenkins.service;

import org.w3c.dom.ls.LSOutput;

public class CommonJavaMistakes {

    /*
    Excessive Garbage allocation: this happens when the program creates a lot of short-lived objects.
    The gc works continuously, removing unneeded objects from memory, which impacts apps performance
    in a negative way.
     */
    public void badExampleGC() {
        String oneMillionHello = "";
        for (int i = 0; i < 1000000; i++) {
            oneMillionHello = oneMillionHello + "Hello!";
        }

        System.out.println(oneMillionHello.substring(0, 6));
    }

    public void goodExampleGC() {
        StringBuilder oneMillionHelloSB = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            oneMillionHelloSB.append("Hello!");
        }

        System.out.println(oneMillionHelloSB.substring(0, 6));
    }


    public boolean badExampleComparingDiffType(String someNum) {
        return Long.valueOf(someNum).equals("1234567");
    }
}
