/*package kalyan;

import javax.security.auth.login.LoginException;

public class ThrowExample  extends LoginException {
	
	
	private static final long serialVersionUID = 1L;
	public ThrowExample(String message) {
		super();
     }
   public static void main(String []args) throws LoginException
   {
	   System.out.println("===");
	   try {
		   System.out.println(1/0);
	   }catch (Exception e) {
		   System.out.println(e);
		   throw new LoginException("halllllo");
	   }
	   }
   }*/

/*class UserDefinedException extends Exception  
{  

public UserDefinedException(String str)  
 {   
     super(str);  
 }  
}  
public class ThrowExample
{  
 public static void main(String args[])  
 {  
     try  
     {  
         throw new UserDefinedException("This is user-defined exception");  
     }  
     catch (UserDefinedException ude)  
     {  
         System.out.println("Caught the exception");    
         System.out.println(ude.getMessage());  
     }  
 }  
}  */

/*public class ThrowExample {
	void validata(int age) {
	if (age<20)
	{
		throw new ArithmeticException("person is not eligible for vote");
	}
	else {
		System.out.println("eligible for vote");
	}
}
	public static void main(String[] args)
	{
		ThrowExample t2 = new ThrowExample();
		t2.validata(18);
	}
}*/




/*class  ThrowExample{
	int a=5;
	int b=0;
	void display() {
	if(b==a) {
		throw new ArithmeticException("invalid oof user input");
	}
	else {
		System.out.println("hai");}
	}
	public static void main(String[] args) {
		ThrowExample t5 = new ThrowExample();
		try {
		t5.display();
		}catch (ArithmeticException a) {
			System.out.println(a);
			System.out.println("kalyan");
		}
		System.out.println("anu");
	}
}*/

package exception;

import java.net.ConnectException;


public class ThrowExample extends Exception{
	public ThrowExample(String message)  
	 {   
	     super(message);  
	 }  
	

	public static void main(String[] args) throws ConnectException
	{
		System.out.println("hallo");
			
		throw new ConnectException("my new Exception");
		}
	}