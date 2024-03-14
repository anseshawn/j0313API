package api7_Random;

import java.util.Random;

// 난수 함수
public class Test1 {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt()); // -2^31 ~ 2^31-1 의 정수형 난수 발생(int 크기범위)
		System.out.println(random.nextLong()); // 2의 64승의 정수형 난수 발생
		System.out.println(random.nextDouble()); // 실수형 난수 발생
		System.out.println(random.nextFloat()); // 4바이트 크기의 실수형 난수 발생
		System.out.println(random.nextBoolean()); // boolean의 경우의 수: 2가지 
		System.out.println();
		System.out.println("0~9 : "+ (random.nextInt(10)));
		System.out.println("1~10 : "+ (random.nextInt(10)+1));
		System.out.println("5~10 : "+ (random.nextInt(10+1-5)+5));
		System.out.println("20~30 : "+ (random.nextInt(30+1-20)+20));
		System.out.println();
		
		// 클래스 안의 매개값으로 난수를 고정시킬 수 있다.
		Random random1 = new Random(5); // 난수표의 위치값 지정. 난수표에서 5번에 들어간 숫자를 출력
		for(int i=1; i<=6; i++) {
			System.out.print((random1.nextInt(45)+1)+"\t");
		}
		System.out.println();
		
		Random random2 = new Random(10);
		for(int i=1; i<=6; i++) {
			System.out.print((random2.nextInt(45)+1)+"\t");
		}
		System.out.println();
		
		Random random3 = new Random();
		for(int i=1; i<=6; i++) {
			System.out.print((random3.nextInt(45)+1)+"\t");
		}
	}
}
