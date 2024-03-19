package oopsclass;

public abstract class AbstarctExample {
	int intanceVar;
	static int saticVarb;
	final int finaVr;
	
	
	{
		
	}
	static{
		
	}
	AbstarctExample(){
		this.finaVr = 0;
		System.out.println("Inside Constructor");
	}
	abstract void print_AbsatrctMethod();//absatrct method
	abstract void print_AbsatrctMethod1();//absatrct method
	void print_AbsatrctMethod_Print(){
		System.out.println("Inside Concrete method");
	}
	void print_AbsatrctMethod_Print1(){
		System.out.println("Inside Concrete method");
	}
	
}

class AbsatrctImpl extends AbstarctExample{
	AbsatrctImpl(){
		System.out.println("Inside Subclass constructor");
	}
	@Override
	void print_AbsatrctMethod() {
		System.out.println("Inside overird metho");
		
	}
	@Override
	void print_AbsatrctMethod1() {
		// TODO Auto-generated method stub
		
	}
	
	
}
