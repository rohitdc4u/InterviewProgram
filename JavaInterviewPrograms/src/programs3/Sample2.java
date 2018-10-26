package programs3;

import java.io.IOException;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throw new IOException("Hello");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
