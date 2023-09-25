package com.example.myapp.util;

import java.util.ArrayDeque;
import java.util.Deque;

import com.example.myapp.constants.TableConstants;

public class ShiftTableUtil {

    /**
     * Generates a shift table for the given offset.
     * @return The shifted table.
     */
    public static String generateShiftTable(char ch) {
        int offset = TableConstants.REFERENCE_TABLE.indexOf(Character.toUpperCase(ch));
        if (offset == -1) {
            throw new IllegalArgumentException("Character not found in reference table");
        }

        Deque<Character> deque = new ArrayDeque<>();
        for (char c : TableConstants.REFERENCE_TABLE.toCharArray()) {
            deque.add(c);
        }

        // "Shift" the characters by popping from the end and pushing to the front
        for (int i = 0; i < offset; i++) {
            char last = deque.removeLast();
            deque.addFirst(last);
        }

        StringBuilder shifted = new StringBuilder();
        for (char c : deque) {
            shifted.append(c);
        }

        return shifted.toString();
    }
}
