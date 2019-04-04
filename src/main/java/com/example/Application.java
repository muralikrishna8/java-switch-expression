package com.example;

import static com.example.Days.MONDAY;

public class Application {
    public static void main(String[] args) {
        SwitchExpressionExample switchExpressionExample = new SwitchExpressionExample();

        System.out.println("========= Using Switch Expressions =========");
        System.out.println("number of letters in Monday are: " + switchExpressionExample.numberOfLetters(MONDAY));
    }
}
