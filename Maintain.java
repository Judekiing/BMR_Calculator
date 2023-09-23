
import java.util.Scanner;

class Maintain {
	public static void main(String args[]) {

		// Here we declare variables for our BMR calculator

		String firstName = "";
		String lastName = "";
		char sex;

		String itemName = "";
		int numCallories;

		double BMR;
		float weightPb, heightIn, ageYr;

		// create an object of scanner class
		Scanner input = new Scanner(System.in);

		// At this point we want to request user first name
		System.out.println("Kindy input  your First Name");
		firstName = input.next();

		// At this point we want to request user last name
		System.out.println("Kindy input Last Name");
		lastName = input.next();

		String fullName = firstName + lastName;
		System.out.println(" ");
		System.out.println("Welcome " + fullName + ", to our weight calculaor!");

		// ask users to enter weight in pounds
		System.out.println("Hi " + firstName + ", Kindly input weight in pounds");
		weightPb = input.nextInt();

		// ask users to enter height in inches
		System.out.println("Kindly input height in inches");
		heightIn = input.nextInt();

		// ask users to enter age in years
		System.out.println("Kindly input age in years");
		ageYr = input.nextInt();

		while (true) {

			System.out.println("");
			System.out.println("Kindly input item name");
			itemName = input.next();

			System.out.println("Kindly input item callories");
			numCallories = input.nextInt();

			// At this point we want to request user to choose a gender
			System.out.println(" ");
			System.out.println("Choose Gender: m or f");
			System.out.println("Enter E to exit");

			sex = input.next().charAt(0);
			if (sex == 'E') {
				System.out.println("Thank you for using our  BMR Calculator, " + firstName + "! See you soon.");

				break;
			}

			// performs Harris-Benedict formula to estimate your BMR
			// checking if the Gender is "Female"
			if (sex == 'f') {

				// Calories needed for woman to maintain her weight
				// Basic Metabolic Rate (BMR)
				BMR = 655 + (4.3 * weightPb) + (4.7 * heightIn) - (4.7 * ageYr);
				System.out.println("A woman with weight of " + weightPb + "pounds and is " + heightIn +
						"inches tall, can consume " + BMR + "kcal of " + itemName + " daily to maintain her weight.");

			}

			// performs subtraction between numbers
			// checking if the operstor is "-"
			else if (sex == 'm') {
				// Calories needed for woman to maintain her weight
				// Basic Metabolic Rate (BMR)
				BMR = 66 + (6.3 * weightPb) + (12.9 * heightIn) - (6.8 * ageYr);
				System.out.println(" A man with weight of " + weightPb + "pounds and is " + heightIn +
						"inches tall can consume " + BMR + "kcal of " + itemName + " daily to maintain his weight.");

			}

			// condition to display incorrect gender
			else {
				System.out.println(firstName + " Kindly confirm the Gender you choose before we exit");
			}
		}

	}
}