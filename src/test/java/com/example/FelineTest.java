package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    Feline felineSpy;


    @Test
    public void eatMeatCallsGetFoodMethodWithPredatorAttribute() throws Exception {
        felineSpy.eatMeat();

        Mockito.verify(felineSpy, Mockito.times(1)).getFood(TestValues.PREDATOR);
    }


    @Test
    public void eatMeatReturnsPredatorFoodList() throws Exception {
        Feline feline = new Feline();
        assertEquals(TestValues.PREDATORS_FOOD_LIST, feline.eatMeat());
    }


    @Test
    public void getFamilyReturnsFelineText() {
        Feline feline = new Feline();

        assertEquals(TestValues.FELINE, feline.getFamily());
    }


    @Test
    public void getKittensWithoutAttributesCallsGetKittensWithOneInAttribute() {
        felineSpy.getKittens();

        Mockito.verify(felineSpy, Mockito.times(1)).getKittens(1);
    }


    @Test
    public void getKittensWith5InAttributeReturns5() {
        Feline feline = new Feline();

        assertEquals(5, feline.getKittens(5));
    }
}