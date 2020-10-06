import java.util.Scanner;

public class Calculator {

	// global variables
	private static final Scanner scanner = new Scanner(System.in);

	public static int addint(int a, int b) {
		return a + b;
	}

	public static double adddoub(double a, double b) {
		return a + b;
	}

	public static int subint(int a, int b) {
		return a - b;
	}

	public static double subdoub(double a, double b) {
		return a - b;
	}

	public static int multiint(int a, int b) {
		return a * b;
	}

	public static double multidoub(double a, double b) {
		return a * b;
	}

	public static int divint(int a, int b) {
		return a / b;
	}

	public static double divdoub(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {

		boolean running = true;

		do {
			System.out.println("Would you like to make a integer calculations?");
			System.out.println("type y for yes and anything else for double calculations");
			String input = scanner.nextLine();
			if (input.equals("y")) {
				System.out.println("Type the first number:");
				int erstezahl = scanner.nextInt();
				System.out.println("Type the second number:");
				int zweitezahl = scanner.nextInt();
				System.out.println("""
						You can make the following calculations:
						1. addition
						2. subtraction
						3. divide
						4. modulo
						5. pythagoras you can calculate the hypontenuse c
						""");
				System.out.println("To select a calculating please press the corresponding number");
				int auswahl = scanner.nextInt();

				if (auswahl == 1) {
					int a = addint(erstezahl, zweitezahl);
					System.out.println("The solution is: " + a);
				} else if (auswahl == 2) {
					int b = subint(erstezahl, zweitezahl);
					System.out.println("The solution is: " + b);
				} else if (auswahl == 3) {
					int c = multiint(erstezahl, zweitezahl);
					System.out.println("The solution is: " + c);
				} else if (auswahl == 4) {
					int d = divint(erstezahl, zweitezahl);
					System.out.println("The solution is: " + d);
				}
				System.out.println("Would you like to calc again? type n for no");
				scanner.nextLine();
				if (input.equals("n")) {
					running = false;
				}
				while (running)
					;
			} else {
				System.out.println("Type the first number:");
				double erstezahl1 = scanner.nextDouble();
				System.out.println("Type the second number:");
				double zweitezahl1 = scanner.nextDouble();
				System.out.println("""
						You can make the following calculations:
						1. addition
						2. subtraction
						3. divide
						4. modulo
						5. pythagoras you can calculate the hypontenuse c
						""");
				System.out.println("To select a calculating please press the corresponding number");
				int auswahl = scanner.nextInt();

				if (auswahl == 1) {
					double a = adddoub(erstezahl1, zweitezahl1);
					System.out.println("The solution is: " + a);
				} else if (auswahl == 2) {
					double b = subdoub(erstezahl1, zweitezahl1);
					System.out.println("The solution is: " + b);
				} else if (auswahl == 3) {
					double c = multidoub(erstezahl1, zweitezahl1);
					System.out.println("The solution is: " + c);
				} else if (auswahl == 4) {
					double d = divdoub(erstezahl1, zweitezahl1);
					System.out.println("The solution is: " + d);
				}
				System.out.println("Would you like to calc again? type n for no");
				scanner.nextLine(); // konsumiert den Zeilenumbruch von nextInt (von oben) - sonst kann man nix mehr
									// eingeben!
				input = scanner.nextLine();
				if (input.equals("n")) {
					running = false;
				}
				while (running)
					;

				System.out.println("Thank you for using the calculator!");
			}
		} while (running);
	}
}
/*
 * your code comes here
 */

// do something
/*
 * } while (!terminate);
 * 
 * System.out.println("Thank you for using the calculator. See you soon!"); }
 */
