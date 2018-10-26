package programs1;

public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {8,15,63,35,49,74,25,36};
		
		int temp;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
			
		}
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i] +" ");
		}

	}

}
