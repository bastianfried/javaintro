package aufgaben;

import java.util.ArrayList;

public class Namensort {

	public static void main(String[] args) {
		int i, j;
		String t;

		ArrayList<String> namen = new ArrayList<String>();
		namen.add("Bastian");
		namen.add("Viktor");
		namen.add("Chemmy");
		namen.add("Oleg");
		namen.add("David");
		namen.add("Leo");
		namen.add("Theodor");
		namen.add("Martin");
		namen.add("Martina");

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