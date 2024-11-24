package com.example;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;


public class AlexLionTest {
    AlexLion alexLion;


    @Before
    public void setup() throws Exception {
        alexLion = new AlexLion();
    }


    @Test
    public void alexLionWhenCreatedItIsMaleTest() {
        assertTrue(alexLion.hasMane);
    }


    @Test
    public void getFriendsReturnsListOfAlexLionFriendsListTest() {
        assertEquals(TestValues.ALEX_LION_FRIENDS, alexLion.getFriends());
    }


    @Test
    public void getPlaceOfLivingReturnsNYZooTest() {
        assertEquals(TestValues.ALEX_LION_LIVING_PLACE, alexLion.getPlaceOfLiving());
    }


    @Test
    public void getKittensReturnsZeroTest() {
        assertEquals(TestValues.ZERO_VALUE, alexLion.getKittens());
    }
}