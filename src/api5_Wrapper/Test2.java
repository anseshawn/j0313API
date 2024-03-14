package api5_Wrapper;

public class Test2 {
	public static void main(String[] args) {
		// -2^(n-1) ~ 2^(n-1) - 1
		// 객체에 정수값 대입시, 1Byte의 저장범위인 -128~127 사이의 값은 해당 번지에 저장시키기에 '=='으로 비교하면 같은 값으로 출력
		// 결론은 객체의 비교시는 equals로 비교한다
		Integer objInt1 = 300; //객체형 정수
		Integer objInt2 = 300;
		System.out.println("== : "+ (objInt1 == objInt2));
		System.out.println("equals : "+ (objInt1.equals(objInt2)));
		System.out.println();
		
		Integer objInt3 = 10; 
		Integer objInt4 = 10;
		System.out.println("== : "+ (objInt3 == objInt4));
		System.out.println("equals : "+ (objInt3.equals(objInt4)));
	}
}
