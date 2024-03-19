package oopsclass;

public class TestMain {
	public static void main(String[] args) {
		AbstarctExample obj = new AbsatrctImpl();
		System.out.println(obj.intanceVar);
		obj.print_AbsatrctMethod();
		obj.print_AbsatrctMethod_Print();
		
	}
}
