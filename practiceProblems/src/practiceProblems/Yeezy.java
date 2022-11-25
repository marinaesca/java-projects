package practiceProblems;

import java.util.*;

/*
	Billy Bob needs to buy a new pair of Yeezy's that cost $2000, with the 
	money he earns hourly at his local burger joint. If Billy Bob works for an 
	average of 43 hour a week and puts 25% of his earnings towards purchasing 
	Yeezy's, determine if he will have the shoes in 5 months so he can show 
	off to his friends. Assume there are 4 weeks in a month.

	Input:
	You will be given the hourly wage that Billy Bob earns. Calculate how 
	many weeks it will take Billy Bob to buy the new Yeezy's

	Output:
	If Billy Bob earns enough money in less than five months, print True. 
	Otherwise print False. 

	Example Input File:
	4
	7.25
	10.99
	13.70
	8.50

	Example Output File:
	False
	True
	True
	False

*/

public class Yeezy {
	
	static final int HOURS_WORKED_A_WEEK = 43;
	static final int WEEKS_WORKED_TOTAL = 20; // 4 weeks in a month, 5 months
	static final double SAVINGS_PERCENT = .25;
	static final int YEEZY_COST = 2000;

	public static void main(String[] args){
		// first hardcode in example input & check output
		// then make input & expected output file that is checked
		Scanner reader = new Scanner(System.in);
		int testCases = reader.nextInt();

		double possibleWages[] = new double[testCases];
		for (int i = 0; i < testCases; i++) {
			possibleWages[i] = reader.nextDouble();
		}


		System.out.println("\n ---- RESULTS ---- \n");
		for (int r = 0; r < testCases; r++) {
			double savings = caluculateTotalSavings(possibleWages[r]);
			String result = savings > YEEZY_COST ? "TRUE" : "FALSE";
			System.out.println(result);
		}
		reader.close();

	}

	public static double caluculateTotalSavings(double hourlyWage) {
		// slow thought out code to show logic

		double weeklyEarnings = hourlyWage * HOURS_WORKED_A_WEEK;
		double totalEarnings = weeklyEarnings * WEEKS_WORKED_TOTAL;

		return totalEarnings * SAVINGS_PERCENT;

		// fast efficient code
		// return hourlyWage * HOURS_WORKED_A_WEEK * WEEKS_WORKED_TOTAL * SAVINGS_PERCENT;
	} 

}
