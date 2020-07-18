package array_prog;

public class Mainapp {

	public static void main(String[] args) {
		
	/*	// One dimensional array 
			int[] a =new int[3]; 
			 a[0]=10;
			 a[1]=20;
			 a[2]=30;
			
			 //accessing array using for loop
			 for (int i=0;i<a.length; i++)
			 {
					 System.out.println(a[i]+ ",");} 
			 
			 //Accessing using for each loop
             // syntax- for (data type variable name: collection/array)
			 for(int i:a)
			 {
				 System.out.println(i);
			 }*/
		
		//Two dimensinal array- importing from emp 
		Emp[] emp = new Emp[3];
		
		Emp e1=new Emp();
		Emp e2=new Emp();
		Emp e3=new Emp();
		
		emp[0]=e1;
		emp[1]=e2;
		
		for (int i=0; i<emp.length; i++) {
			System.out.println(emp[0]);
		}
		}

}
