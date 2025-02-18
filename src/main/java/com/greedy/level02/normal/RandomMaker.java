package com.greedy.level02.normal;

import java.util.Random;

public class RandomMaker {

    public static final Random random = new Random();


    public static int randomNumber(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }


    public static String randomUpperAlpabet(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = (char)(random.nextInt(26) + 'A');
            sb.append(c);
        }
        return sb.toString();
    }

    public static String rockPaperScissors() {
        int choice = random.nextInt(3);
        switch(choice) {
            case 0:
                return "가위";
            case 1:
                return "바위";
            case 2:
                return "보";
            default:
                return "";
        }
    }

    public static String tossCoin() {
        int choice = random.nextInt(2);
        return (choice == 0) ? "앞면" : "뒷면";
    }
}
