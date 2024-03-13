package api4_String;

import java.util.HashMap;

public class T08_valueOf {
	public static void main(String[] args) {
	// String.valueOf() : ~~자료형들을 '문자열'로 변환한다
		
//		int intSu = 1234;
//		double dblSu = 1234.0;
		Integer intSu = 1234; // 일반타입에서 참조타입으로 변경
		Double dblSu = 1234.0; // 박싱
		String strSu = "1234";
		HashMap<String, Integer> map = new HashMap<>();
		
		System.out.println(strSu);
		System.out.println(strSu.getClass().getName()); //class.name -> 클래스의 타입을 찍는다
		System.out.println(intSu.getClass().getName()); // int 에서는 사용할 수 없음(객체만 사용할 수 있는데 기본타입이기 때문) -> Integer로 변경
		System.out.println(dblSu.getClass().getName());
		System.out.println(map.getClass().getName());
		
		int intSu2 = 1234;
		System.out.println("1.intSu + 100 = " +(intSu + 100));
//		String strsu2 = (String) intSu2;  // 1. int를 String으로 강제캐스팅 - X
//		String strsu2 = intSu2.toString(); // 2. -X
		String strsu2 = intSu + ""; // 3. 연산으로 바꾸기 - O
		strsu2 = intSu2 + ""; // 4. - O
		
		String strSu3 = String.valueOf(intSu2); // 5. - O
		System.out.println(strSu3.getClass().getName());
		
		double dblSu4 = 3.14;
		String strSu4 = String.valueOf(dblSu4); // O
		System.out.println(strSu4.getClass().getName());
		System.out.println();
		
		int a1 = 100, a2 = 200;
		int res = a1 + a2;
		System.out.println("res : "+res);
		
		String str5 = String.valueOf(a1) + String.valueOf(a2); // 문자로 변환
		System.out.println(str5); // 확인해보면 계산이 아니라 문자+문자로 출력된다
		
		//int res6 = (int) String.valueOf(a1) + (int) String.valueOf(a2);
		int res6 = Integer.parseInt(String.valueOf(a1)) + Integer.parseInt(String.valueOf(a2)); // 문자로 변환한 걸 다시 숫자로 변환
		System.out.println("res6 : "+res6);
	}
}
