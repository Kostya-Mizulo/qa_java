package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static junit.framework.TestCase.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline felineMock;


    @Test
    public void getSoundReturnsMyauTest() {
        Cat cat = new Cat(felineMock);

        assertEquals(TestValues.MYAU, cat.getSound());
    }


    @Test
    public void getFoodReturnsPredatorFoodListTest() throws Exception {
        Cat cat = new Cat(felineMock);
        Mockito.when(felineMock.eatMeat()).thenReturn(TestValues.PREDATORS_FOOD_LIST);

        assertEquals(TestValues.PREDATORS_FOOD_LIST, cat.getFood());
    }
}