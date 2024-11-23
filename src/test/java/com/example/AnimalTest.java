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
    public void getFoodIncorrectSquadThrowsExceptionTest() {

        try {
            animal.getFood(TestValues.OMNIVORE);
            fail("Exception expected but not thrown");
        } catch (Exception e) {
            assertEquals(e.getMessage(), TestValues.UNSUPPORTED_ANIMAL_TYPE_EXCEPTION);
        }
    }

    @Test
    public void getFamilyReturnsFamilyDescriptionTest() {

        String expectedResult = TestValues.GET_FAMILY_ANIMAL_TEXT;
        String actualResult = animal.getFamily();

        assertEquals(expectedResult, actualResult);
    }
}