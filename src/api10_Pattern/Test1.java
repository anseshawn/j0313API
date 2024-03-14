package api10_Pattern;

import java.util.regex.Pattern;

// 정규식은 Pattern클래스를 사용
// 숫자판별 : ^[\\d]*$ (처음부터 끝까지 숫자가 0개이상) 
public class Test1 {
	public static void main(String[] args) {
		String str1 = "1234";
		String str2 = "1A234";
		
		// 정규식을 만든 후 입력데이터와 조건비교처리한다 (항상 정규식 먼저 만들기)
		String regEx = "^[\\d]*$";
		
		// 정규식은 리턴 타입이 무조건 true 아니면 false
		// 1번 방법(자주사용하진않는다)
		Boolean pattern1 = Pattern.compile(regEx).matcher(str1).find();
		// 보통 객체타입으로
		// matcher(어떤거와) .find 찾아서
		Boolean pattern2 = Pattern.compile(regEx).matcher(str2).find();
		System.out.println("1. : "+pattern1);
		System.out.println("2. : "+pattern2);
		System.out.println();
		
		// 2번 방법
		Boolean pattern3 = Pattern.matches(regEx, str1); 
		Boolean pattern4 = Pattern.matches(regEx, str2); 
		System.out.println("3. : "+pattern3);
		System.out.println("4. : "+pattern4);
		
		System.out.println("5. : "+Pattern.matches(regEx, str1));
		System.out.println("6. : "+Pattern.matches(regEx, str2));
		System.out.println();
		
		// 프로그램에서의 적용 예...
		if(Pattern.matches(regEx, str1)) System.out.println("str1은 숫자가 맞습니다.");
		else System.out.println("str1은 숫자가 아닌 값(문자?)을 포함하고 있습니다.");
		
		if(Pattern.matches(regEx, str2)) System.out.println("str2는 숫자가 맞습니다.");
		else System.out.println("str2는 숫자가 아닌 값(문자?)을 포함하고 있습니다.");
	}
}
