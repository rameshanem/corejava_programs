package basicprogarms;

public class SitchExample {
	
	public static void main(String[] args) {
		int day=4;//0123456
		
		switch (day) {
		case 0: {
			System.out.println("To is Sunday::: ");
		}
		case 1: {
			System.out.println("To is Momday::: ");
		}
		case 2: {
			System.out.println("To is Tusday::: ");
		}
		case 3: {
			System.out.println("To is Wednsday::: ");
		}
		case 4: {
			System.out.println("To is Thursday::: ");
			break;
		}
		case 5: {
			System.out.println("To is Friday::: ");
			
		}
		default:
			//throw new IllegalArgumentException("Unexpected value: " + day);
			System.out.println("Saturday");
		}
		
		
		
	}

}
