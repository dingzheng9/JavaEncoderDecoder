package com.example.myapp;

import com.example.myapp.constants.TableConstants;
import com.example.myapp.constants.Constants;
import com.example.myapp.encoding.Decoder;
import com.example.myapp.encoding.Encoder;
import com.example.myapp.util.ShiftTableUtil;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character for shift: ");
        char shiftChar = scanner.next().charAt(0);
        
        while (TableConstants.REFERENCE_TABLE.indexOf(Character.toUpperCase(shiftChar)) == -1) {
            System.out.println("Character not in reference table. Please try again.");
            System.out.print("Enter a character for shift: ");
            shiftChar = scanner.next().charAt(0);
        }
        
        String dynamicShiftTable = ShiftTableUtil.generateShiftTable(shiftChar);
        Encoder dynamicEncoder = new Encoder(TableConstants.REFERENCE_TABLE, dynamicShiftTable);
        String dynamicEncoded = dynamicEncoder.encode(Constants.input);
        System.out.println("Encoding: " + shiftChar + dynamicEncoded);

        Decoder dynamicDecoder = new Decoder(TableConstants.REFERENCE_TABLE, dynamicShiftTable);
        String dynamicDecoded = dynamicDecoder.decode(dynamicEncoded);
        System.out.println("Decoding (using shift char '" + shiftChar + "'): " + dynamicDecoded);
    }
}
