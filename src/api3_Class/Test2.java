package api3_Class;

public class Test2 {
	public static void main(String[] args) {
		// Class.forName 은 패키지명.클래스이름을 적어줘야 함
		try {
			Class.forName("java.lang.String");
			System.out.println("String클래스가 존재합니다.");
			
			// 객체의 정보(Test1.class) 알아내어 출력하기
			Class clazz = Test1.class; //Test1 파일의 정보를 clazz로 알아낼 수 있다
			System.out.println("전체이름(패키지명+파일명) : " + clazz.getName());
			System.out.println("패키지명 : " + clazz.getPackage());
			System.out.println("객체의 타입명 : " + clazz.getTypeName());
			System.out.println("simple 이름 : " + clazz.getSimpleName());
			System.out.println();
			
			Class imgPath = Test2.class;
			System.out.println("그림파일의 경로명 : "+ imgPath.getResource("./images/121.jpg").getPath()); // \ 혹은 / : 경로를 뜻함 '.': 자기자신 '..': 상위폴더
			System.out.println("Test2.class 의 경로명 : "+ imgPath.getResource("Test2.class").getPath());
			System.out.println("Test2.class 의 경로명 : "+ clazz.getResource("Test2.class").getPath());
			System.out.println("현재 작업경로의 루트(/)명 : "+ clazz.getResource("/").getPath()); //최상위경로: 루트'/'
			System.out.println("그림파일의 경로명1 : "+ imgPath.getResource("/api3_Class/images/121.jpg").getPath()); // '/'를 src로 인식하고 src 아래의 api3_Class 부터 찾기시작
			//System.out.println("그림파일의 경로명2 : "+ imgPath.getResource("/images/121.jpg").getPath());
			//에러: 잘못된 경로와 파일명을 입력하면 NullPointer exception 뜸
			System.out.println();
			
			System.out.println("api2_System패키지의 Test1.class의 경로명1 : "+ imgPath.getResource("/api2_System/Test1.class").getPath());
			//현재 api2 패키지와 api3 패키지의 루트(최상위경로)는 둘다 src기 때문에 최상위(/) + 찾는패키지(api2) + / + 클래스명(Test1)
			//내가 현재 존재하는 절대경로에서 출발
			
			System.out.println("api2_System패키지의 Test1.class의 경로명2 : "+ imgPath.getResource("../api2_System/Test1.class").getPath());
			// .. <<상위폴더 에서 시작
			// 현재는 루트가 최상위경로기 때문에 ../../로 찾을 수 없음 (src를 벗어날 수 없음)
			
			//System.out.println("api2_System패키지의 Test1.class의 경로명2 : "+ imgPath.getResource("../../src/api2_System/Test1.class").getPath());
			//최상위폴더(src(또는 bin))를 벗어남 (루트를 벗어나면 다시 돌아올 수 없음)
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 파일이 존재하지 않습니다." + e.getMessage());
		} finally {
			System.out.println("작업끝");			
		}
	}
}
