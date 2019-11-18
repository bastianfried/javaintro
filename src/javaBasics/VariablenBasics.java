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
		
		//long - 8byte
				long grosse_zahl = 1234567890;
				System.out.println(grosse_zahl);
				System.out.println(Long.MIN_VALUE);
				System.out.println(Long.MAX_VALUE);
				
				//float
				float kleine_komma_zahl = 123.456F;		//F...Float
				System.out.println(kleine_komma_zahl);
				System.out.println(Float.MIN_VALUE);
				System.out.println(Float.MAX_VALUE);
			    
				//double
				double grosse_komma_zahl = 123456789.0987654321D;	//D...Double
				System.out.println(grosse_komma_zahl);
				System.out.println(Double.MIN_VALUE);
				System.out.println(Double.MAX_VALUE);
				
				//char
				char ein_zeichen = 'a';
				System.out.println(ein_zeichen);
				//char zwei_zeichen = 'ab'; geht nicht
				
				//String
				String text ="abcdefghijklmnop";
				System.out.println(text);
		
		
		
	
	}

}
