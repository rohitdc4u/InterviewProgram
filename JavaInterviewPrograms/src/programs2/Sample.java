package programs2;

import java.util.HashMap;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map m = new HashMap();
		m.put(101, "Test");
		m.put(102, "Fest");
		m.put(101, "Rest");
		
		System.out.println(m);

	}

}
