package com.example.SpringRestApi.PracticeUnitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd(){

       Calculator cal = new Calculator();
       Integer actualResult = cal.sum(10,20);
       Integer expectedResult = 30;

       assertEquals(actualResult, expectedResult);

    }
}
