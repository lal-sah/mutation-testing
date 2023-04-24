package com.lal.mutationtesting;

public class NumberUtils {
    public static boolean isPositive(int number) {
        boolean result = false;
        if (number >= 0) {
            result = true;
        }
        return result;

    }
}
