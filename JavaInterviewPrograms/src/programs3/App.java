package programs3;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal dog = null;
		
		try {
			dog = new Animal("I am a dog", 10);
		} catch (AnimalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
