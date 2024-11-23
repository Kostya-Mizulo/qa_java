package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;


public class FelineTest {
    Feline feline;
    @Before
    public void setup() {
        feline = new Feline();
    }


    @Test
    public void eatMeatReturnsPredatorFoodListTest() throws Exception {
        assertEquals(TestValues.PREDATORS_FOOD_LIST, feline.eatMeat());
    }


    @Test
    public void getFamilyReturnsFelineTextTest() {
        assertEquals(TestValues.FELINE, feline.getFamily());
    }


    @Test
    public void getKittensWithoutAttributesReturns1Test() {
        assertEquals(1, feline.getKittens());
    }


    @Test
    public void getKittensWith5InAttributeReturns5Test() {
        assertEquals(5, feline.getKittens(5));
    }
}