package oopsclass;

public class InterfaceExampleImpl implements InterfaceExample{
	public static final int insatnceVar = 0;
    
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void print1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void print2() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println("indode"+ i);
		}
		
	}
	
public static void main(String[] args) {
	InterfaceExample obj = new InterfaceExampleImpl();
	obj.print2();
	
	
	}
}
