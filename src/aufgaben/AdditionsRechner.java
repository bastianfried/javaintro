package aufgaben;

import java.util.Scanner;

public class AdditionsRechner {

public static void main(String[] args) {
long x,y,z;
Scanner eingabe = new Scanner(System.in);
//
        System.out.print("");
        x = eingabe.nextLong();
        System.out.print("");
        y = eingabe.nextLong();
        z = x + y;
        System.out.println( z );
}

}