package com.example.myapp.encoding;

public class Decoder {
	private String referenceTable;
	private String shiftTable;

	// Constructor to initialize the Decoder with reference and shift tables
	public Decoder(String referenceTable, String shiftTable) {
		this.referenceTable = referenceTable;
		this.shiftTable = shiftTable;
	}

	// Decode a given input string using the shift table
	public String decode(String input) {
		StringBuilder decodedText = new StringBuilder();

		// Iterate through each character in the input string
		for (char c : input.toCharArray()) {
			// Find the index of the character in the shift table
			int index = shiftTable.indexOf(c);

			if (index != -1) {
				// If the character is found in the shift table, append the
				// corresponding character from the reference table to the decoded text
				decodedText.append(referenceTable.charAt(index));
			} else {
				// If the character is not found in the shift table, leave it
				// unchanged and append it to the decoded text
				decodedText.append(c); // Leave non-matching characters as is
			}
		}
		// Return the final decoded text as a string
		return decodedText.toString();
	}
}
