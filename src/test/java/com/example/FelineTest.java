package com.example;

import org.junit.Before;
import org.junit.Test;
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
        assertEquals(TestValues.ONE_VALUE, feline.getKittens());
    }


    @Test
    public void getKittensWith5InAttributeReturns5Test() {
        assertEquals(TestValues.FIVE_VALUE, feline.getKittens(TestValues.FIVE_VALUE));
    }
}