import java.util.Arrays;

public class Eight {
	//1~10000������ ���� 8�� �� ���� ������ ���Ͽ���? 10888->3�� 
	
	
	public int eight(int [] n) {
		int cnt=0;
		
		for(int i=0; i<n.length; i++) {
			if(n[i]==8) { //�迭�� i������ 8�̸�
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
