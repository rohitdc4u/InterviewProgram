package programs3;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subclass s1 = new Subclass();
		s1.foo(); //line 7
		
//		Super s = new Subclass();
//		s.foo(); // line 10

	}

}

class Super {
	private void foo() {
		System.out.println("Super");
	}
}

class Subclass extends Super {
	public void foo() {
		System.out.println("Subclass");
	}
}