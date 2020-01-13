package aufgaben;

import java.util.Scanner;

public class AdditionsRechner {

public static void main(String[] args) {
long x,y,z;
Scanner eingabe = new Scanner(System.in);
//
        System.out.print("");
        x = eingabe.nextInt();
        System.out.print("");
        y = eingabe.nextInt();
        z = x + y;
        System.out.println( z );
}

}