package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

void display()throws FileNotFoundException
{
	 File file = new File ("Kalyan:/gopi");
		FileInputStream fis = new FileInputStream(file);
		System.out.println(fis);
	
	throw new FileNotFoundException();
}


public  static void main(String[] args)
{
ThrowsExample t3 = new ThrowsExample();
try {
t3.display();
}catch (FileNotFoundException f) {
	System.out.println(f);
	
}
System.out.println("rest of the code");

}
}