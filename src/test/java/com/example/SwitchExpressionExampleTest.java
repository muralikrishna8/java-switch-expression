package com.example;

import org.junit.Assert;
import org.junit.Test;

import static com.example.Days.MONDAY;

public class SwitchExpressionExampleTest {

    @Test
    public void shouldReturnTheNumberOfLetterForInADay() {
        SwitchExpressionExample switchExpressionExample = new SwitchExpressionExample();

        Assert.assertEquals(6, switchExpressionExample.numberOfLetters(MONDAY));
    }
}