
public class subac {



	public String subac(int n) {
		String answer="";
		for(int i=1; i<=n; i++) {
			if(i%2!=0) {
				answer+="¼ö";
			}else {
				answer+="¹Ú";
			}
			
		}
		return answer;
	}
	 public static void  main(String[] args){
		 subac su= new subac();
		 System.out.println(su.subac(3));
		 System.out.println(su.subac(4));

	 }
	 
}
