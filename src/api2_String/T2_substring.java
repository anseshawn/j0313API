package api2_String;

public class T2_substring {
	public static void main(String[] args) {
		//             0         1         2
		//             012345678901234567890  :헷갈릴때 숫자부여
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국에 방문하신 것을 환영합니다.";
		
		//substring() : 지정된 위치(인덱스번지)의 값을 출력
		//substring(n) : 지정된 위치부터 마지막까지의 문자열을 출력
		//substring(n,m) : 지정된 위치(n)부터 (m-1)위치 까지의 문자열을 출력
		System.out.println("1.msg1에 3번째 인덱스위치부터 출력: "+ msg1.substring(3)); //숫자-인덱스번지
		System.out.println("2.msg1에 3번째부터 12번째 인덱스 앞까지 출력: "+ msg1.substring(3,12)); //숫자-인덱스번지
		
		// Ko~ 로 시작하는 단어를 출력
		System.out.println("Ko~ "+msg1.indexOf("Ko"));
		System.out.println("!!!: "+msg1.indexOf("!!!"));
		System.out.println("Korea: "+msg1.substring(msg1.indexOf("Ko"),msg1.indexOf("!!!")));
		//1.있는거 찾기 2. 몇개 있다 3.첫번째는 몇번지, 두번째는 몇 번지
		//String.length : 길이 출력 함수 사용해도 됨
		//혹은 CharAt로 비교 
		
	}
}
