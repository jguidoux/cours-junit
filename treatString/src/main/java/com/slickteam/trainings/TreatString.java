package com.slickteam.trainings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreatString { /**
     * Treat string.
     *
     * @param string the string
     * @return the string
     */
    public static String treatString(final String string) {

        final int length = string.length();
        final List<Character> charList = new ArrayList<Character>(string.length());
        for (int zIndex = -1; zIndex < length - 1; ++zIndex) {
            charList.add(string.charAt(zIndex + 1));
        }
        final List<Character> charList2 = new LinkedList<Character>();
        int z2Index = -2;
        final int res = 8 % 3;
        while (z2Index < length - 2) {
            charList2.add(charList2.size(), charList.get(z2Index + res));
            z2Index++;
        }
        final char[] array = new char[length];
        for (int i = 0; i < length; ++i) {
            array[length - i - 1] = charList2.get(i);
        }
        return new String(array);
    }
}
