package algorithm;

import java.util.Arrays;

/*단어 가운데 글자를 반환하는 함수
 단어의 길이가 짝수면 가운데 두글자, 홀수면은 가운데 글자.
 "abced"="c"
 "qwer"="qwer"
  
*/
public class MiddleLetter {
	
	public String solution(String s) {
		
		String answer="";
		int leg= s.length();
		if(leg%2==0) { //짝수이면
			answer= s.substring((leg/2)-1,(leg/2)+1); //abcd 2 => c가나옴 -1 ,+1
			
		}else {
			answer=s.substring((leg/2),(leg/2)+1);
		}
		
		
		return answer;
	}



	public static void main(String[] args) {
		MiddleLetter ml= new MiddleLetter();
		System.out.println(ml.solution("abcefgsegesfd"));
		
	}
}