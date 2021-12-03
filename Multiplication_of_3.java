
public class Multiplication_of_3 {
	
	//1~10000까지의 정수중 3의배수의 개수 출력하기
	public int three(int [] num) {
		
		int cnt=0;
		
		for(int i=0; i<num.length; i++) {
			//i <=num.length 0,1 이 두번돌게 된다
			//num[0], num[1] 배열은 두번 도는거니깐 
			if((num[i]%3)==0) {
				cnt++;
				
			}
		}
		return cnt;
	}
	

	public static void main(String[] args) {
		Multiplication_of_3 th= new Multiplication_of_3();
		int [] n= {12,7,9,5};
		System.out.println("3�� ����� ������="+th.three(n)+"���Դϴ�.");
		

	}

}
