import java.util.Arrays;

public class Eight {
	//1~10000가지의 수중 8이 들어간 수의 개수를 구하여라? 10888->3개 
	
	
	public int eight(int [] n) {
		int cnt=0;
		
		for(int i=0; i<n.length; i++) {
			if(n[i]==8) { //배열의 i번쨰가 8이면
				cnt++;
				
			}
		}
		
		return cnt;
	}
	
	
	 public static void  main(String[] args){
		 Eight ei= new Eight();
		 int[] arr = {8, 0, 1, 2, 8, 3, 8, 1, 8};
		 System.out.println(Arrays.toString(arr));
		 System.out.println(ei.eight(arr));
		

	 }

}
