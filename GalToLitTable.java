import java.text.DecimalFormat;

class GalToLitTable {
	public static void main(String args[]) {

		int counter = 0;
		double gallon;
		double liter = 3.7854;

		DecimalFormat numberFormat = new DecimalFormat("#.####");

		for(gallon = 1; gallon <= 100; gallon++) {
			System.out.println(numberFormat.format(gallon) + " gallons to liter is " + numberFormat.format(gallon * liter));

			counter++;

			if(counter == 10) {
				System.out.println();
				counter = 0;
			}

		}

	}
}