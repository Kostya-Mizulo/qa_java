package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AnimalTest {

    @Test
    public void getFoodIncorrectSquadThrowsException() {
        Animal animal = new Animal();

        try {
            animal.getFood("Всеядное");
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }
}