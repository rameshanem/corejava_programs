package basicprogarms;

public class DefaultDataTypes {
	static int i = 1000000000;              // 0        4 bytes
	static float f = 100000.2f;             //0.0f      4 byte
	static double d = 2121210.2;            //0.0b      8 byte
	static long l = 1258454785l;            //0l        8 byte
	static boolean b = false ;              //0         1 byte
	static char ch = 'k';                  //u000      2 byte
	static short s = 12554;                //false     1 bit
	static String str = "kalyan";          //null      16 characters
	
	public static void main(String[] args) {
		
		//Print all default values for ther primitive data types
		System.out.println("int values is: = " + i);
		System.out.println("float values is: = " + f);
		System.out.println("double values is: = " + d);
		System.out.println("long values is: = " + l);
		System.out.println("byte values is: = " + b);
		System.out.println("char values is: = " + ch);
		System.out.println("short values is: = " + s);
		System.out.println("string values is: = " + str);
	}

}
