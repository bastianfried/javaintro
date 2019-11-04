package javaBasics;

public class VariablenBasics {

	public static void main(String[] args) {
		// wahr / falsch
		// boolean 1 bit
		boolean wahr_oder_falsch;
		//
		wahr_oder_falsch = true;
		System.out.println(wahr_oder_falsch);
		//
		wahr_oder_falsch = false;
		System.out.println(wahr_oder_falsch);
		
		// byte 
		byte zahl = 1;
		System.out.println(zahl);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		// short - 2byte
		short ganz_kleine_zahl=120;
		System.out.println(ganz_kleine_zahl);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		// int - 4byte
		int kleine_zahl = 123345;
		System.out.println(kleine_zahl);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		
		
	
	}

}
