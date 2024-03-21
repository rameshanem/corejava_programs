package basicprogarms;

public class Staticmethod {
	
	static int add() {
		int a= 12,b=25;
		System.out.println("a+b ="+(a+b));
		return  a+b;
	}
	

	public static void main(String[] args) {
		
		
		
		System.out.println("main method");
		
		//Staticmethod sts =new Staticmethod();
	    int result =  Staticmethod.add();
	    int c = result+55;
	    System.out.println(c);

	
		
		
	}
	

}
