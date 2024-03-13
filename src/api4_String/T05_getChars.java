package api4_String;

public class T05_getChars {
	public static void main(String[] args) {
		String str1 = "Hello!";
		
		char[] strArr = new char[str1.length()];
		str1.getChars(0, str1.length(), strArr, 0); // 배열복사...
		System.out.println("strArr : "+ strArr);
		System.out.println();
		
		String temp = "";
		for(char str : strArr) { // 배열이 char 타입이기 때문에 받아주는 변수도 char 타입
			temp += str + "/";
		}
		System.out.println(temp);
		System.out.println(temp.substring(0, temp.length()-1)); // 마지막 슬래시 제거
	}
}
