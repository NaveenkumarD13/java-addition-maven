package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import  org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void TestAdd(){
        Calculator c=new Calculator();
        assertEquals(40,c.add(20,20));
    } 
}
