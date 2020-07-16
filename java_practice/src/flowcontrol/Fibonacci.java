package flowcontrol;

public class Fibonacci {

	public static void main(String[] args) {
		//using for loop
		/* int n = 10, t1 = 0, t2 = 1;
	        System.out.print("First " + n + " terms: ");

	        for (int i = 1; i <= n; ++i)
	        {
	            System.out.print(t1 + " + ");

	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }*/
		//using while loop
		int i=1, n=10,t1=0, t2=1;
		System.out.println("First" + n + "terms");
		
		while(i<=n)
		{
			System.out.println(t1 + " + ");
			
			int sum= t1+t2;
			t1=t2;
			t2=sum;
			++i;
			
		}
		
}

}
