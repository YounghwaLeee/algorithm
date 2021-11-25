import java.util.HashSet;

public class test01 {
		    public static int[] solution(int[] numbers) {
		        
		        HashSet<Integer> set = new HashSet<>();
		     
		        for(int i=0; i<numbers.length;i++){
		           for(int j=0; j<numbers.length;j++){
		              
		        	   set.add(numbers[i] + numbers[j]);
		           }
		            
		        }
		   
		        
		        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
		    }
		
		
	

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] result = solution(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
			
		}

	}

}
