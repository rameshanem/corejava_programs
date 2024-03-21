package exception;

public class ClassNotFound {
	 static String DBDRIVER = "com.mysql.jdbc.Driver";   
	public static void main(String[] args) throws ClassNotFoundException {
	Class.forName(DBDRIVER);	
	}

}
