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
    public void getKittensCallsFelineGetKittensWithoutAttributeTest() throws Exception {
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
    public void doesHaveManeWhenMaleReturnsTrueTest() throws Exception {
        Lion lion = new Lion(TestValues.SEX_MALE, felineMock);

        assertTrue(lion.doesHaveMane());
    }


    @Test
    public void doesHaveManeWhenFemaleReturnsFalseTest() throws Exception {
        Lion lion = new Lion(TestValues.SEX_FEMALE, felineMock);

        assertFalse(lion.doesHaveMane());
    }


    @Test
    public void createLionWithWrongSexThrowsExceptionTest(){
        try {
            Lion lion = new Lion(TestValues.WRONG_SEX, felineMock);

            fail(TestValues.EXCEPTION_EXPECTED_NOT_TRHOWN);
        } catch (Exception e) {
            assertEquals(TestValues.WRONG_SEX_EXCEPTION_TEXT,e.getMessage());
        }
    }


    @Test
    public void getFoodCallsFelineGetFoodWithPredatorTest() throws Exception {
        Lion lion = new Lion(TestValues.SEX_MALE, felineMock);
        lion.getFood();

        Mockito.verify(felineMock).getFood(TestValues.PREDATOR);
    }


    @Test
    public void getFoodReturnsListOfPredatorFoodTest() throws Exception {
        Lion lion = new Lion(TestValues.SEX_MALE, felineMock);
        Mockito.when(felineMock.getFood(TestValues.PREDATOR)).thenReturn(TestValues.PREDATORS_FOOD_LIST);

        assertEquals(TestValues.PREDATORS_FOOD_LIST, lion.getFood());
    }
}