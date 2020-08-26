package java_exceptionhandling;

public class RuntimeStack {

	public static void main(String[] args) {
		method_A();
		
	}

	public static void method_A() {
		System.out.println("---method A start---");
		method_B();
		System.out.println("---method A end---");
	}

	public static void method_B() {
		System.out.println("---method B start---");
		method_C();
		System.out.println("---method B end---");
	}

	public static void method_C() {
		System.out.println("---method C start---");
		
		method_D();
		System.out.println("---method C end---");
	}

	public static void method_D() {
		int a=10/0;
		System.out.println("---- program end---");
	}



}
