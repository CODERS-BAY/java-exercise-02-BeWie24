import java.util.Scanner;

public class boolea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean running = true;

		System.out.println("M�chten Sie den Spruch des Tages h�ren? ja oder nein");

		String input = scan.nextLine();

		if (input.equals("nein")) {
			System.out.println("Ich w�nsche noch einen sch�nen Tag!");
		} else if (input.equals("ja")) {
			System.out.println("F�r den Spruch des Tages geben Sie bitte eine Zahl zwischen 1 und 5 ein:");
			do {
				int spruch = scan.nextInt();
				switch (spruch) {
				case 1:
					System.out.println("Es ist nie zu sp�t, das zu werden, was man h�tte sein k�nnen.");
					break;
				case 2:
					System.out.println("Gl�ck ist das Einzige, das sich verdoppelt, wenn man es teilt");
					break;
				case 3:
					System.out.println("Triff kleine Entscheidungen mit dem Kopf und gro�e mit dem Herzen.");
					break;
				case 4:
					System.out.println("Die Phantasie ist das Auge der Seele.");
					break;
				case 5:
					System.out.println("Tun, was du magst, ist Freiheit. M�gen was du tust, ist Gl�ck.");
					break;
				default:
					System.out.println("falsche Eingabe");
				}
				System.out.println("");
				System.out.println("Nochmal? ja oder nein");

				String nochmal = scan.nextLine();
				if (nochmal.equals("ja")) {
					System.out.println("Geben Sie eine Zahl zwischen 1 und 5 ein:");
				} else if (nochmal.equals("nein")) {
					running = false;
				}
			} while (running);

			System.out.println("Ich hoffe die Spr�che haben Ihnen gefallen! Einen sch�nen Tag noch!");
		}
	}
}
