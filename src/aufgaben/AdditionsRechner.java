package aufgaben;

import java.util.Scanner;

public class AdditionsRechner {

public static void main(String[] args) {
int x,z,y;
Scanner eingabe = new Scanner(System.in);
//
        System.out.print(" ");
        x = eingabe.nextInt();
        System.out.print(" ");
        y = eingabe.nextInt();
        z = x + y;
        System.out.println( z );
}

}