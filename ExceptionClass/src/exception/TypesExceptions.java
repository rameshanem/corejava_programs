package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TypesExceptions
{
		void show()
			{
				try {
				System.out.println(100/0);
				} catch (ArithmeticException a) {		
					System.out.println(a);
				}
				System.out.println(258);
				}
	public static void main(String[] args) 
	{ 
		TypesExceptions t1=new TypesExceptions();
		t1.show();
	
 //////Throws Exceptions///////
     try{
		     File file = new File ("Kalyan:/gopi");
			FileInputStream fis = new FileInputStream(file);
			System.out.println(fis);
	} catch (FileNotFoundException f) {
		System.out.println("FileNotFoundException");
	}
     
 /////ArithmeticException//////////
		try {
	int a = 100/0;
	System.out.println(a);//ArithmeticException
		}catch (ArithmeticException z) {
		System.out.println(z);
	}
		System.out.println ("ArithmeticException");
		
	////NumberFormatException//////////
		try {
		String s=("abc");
		System.out.println(Integer.parseInt(s));//NumberFormatException
		}catch (Exception n) {
			System.out.println(n);
		}
		System.out.println("numberFormatException");
		
	////NullPointerException/////
		try {
		String m=null;
	   System.out.println(m.length());//NullPointerException
		} catch (Exception u) {
			System.out.println(u);
		}
		System.out.println("NullPointException");
		
	//////ArrayIndexOutOfBoundsException///////
		try {
		int c[]=new int[10];
		c[15]=25;
		System.out.println(c);//ArrayIndexOutOfBoundsException
		}catch (Exception b) {
			System.out.println(b);
		}
		System.out.println("ArrayIndexOutOfBoundsException");
	
	///////StringIndexOutOfBoundsException//////
		try {
		     String k="kalyan";
		     System.out.println(k.substring(9));
			} catch (StringIndexOutOfBoundsException s) {
				System.out.println(s);
				//throw s;
			}
		finally {
			System.out.println("finaly keyword block excequted ");
		}
		
	////ClassNotFoundException/////
		try {
		Class.forName("kalya.Prasad");
	}catch (Exception c) {
		System.out.println(c);
		



////////////USAGE OF FINALLY KEYWORD IN PROGRAM///////////
{
	try {
	System.out.println(100/0);
	}catch (Exception a) {
		System.out.println("a");
	}
	finally {
		System.out.println("finally keyword block was exception");
	}
	System.out.println("arithmetic");
}
	}
	}
}

