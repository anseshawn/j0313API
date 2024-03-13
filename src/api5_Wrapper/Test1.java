package api5_Wrapper;

// Wrapper 클래스 : 기본타입을 참조타입으로(Boxing), 참조타입을 기본타입으로(UnBoxing) 형 변환
public class Test1 {
	public static void main(String[] args) {
		int intSu1 = 100, intSu2 = 200;
		System.out.println("1. intSu1 + 100 : "+(intSu1 + 100));
		
		// 정수형 Boxing처리(Integer) - 기본타입(int)가 참조타입(객체)로 타입 변환
		Integer objSu1 = new Integer(intSu1); // 중간 줄 : 요즘은 이렇게 활용하지 않는다(오류는아님) 29번 라인 참조
		System.out.println("2. objSu1 + 100 : "+(objSu1 + 100)); // 객체로 바뀌어도 정수의 형질은 가지고 있다
		
		// 자동박싱(auto boxing) 처리의 예
		Integer objSu2;
		objSu2 = intSu1;
		System.out.println("3. objSu2 + 100 : "+(objSu2 + 100)); 
		
		// UnBoxing 처리
		String strIntSu1 = "100";
		System.out.println("4. strIntSu1 + 100 : "+(strIntSu1 + 100));
		System.out.println("5. strIntSu1 + 100 : "+(Integer.parseInt(strIntSu1) + 100));
		
		// double <-> Double
		double dblSu = 3.14;
		Double objDblSu = new Double(dblSu);
		System.out.println("6. objDblSu + 100.5 : "+(objDblSu + 100));
		
		// Boxing
		int su3 = 100;
		Integer objSu3 = Integer.valueOf(su3);
		System.out.println("7. objSu3 + 100 : "+(objSu3 + 100));
		
		//UnBoxing
		int su4 = Integer.valueOf(objSu3);
		System.out.println("8. su4 + 100 : "+(su4 + 100));
	}
}
