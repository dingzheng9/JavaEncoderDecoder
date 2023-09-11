package com.example.myapp;

import com.example.myapp.constants.TableConstants;
import com.example.myapp.constants.Constants;
import com.example.myapp.encoding.Decoder;
import com.example.myapp.encoding.Encoder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encoder encoderB = new Encoder(TableConstants.REFERENCE_TABLE, TableConstants.SHIFT_TABLE_B);
		String encodedB = encoderB.encode(Constants.input);
		System.out.println("B" + encodedB);

		Decoder decoderB = new Decoder(TableConstants.REFERENCE_TABLE, TableConstants.SHIFT_TABLE_B);
		String decodedB = decoderB.decode(encodedB);
		System.out.println("Decoded (B): " + decodedB);

		Encoder encoderF = new Encoder(TableConstants.REFERENCE_TABLE, TableConstants.SHIFT_TABLE_F);
		String encodedF = encoderF.encode(Constants.input);
		System.out.println("F" + encodedF);

		Decoder decoderF = new Decoder(TableConstants.REFERENCE_TABLE, TableConstants.SHIFT_TABLE_F);
		String decodedF = decoderF.decode(encodedF);
		System.out.println("Decoded (F): " + decodedF);

	}

}
