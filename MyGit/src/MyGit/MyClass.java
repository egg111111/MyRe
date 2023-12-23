package MyGit;

public class MyClass {

	public int MyClass(int a) {
		int c;
		c = a * a + 2 - 1;
		return c;
	}
	
	public void main() {
		int num;
		num = MyClass(5);
		System.out.println("num = " + num);
	}

}
