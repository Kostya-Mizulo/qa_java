package com.example;

import java.util.List;

public class AlexLion extends Lion{
    public AlexLion() throws Exception {
        super("Самец", new Feline());
    }

    public List<String> getFriends(){
        return List.of("Зебра Марти", "Бегеметиха Глория", "Жираф Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens(){
        return 0;
    }
}
