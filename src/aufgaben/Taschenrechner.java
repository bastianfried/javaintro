package aufgaben;

import java.util.Scanner;
import java.util.Locale;

public class Taschenrechner {

public static void main(String[] args) {
	Scanner in = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Please choose action:\n1 - +\n2 - -\n3 - *\n4 - /");
    int action = in.nextInt();

    double x = in.nextDouble();
  
    double y = in.nextDouble();
    switch (action) {
    case 1:
        System.out.print(x + y);
        break;
    case 2:
        System.out.print(x - y);
        break;
    case 3:
        System.out.print(x * y);
        break;
    case 4:
        System.out.print(x / y);
        break;


    }


}


}