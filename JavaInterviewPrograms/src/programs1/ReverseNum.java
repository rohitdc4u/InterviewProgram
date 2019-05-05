package programs1;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =25415;
		int reversenum = 0;
		
		while(num>0) {
			int digit = num % 10;
			reversenum = reversenum +digit;
			num = num/10;
			
		}
		
		System.out.println(reversenum);

	}

}
