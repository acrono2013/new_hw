package com.example.util;

public class StringUtil {

    public static String reverseLetters (String phrase) {
        char [] chars = phrase.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
