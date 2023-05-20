package Basic;

public class DataTypes {


	/*
	 * Data types in java 
	 * 
	 * 1. Primitive 
	 * 2. Non Primitive 

	 * 1.Primitive
	 * Int - Byte(-128 to 127) = 8 bits
	 *     - Short(-32.768 to 32.767 = 16 bits
	 *     - Int(-2,147,483,648 to 2,147,483,647) = 32 bits
	 *     - Long( -2,147,483,648 to 2,147,483,647  ) = 64 bits
	 *     
	 * Float - Float = Precision up to 6 to 7 decimal points = 32 bits
	 * 	     - Double = Precision up to 15 to 16 decimal points = 64 bits
	 * 
	 * Char - (0,255) keyboard character
	 * 
	 * Boolean - True or False
	 * 
	 * 2. Non Primitive 
	 * Array - An ordered series or arrangement
	 * String - Character String
	 * Class 
	 * etc
	 */		 

	public static void main(String[] args) {

		byte entero = 12;
		short entero2 = 32735;
		int entero3 = 2147483647;
		long entero4 =  2147483647;
		
		float decimal = 3.44f;
		char caracter = 'c';
		boolean decision = true;
		boolean nodecision1 = false;
		
		String palabra = "Hello word";
		
		// "\n" to make a line break inside a string or text
		 
		
		System.out.println("Printing \n Byte: " + entero + "\n Short: " + entero2 + "\n Int: " + entero3 + "\n Long: " + entero4 + "\n Float: " + decimal + "\n Char: " + caracter + "\n Boolean: " + decision  +"\n Boolean 2: " + nodecision1 + "\n Palabra: " + palabra );

	}

}

