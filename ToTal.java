
public class ToTal {
	//두 정수a,b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, 
	//a=3, b=5인 경우 3+4+5=12
	
    public int solution(int a, int b) {
    	int sum=0;
    	int frist=0;
    	int second=0;
    	if(a==b) {
    		return a;
    	} else if(a<b){
    		frist=a;
    		second=b;
    	}else{
    		frist=b; //frist b 대입/ second a대입 
    		second=a;
    		
    	}
    	
    	for(int i=frist; i<=second; i++) {
    		sum+=i;
    	}
    	
    	return sum;
    	}
    	

	public static void main(String[] args) {
		ToTal ta=new ToTal();
		int result= ta.solution(5, 2); //14
		System.out.println(result);

	}

}
