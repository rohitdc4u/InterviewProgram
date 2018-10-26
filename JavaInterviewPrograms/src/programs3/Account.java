package programs3;

public class Account {
	
	void display(int accountId, int... amount) {
		int sum=0;
		for(int x:amount) {
			sum+=x;
		}
		
		System.out.println("the sum is"+accountId+sum);
	}
	
	
	
	

	public static void main(String[] args) {
			
		Account account = new Account();
		account.display(1001,20,30,40,60,80);

	}

}
