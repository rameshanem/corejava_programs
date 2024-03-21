package basicprogarms;

public class Instancemethod {

	long home(){
		long k= 15,a= 12;
		System.out.println("k+a ="+(k+a));
		return k+a;
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method");
		
		
		
		Instancemethod obj = new Instancemethod();
		long result = obj.home();
		long c= result*4;
		System.out.println("return value c "+c);
	}

	
	
}
