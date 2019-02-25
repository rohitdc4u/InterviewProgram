package programs3;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal dog = null;
		
		try {
			dog = new Animal("I am a dog", -5);
		}
		
		catch(AnimalException e){
			
			System.out.println(e.getMessage());
		}

	}

}
