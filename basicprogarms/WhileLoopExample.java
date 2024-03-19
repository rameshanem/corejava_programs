package basicprogarms;

public class WhileLoopExample {
	public static void main(String[] args) {
		//for
		int a=0;
		int j=0;
		while(a<2) {
			System.out.println("inside while" + a);
			a++;
			System.out.println("============inner while============");
			while(j<3) {
				System.out.println("inside outter while" + j);
				j++;
			}//inner
		}//outter
		
	}

}
