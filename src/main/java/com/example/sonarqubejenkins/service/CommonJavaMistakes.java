package com.example.sonarqubejenkins.service;

public class CommonJavaMistakes {

    public void goodExampleGC() {
        StringBuilder oneMillionHelloSB = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            oneMillionHelloSB.append("Hello!");
        }

        System.out.println(oneMillionHelloSB.substring(0, 6));
    }

    public boolean goodExampleComparingDiffType(String someNum) {
        return someNum.equals("1234567");
    }
}
