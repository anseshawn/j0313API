package api4_String;

import java.util.StringTokenizer;

public class T12_StringTokenizer {
	public static void main(String[] args) {
		// StringTokenizer : 문자열을 특정 문자(열)로 분리시킨 후 ~ 분리 된 각각의 토큰(항목)을 내부반복자(이터레이터)로 호출시켜준다. (split이랑 비슷하지만 배열은 아님)
		
		String tel = "010-1234-5678";
		
		StringTokenizer telArr = new StringTokenizer(tel, "-");
		
		System.out.println("telArr토큰의 개수: "+ telArr.countTokens()); 
		
		//토큰의 개수를 모르겠는 채로 호출할 때
		String str = "";
		while(telArr.hasMoreElements()) { //BOF 에서 EOF 까지 이동하면서 다음토큰 찾기
			str += telArr.nextToken() + "/"; //토큰 호출해서 옮겨준 후 다음 토큰으로 이동
		}
		System.out.println("str : "+str.substring(0, str.length()-1));
	}
}
