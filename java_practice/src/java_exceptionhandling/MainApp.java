package java_exceptionhandling;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println("--------------program start------------");
		String str= null;
		
		try {
			System.out.println(10/0);
			//str.toLowerCase();
			System.out.println("-----try end----");
		}
		catch(Throwable e) {
			System.out.println("exception catched " +  e.toString() );
		}
		
		finally {
			System.out.println("--------------program end--------------");
		}
		
	}

}
