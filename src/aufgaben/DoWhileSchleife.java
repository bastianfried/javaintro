package aufgaben;

import java.util.Scanner;
import java.util.ArrayList;

public class DoWhileSchleife {

	public static void main(String[] args) {
		int i, j;
		String t;
		Scanner eingabe = new Scanner(System.in);

		String line = "";

		ArrayList<String> namen = new ArrayList<String>();

		while (!line.equals("z")) {

			line = eingabe.nextLine();

			namen.add(line);
		}
		if (line.contentEquals("z")) {
			namen.remove(namen.size() - 1);
		}
		int n = namen.size();
		for (i = 1; i < n; i++) {
			for (j = 0; j < (n - 1); j++) {

				if (namen.get(j).compareToIgnoreCase(namen.get(j + 1)) > 0) {
					t = namen.get(j);
					namen.set(j, namen.get(j + 1));
					namen.set(j + 1, t);

				}
			}
		}

		System.out.println(namen);
	}
}
