package com.example.myapp.constants;
/**
 * This class defines constants for character reference tables used in encoding and decoding.
 */
/**
 * This class defines constants for character reference tables used in encoding and decoding.
 */
public class TableConstants {
    /**
     * The reference table containing the characters used for encoding and decoding.
     * It includes uppercase letters, digits, and a set of special characters.
     */
    public static final String REFERENCE_TABLE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()+-*.,/";

    /**
     * The shift table for Offset B encoding and decoding.
     * It is used to shift characters in the reference table for encoding and decoding.
     */
    public static final String SHIFT_TABLE_B = "/ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-.";

    /**
     * The shift table for Offset F encoding and decoding.
     * It is used to shift characters in the reference table for encoding and decoding.
     */
    public static final String SHIFT_TABLE_F = "+,-./ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*";
}

