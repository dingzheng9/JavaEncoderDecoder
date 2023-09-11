package com.example.myapp.encoding;

public class Encoder {
	private String referenceTable;
	private String shiftTable;

	// Constructor to initialize the Encoder with reference and shift tables
	public Encoder(String referenceTable, String shiftTable) {
		this.referenceTable = referenceTable;
		this.shiftTable = shiftTable;
	}

	// Encode a given input string using the shift table
	public String encode(String input) {
		StringBuilder encodedText = new StringBuilder();

		// Iterate through each character in the input string
		for (char c : input.toCharArray()) {
			// Find the index of the character in the reference table
			int index = referenceTable.indexOf(c);

			if (index != -1) {
				// If the character is found in the reference table, append the
				// corresponding character from the shift table to the encoded text
				encodedText.append(shiftTable.charAt(index));
			} else {
				// If the character is not found in the reference table, leave it
				// unchanged and append it to the encoded text
				encodedText.append(c); // Leave non-matching characters as is
			}
		}
		// Return the final encoded text as a string
		return encodedText.toString();
	}
}
