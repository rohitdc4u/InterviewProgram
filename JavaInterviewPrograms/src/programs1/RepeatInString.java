package programs1;

import java.util.Scanner;

public class RepeatInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " ";
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		str= sc.nextLine();
		
		char[] inp = str.toCharArray();
		for(int i =0; i <str.length(); i++){
			for(int j=i+1; j < str.length(); j++) {
				if(inp[i]==inp[j]) {
					System.out.println(inp[j]);
					count++;
					break;
				}
				
			}
		}

	}

}
