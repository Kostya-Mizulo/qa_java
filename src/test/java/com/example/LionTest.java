package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline felineMock;


    @Test
    public void getKittensCallsFelineGetKittensWithoutAttribute() throws Exception {
        Lion lion = new Lion(TestValues.SEX_MALE, felineMock);
        lion.getKittens();

        Mockito.verify(felineMock).getKittens();
    }


    @Test
    public void getKittensReturns1InResultTest() throws Exception {
        Lion lion = new Lion(TestValues.SEX_MALE, felineMock);
        Mockito.when(felineMock.getKittens()).thenReturn(1);

        assertEquals(1, lion.getKittens());
    }


    @Test
    public void doesHaveManeWhenMaleReturnsTrue() throws Exception {
        Lion lion = new Lion(TestValues.SEX_MALE, felineMock);

        assertTrue(lion.doesHaveMane());
    }


    @Test
    public void doesHaveManeWhenFemaleReturnsFalse() throws Exception {
        Lion lion = new Lion(TestValues.SEX_FEMALE, felineMock);

        assertFalse(lion.doesHaveMane());
    }


    @Test
    public void createLionWithWrongSexThrowsException(){
        try {
            Lion lion = new Lion(TestValues.WRONG_SEX, felineMock);

            fail("Exception expected but not thrown");
        } catch (Exception e) {
            assertEquals(TestValues.WRONG_SEX_EXCEPTION_TEXT,e.getMessage());
        }
    }


    @Test
    public void getFoodCallsFelineGetFoodWithPredator() throws Exception {
        Lion lion = new Lion(TestValues.SEX_MALE, felineMock);
        lion.getFood();

        Mockito.verify(felineMock).getFood(TestValues.PREDATOR);
    }


    @Test
    public void getFoodReturnsListOfPredatorFood() throws Exception {
        Lion lion = new Lion(TestValues.SEX_MALE, felineMock);
        Mockito.when(felineMock.getFood(TestValues.PREDATOR)).thenReturn(TestValues.PREDATORS_FOOD_LIST);

        assertEquals(TestValues.PREDATORS_FOOD_LIST, lion.getFood());
    }
}