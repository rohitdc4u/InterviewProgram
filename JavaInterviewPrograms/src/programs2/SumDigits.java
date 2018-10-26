package programs2;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, sum=0, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		while(num>0) {
			rem = num%10;
			sum =sum +rem;
			num = num/10;
		}
		
		System.out.println("The sum of the digits :"+ sum);
	}

}
