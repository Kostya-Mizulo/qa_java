package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AnimalTest {

    Animal animal;

    @Before
    public void setup(){
        animal = new Animal();
    }

    @Test
    public void getFoodIncorrectSquadThrowsException() {

        try {
            animal.getFood("Всеядное");
            fail("Exception expected but not thrown");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

    @Test
    public void getFamilyReturnsFamilyDescription() {

        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualResult = animal.getFamily();

        assertEquals(expectedResult, actualResult);
    }
}