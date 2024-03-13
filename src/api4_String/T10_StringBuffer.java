package api4_String;

/*
 	=> mutable(가변) / immutable(불가변)
	String객체 : immutable객체로서 class로써 한번 크기가 생성된 값을 그 값을 유지하게 된다. 짧은 문자열처리
	StringBuffer객체 : mutable객체로서 크기를 변경 할 수 있다. 동기화를 제공, 멀티스레드를 제공, 멀티스레드에서 사용하기 적절하다. 가변길이 문자열에 적당
	StringBuilder객체 : mutable객체로서 크기를 변경 할 수 있다. 동기화여부가 불분명, 가변길이 문자열에 적당
	성능 : StringBuilder(가장느림) > StringBuffer >>> String(가장빠름)
*/
// TSS(시 분할방식) -> cpu가 작업해야할 분량을 쪼개서 사용
public class T10_StringBuffer {
	public static void main(String[] args) {
		String str = new String("홍길동");
		System.out.println("1.str : "+str); //세글자로 고정(immutable)
		
		str += "/홍길동2";
		System.out.println("2.str : "+str); //강제로 글자를 늘린 후 8바이트(글자수)로 고정(immutable)
		
		// capacity() : 현재 버퍼의 크기(용량)를 알아낸다.
		// str.capacity(); => str은 불가변이기 때문에 볼 수 없음
		
		// StringBuffer()객체 : 가변길이클래스로서 기본크기는 16, 자료가 넘치면 상황에 따라서 크기를 변경처리한다.
		// append : 값을 추가할 때 사용하는 명령, insert : 값을 특정 위치에 삽입, delete : 특정 위치의 값을 지정한 개수만큼 삭제처리, replace : 값을 치환
		StringBuffer str2 = new StringBuffer();
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
		
		str2.delete(5, 20); // 5번째부터 20개 지우기
		System.out.println("10.str2 : "+str2);
		System.out.println("11.str2버퍼크기 : "+str2.capacity()); // 메모리에서 소멸되기 전에는 늘어난 용량이 줄어들지 않는다
	}
}
