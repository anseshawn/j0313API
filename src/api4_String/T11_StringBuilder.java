package api4_String;

public class T11_StringBuilder {
	public static void main(String[] args) {
		//.toString으로 마감 꼭 해주기 (.으로연결하기: 체이닝기법)
		String res = new StringBuilder()
				.append("Seoul")
				.append("/Busan")
				.append("/Cheongju")
				.append("/Jeju")
				.toString();
		System.out.println("res : "+res);
		System.out.println();
		
		StringBuilder str2 = new StringBuilder();
		System.out.println("용량 : " +str2.capacity());
		
		System.out.println("3.str2버퍼크기 : "+str2.capacity());
		str2.append("atom");
		System.out.println("4.str2 : "+str2);
		System.out.println("5.str2버퍼크기 : "+str2.capacity()); //16이하일때 글자가 들어가도 크기 유지
		
		str2.append("0123456789012345");
		System.out.println("6.str2 : "+str2);
		System.out.println("7.str2버퍼크기 : "+str2.capacity()); //16이 넘어가면 추가 생성
		
		str2.insert(2, "abcdefg"); //2번지부터 데이터값 삽입
		System.out.println("8.str2 : "+str2);
		System.out.println("9.str2버퍼크기 : "+str2.capacity());

		str2.replace(2, 5, "!!!!!!!!!!"); //2째부터 5번 앞까지의 위치를 이 값으로 바꾼다
		System.out.println("10.str2 : "+str2);
		System.out.println("11.str2버퍼크기 : "+str2.capacity());
		
		str2.delete(5, 20); // 5번째부터 20개 지우기
		System.out.println("12.str2 : "+str2);
		System.out.println("13.str2버퍼크기 : "+str2.capacity()); // 메모리에서 소멸되기 전에는 늘어난 용량이 줄어들지 않는다
		
	}
}
