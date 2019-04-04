package com.example;

public class SwitchExpressionExample {
    public int numberOfLetters(Days day) {
        return switch (day) {
            case SUNDAY, MONDAY, FRIDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
        };
    }
}
