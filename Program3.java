//Yael Moreno
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		// Fat Gram Calculator
		Scanner input = new Scanner(System.in);
		System.out.println("How many calories does the food item have?");
		double calories = input.nextDouble();
		System.out.println("How many fat grams in the food item?");
		double fatGrams = input.nextDouble();
		double cff = fatGrams * 9;
		double percentage = cff / calories;
		double thirtyPercent = calories * 0.3;
		if (cff > calories) {
			System.out.println("Error: Not Possible");
		} else if (cff < thirtyPercent) {
			System.out.println("Percentage of calories from fat is " + percentage + "%");
			System.out.println("The food item is low in fat");
		} else {
			System.out.println("Percentage of calories from fat is " + percentage + "%");
		}
		
		System.out.println(" "); // Just an extra line
		
		// The Speed of Sound
		System.out.println("Enter air, water, or steel:");
		String medium = input.next();
		if ((medium.equals("air")) || (medium.equals("Air"))){
			System.out.println("Enter the distance in feet that the soundwave will travel:");
			int distance = input.nextInt();
			int time = distance / 1100;
			System.out.println("The soundwave will travel for approximately " + time + " seconds.");
		} else if ((medium.equals("water")) || (medium.equals("Water"))) {
			System.out.println("Enter the distance in feet that the soundwave will travel:");
			int distance = input.nextInt();
			int time = distance / 4900;
			System.out.println("The soundwave will travel for approximately " + time + " seconds.");
		} else if ((medium.equals("steel")) || (medium.equals("Steel"))) {
			System.out.println("Enter the distance in feet that the soundwave will travel:");
			int distance = input.nextInt();
			int time = distance / 16400;
			System.out.println("The soundwave will travel for approximately " + time + " seconds.");
		} else {
			System.out.println("I don't know what that is :(");
		} 
	
		System.out.println(" "); // Extra Line
		
		// Internet Service Provider
		System.out.println("Which one of these packages have you chosen? (Enter just the letter)");
		System.out.println("Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour");
		System.out.println("Package B: For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour.");
		System.out.println("Package C: For $19.95 per month unlimited access is provided.");
		String plan = input.next();
		switch (plan) { 
		case "a", "A":
			System.out.println("How many hours were used?");
			int hours = input.nextInt();
			if (hours <= 10) {
				System.out.println("Your monthly bill is $9.95");
			} else {
				double charge = 9.95 + ((hours - 10) * 2);
				System.out.println("Your monthly bill is $" + charge);
			}
			break;
		case "b", "B":
			System.out.println("How many hours were used?");
			int hours2 = input.nextInt();
			if (hours2 <= 20) {
				System.out.println("Your monthly bill is $13.95");
			} else {
				double charge = 13.95 + ((hours2 - 20) * 1);
				System.out.println("Your monthly bill is $" + charge);
			}
			break;
		case "c", "C":
			System.out.println("Your monthly bill is $19.95");
			break;
		default:
			System.out.println("That's not a part of the pacakges, silly");
		}
		
		System.out.println(" "); // Extra Line Again!!!!
		
		// Internet Service Provider Part 2
		System.out.println("Part 2");
		System.out.println("Which one of these packages have you chosen? (Enter just the letter)");
		System.out.println("Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour");
		System.out.println("Package B: For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour.");
		System.out.println("Package C: For $19.95 per month unlimited access is provided.");
		String pack = input.next();
		switch (pack) { 
		case "a", "A":
			System.out.println("How many hours were used?");
			int hours = input.nextInt();
			if (hours <= 10) { // changes were made from here
				System.out.println("Your monthly bill is $9.95");
			} else {
				double chargeA = 9.95 + ((hours - 10) * 2);
				double chargeB = 13.95 + ((hours - 20) * 1);
				System.out.println("Your monthly bill is $" + chargeA);
				if (hours >= 20) {
					if (chargeA > chargeB) {
						double savings = chargeA - chargeB;
						System.out.println("You would have saved $" + savings + " if you chose plan B.");
				} 
				}	
				if (hours < 20) {
					if (chargeA > 13.95) {
						double sav = chargeA - 13.95;
						System.out.println("You would have saved $" + sav + " if you chose plan B");
					} else {
						System.exit(1);
					}
				}	
			}
			break;
		case "b", "B":
			System.out.println("How many hours were used?");
			int hours2 = input.nextInt();
			if (hours2 <= 20) {
				System.out.println("Your monthly bill is $13.95");
			} else {
				double Bcharge = 13.95 + ((hours2 - 20) * 1);
				System.out.println("Your monthly bill is $" + Bcharge);
				if (Bcharge > 19.95) {
					double savingsB = Bcharge - 19.95;
					System.out.println("You would've saved $" + savingsB +" if you chose plan C");
				}
			}
			break;
		case "c", "C":
			System.out.println("Your monthly bill is $19.95");
			break;
		default:
			System.out.println("That's not a part of the pacakges, silly");
		}
	
	
	}
	
	
	
		
}