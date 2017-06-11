
public class Child extends Parent{

	public void method1() {
		System.out.println("Child's method1()");
	}

	public static void main(String args[]) {
		Child p = new Child();
		p.method2();
	}
}
