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
    Predator predatorMock;
    @Test
    public void getSoundReturnsMyau() {
        Cat cat = new Cat(new Feline());

        assertEquals(TestValues.MYAU, cat.getSound());
    }


    @Test
    public void getFoodReturnsPredatorFoodList() throws Exception {
        Cat cat = new Cat(new Feline());
        Mockito.when(predatorMock.eatMeat()).thenReturn(TestValues.PREDATORS_FOOD_LIST);

        assertEquals(TestValues.PREDATORS_FOOD_LIST, cat.getFood());
    }
}
