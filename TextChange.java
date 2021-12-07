
public class TextChange {

//문제 : 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.'
/*	 "one4seveneight->1478"
	 "23four5six7-> 234567"
	 "1zerotwozero3->10203"

 */
	public int solution(String s) {
		
		int answer=0;
	
		String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] number= {"0","1","2","3","4","5","6","7","8","9"};
		
		for(int i=0; i<number.length; i++) {
			s =s.replaceAll(number[i],word[i]);
			//replace-> char / replaceAll-> String(정규표현식) 의미 
		}
		answer= Integer.parseInt(s); //문자열을 숫자로 반환.		
		return answer;
	}


}


