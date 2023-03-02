package org.lumaSite.Utils;

import java.util.Random;

public class Utils {

    private static final Random random;

    static{
        random = new Random();
    }

    public static String randomUser(){
        char[] characters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'};
        String value = "";

        for(int i = 5; i<6;i++) {
            if(i == 5) {
                value = value + random.nextInt(100);
            }else {
                value = value + characters[random.nextInt(4)];
            }

        }

        return value;
    }

    public static String randomPWD(){
        char[] characters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'};
        String value = "";

        for(int i = 5; i<6;i++) {
            if (i >1 && i <5) {
                value = value + Character.isLowerCase(characters[i]);
            } else {
                value = value + random.nextInt(100);
            }
        }
        return value + "!";
    }
}
