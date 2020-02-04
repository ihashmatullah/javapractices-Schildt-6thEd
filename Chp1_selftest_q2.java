import java.text.DecimalFormat;

class Chp1_selftest_q2 {
	public static void main(String args[]) {

		int counter = 0;
		double meter;
		double inch = 39.37;

		DecimalFormat numberFormat = new DecimalFormat("#.####");

		for(meter = 1; meter <= 144; meter++) {
			System.out.println(numberFormat.format(meter) + " Inches to Meter is " + numberFormat.format(meter / inch));

			counter++;

			if(counter == 12) {
				System.out.println();
				counter = 0;
			}

		}

	}
}