package api3_Class;

public class Test1 {
	public static void main(String[] args) {
		// Class.forName 은 패키지명.클래스이름을 적어줘야 함
		try {
			Class.forName("java.lang.String");
			System.out.println("String클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 파일이 존재하지 않습니다." + e.getMessage());
		} 
		System.out.println("작업끝");
	}
}
