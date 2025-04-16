package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char[] str = new char[52];
        for (int i = 0; i < str.length; i++) {
            if (i <= 25)
                str[i] = (char)(97 + i);
            else
                str[i] = (char)(65 + i - 26);
        }
        String result = "";

        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(str.length);
            result = result + str[randomIndex];
        }
        int number = random.nextInt(10);
        result = result + number;
        System.out.println(result);
    }

}