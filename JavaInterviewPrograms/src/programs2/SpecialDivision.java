package programs2;

import java.util.Scanner;

public class SpecialDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dividend, divisor, quotient =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		dividend=sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the number");
		divisor=sc1.nextInt();
		
		while(dividend >= divisor){
			dividend= dividend - divisor;
			quotient++;
		}
		
		System.out.println("the value of quotient is:" + quotient);
	}

}
