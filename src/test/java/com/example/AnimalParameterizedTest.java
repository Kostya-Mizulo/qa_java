package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    private final String squad;
    private final List<String> expectedListOfFood;


    public AnimalParameterizedTest(String squad, List<String> expectedListOfFood){
        this.squad = squad;
        this.expectedListOfFood = expectedListOfFood;
    }


    @Parameterized.Parameters(name = "Тестовые данные: тип животного - {0}, ожидаемый ответ - {1}")
    public static Object[][] getParameters(){
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }


    @Test
    public void getFoodWithCorrectSquadReturnsListOfFood() throws Exception {

        Animal animal = new Animal();
        List<String> actualList = animal.getFood(squad);

        assertEquals(actualList, expectedListOfFood);
    }
}