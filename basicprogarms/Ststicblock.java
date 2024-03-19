package basicprogarms;

public class Ststicblock {
	
	static {
		System.out.println("static class block");
	}
	public static void main(String[] args)
	{
		System.out.println("main method 1");
		System.out.println("main method 2");
	
	}
	static {
		System.out.println("static main block");
	}
	
		
}