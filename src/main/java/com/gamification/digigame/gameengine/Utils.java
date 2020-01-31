package com.gamification.digigame.gameengine;

import java.util.Random;

public class Utils {


    public static int getRandomNumberBetweenTwo(int low, int high){
        Random r = new Random();
        return r.nextInt(high-low) + low;
    }
}
