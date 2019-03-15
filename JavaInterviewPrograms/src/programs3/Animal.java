package programs3;

public class Animal {
	
	private String name;
	private int age;
	
	public Animal(String name, int age) throws AnimalException{
		if(age<0) {
			
				throw new AnimalException("An animal cant have a negative age " + age);
			
			}
		
		else {
			this.name= name;
			this.age= age;
			System.out.println("You have created a dog");
		}
	}

}
