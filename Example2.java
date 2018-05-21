/*
	 This program illsutrate the differences between int and double.

	Call this file example3.java. 
*/


class Example2 {
	public static void main(String args[]) {
		int var; // this decarles an int variable
		double x; // this declares a floating-point variable

		var = 10; // assign var the value of 10

		x = 10.0; // assign x the value of 10.0

		System.out.println("original value var: " + var);
		System.out.println("original value of x: " + x);
		System.out.println();

		// now, divide both by 4
		var = var / 4;
		x = x / 4;

		System.out.println("var after division: " + var);
		System.out.println("x after divsion: " + x);
	}
}