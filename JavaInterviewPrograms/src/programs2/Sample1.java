package programs2;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m =7;
		int n= m + 'a' - 'X';
		int i =m;
		for(;i <=n;) {
			m+=i++;
		}
		System.out.println("i =" +i+"m="+n+"n= "+m);
	}

}
