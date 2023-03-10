package Results;

import java.text.DecimalFormat;

public class Results {
	private static final DecimalFormat df = new DecimalFormat("0.0");

	static void totalMark(double Physics, double Chemistry, double Biology) {

		double total = Physics + Chemistry + Biology;

		if (total <= 450) {
			System.out.println("Physics' score: " + Physics);
			System.out.println("Chemistry' score: " + Chemistry);
			System.out.println("Biology score: " + Biology);
			System.out.println("Total score: " + total);

		} else {
			System.out.println("Total mark must be <= 450. Check your input!");

		}

	}

	static void percentage(double Physics, double Chemistry, double Biology) {
		double total = Physics + Chemistry + Biology;

		if (Physics <= 150 && Chemistry <= 150 && Biology <= 150 && total <= 450) {
			double physicsPercentage = (Physics / 150) * 100;
			double chemistryPercentage = (Chemistry / 150) * 100;
			double biologyPercentage = (Biology / 150) * 100;
			double overallPercentage = (total / 450) * 100;

			if (overallPercentage < 60 && physicsPercentage < 60 || chemistryPercentage < 60
					|| biologyPercentage < 60) {

				if (physicsPercentage < 60) {
					System.out.println(
							"You fail Physics, your score is under 60%: " + df.format((physicsPercentage)) + "%");
				}
				if (chemistryPercentage < 60) {
					System.out
							.println("You fail Chemistry, your score is under 60%: " + df.format(chemistryPercentage));
				}
				if (biologyPercentage < 60) {
					System.out.println(
							"You fail Biology, your score is under 60%: " + df.format((biologyPercentage)) + "%");
				}
				System.out.println("Your score does not meet the pass requirements. Speak to your teacher");

			} else {
				System.out.println("Congratulations, you meet the pass requirements!");
				System.out.println("Physics (%): " + df.format(physicsPercentage));
				System.out.println("Chemistry (%): " + df.format(chemistryPercentage));
				System.out.println("Biology (%): " + df.format(biologyPercentage));
				System.out.println("Total (%): " + df.format(overallPercentage));
			}

		} else {
			System.out.println("Scores must be less than 150. Check your input!");
		}
	}

	public static void main(String[] args) {
		totalMark(150, 94, 94);
		percentage(150, 94, 94);
	}

}
