package programs3;

public class AltCaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ROHIT KUMAR";
				
		for(int i=0; i <str.length(); i++) {
			char ch = str.charAt(i);
			if(i%2==0) {
				System.out.print(Character.toLowerCase(ch));
			}
			
			else if(i==0){
				System.out.print(Character.toLowerCase(ch));
			}
			
			else {
				System.out.print(Character.toUpperCase(ch));
			}
			
		

	}
		System.out.println();
	}
	
}
	


