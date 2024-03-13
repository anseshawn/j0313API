package api4_String;

import java.io.UnsupportedEncodingException;

public class T04_getBytes {
	public static void main(String[] args) {
		// 아스키코드 : 영문1글자 1Byte, 한글 2Byte
		// EUC-KR : 영문1글자 1Byte, 한글 2Byte
		// 유니코드 : UTF-8 영문1글자 1Byte, 한글 3Byte
		String str1 = "안녕하세요!";
		String str2 = "Hello!";
		
		System.out.println("str1의 길이 : "+ str1.length());
		System.out.println("str2의 길이 : "+ str2.length());
		System.out.println();
		
		// 통신할 때는 byte
		byte[] b1 = str1.getBytes(); // 문자열을 byte로 바꿔서 배열에 넣기 getByte: UTF-8
		System.out.println("b1의 길이 : "+b1.length);
		
		byte[] b2 = str2.getBytes(); 
		System.out.println("b2의 길이 : "+b2.length);
		System.out.println();
		
		// 인코딩(암호화)/디코딩(복화)
		try {
			// EUC-KR
			// 한글 인코딩 <-> 디코딩
			byte[] b3 = str1.getBytes("EUC-KR"); //인코딩
			System.out.println("b3의 길이 : "+b3.length);
			System.out.println("b3 : "+b3.toString()); //.toString()은 생략 가능. 오버라이딩 한 적 없기 때문에 객체 주소 나옴
			System.out.println("b3[0] : " + b3[0]); //0번 배열의 코드값 ('안'이라는 글자의 EUC-KR 코드값)
			System.out.println("~~~~~~~~~전송중~~~~~~~~~");
			//복화하게 되면 무조건 문자로 받아야 한다
			String str3 = new String(b3, "EUC-KR"); //디코딩. EUC-KR로 암호화 하였으니 EUC-KR로 복구해야 함
			System.out.println("str3 : "+ str3);
			System.out.println();
			
			// 영문 인코딩 <-> 디코딩
			byte[] b4 = str2.getBytes("EUC-KR"); //인코딩
			System.out.println("b4의 길이 : "+b4.length);
			System.out.println("b4 : "+b4.toString());
			System.out.println("b4[0] : " + b4[0]);
			System.out.println("~~~~~~~~~전송중~~~~~~~~~");
			String str4 = new String(b4, "EUC-KR"); //디코딩
			System.out.println("str4 : "+ str4);
			System.out.println("====================================");
			
			// UTF-8
			// 한글 인코딩 <-> 디코딩
			b3 = str1.getBytes("UTF-8"); //인코딩
			System.out.println("b3의 길이 : "+b3.length);
			System.out.println("b3 : "+b3.toString());
			System.out.println("b3[0] : " + b3[0]);
			System.out.println("~~~~~~~~~전송중~~~~~~~~~");
			//복화하게 되면 무조건 문자로 받아야 한다
			str3 = new String(b3, "UTF-8"); //디코딩. EUC-KR로 암호화 하였으니 EUC-KR로 복구해야 함
			System.out.println("str3 : "+ str3);
			System.out.println();
			
			// 영문 인코딩 <-> 디코딩
			b4 = str2.getBytes("UTF-8"); //인코딩
			System.out.println("b4의 길이 : "+b4.length);
			System.out.println("b4 : "+b4.toString());
			System.out.println("b4[0] : " + b4[0]);
			System.out.println("~~~~~~~~~전송중~~~~~~~~~");
			str4 = new String(b4, "UTF-8"); //디코딩
			System.out.println("str4 : "+ str4);
			
			
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
