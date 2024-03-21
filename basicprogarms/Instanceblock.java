package basicprogarms;

public class Instanceblock {
	{
		System.out.println("instance block 1");
	}
	{
		System.out.println("instance block 2");
	}
	public static void main(String[] args) {
		
		{
			System.out.println("instance block 4");
		

		
		System.out.println("main method");
		
		Instanceblock  obj = new Instanceblock ();
		
		{
			System.out.println("instance block 3");
		}

	}

}
}
