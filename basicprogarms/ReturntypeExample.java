package basicprogarms;

public class ReturntypeExample {
	
	
	int method1(){
		
		return 100;
	}
  public static void main(String[] args) {
	  ReturntypeExample obj = new ReturntypeExample();
	  int result =obj.method1();
	  System.out.println("Returnnvalues is:::" + result);
	  
	//System.out.println("Inside main method");
	//return;
	//System.out.println("===");// it is invalid becauwe after return no more statments
	 //return last stamenmt aftehr the execution
}

}
