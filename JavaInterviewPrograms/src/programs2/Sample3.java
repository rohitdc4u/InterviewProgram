package programs2;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Super s = new Subclass();
		s.foo();

	}

}

class Super {
	 void foo() {
		System.out.println("Super");
	}
}

class Subclass extends Super {
	 void foo() {
		System.out.println("Subclass");
	}

}

