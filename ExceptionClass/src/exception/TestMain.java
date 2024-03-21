package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestMain {
	public static void main(String[] args) throws FileNotFoundException,Exception  {
		
		Thread t = new Thread();
		System.out.println(t.getThreadGroup());
		/*
		 * int arr[]= {0,5,45}; System.out.println(arr[3]);
		 */
		//Arithematic exception
		/*
		 * int n=100; System.out.println(n/0);
		 */
		/*
		 * String str=null; System.out.println(str.length());
		 */
		try {
		String str="yyy";
		System.out.println(Integer.parseInt(str));
		}
		
		catch (NumberFormatException e123) {
			e123.printStackTrace();
			System.out.println("====" );
		}
		catch (NullPointerException e123) {
			System.out.println("====");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Statemnt-1");
		System.out.println("Statemnt-2");

		System.out.println("Statemnt-3");

		System.out.println("Statemnt-4");
		
		
		
		/*File file= new File("123.txt");
		FileReader fir= new FileReader(file);*/

	}

}
