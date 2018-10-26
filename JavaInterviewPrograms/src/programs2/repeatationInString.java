package programs2;

import java.util.HashMap;

public class repeatationInString {
	
	static void  characterCount(String inputString) {
		HashMap<Character,Integer> charCountMap = new HashMap<>();
		char[] strArray = inputString.toCharArray();
		
		for(char c : strArray) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			}
			
			else {
				charCountMap.put(c, 1);
			}
			
		}
		
		System.out.println(charCountMap);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		characterCount("impossible");

	}

}
