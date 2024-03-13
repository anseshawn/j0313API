package api2_System;

public class Test3 {
	public static void main(String[] args) {
		int i, tot=0;
		
		for(i=1; i<=100000000; i++) {
			tot += i; 
			if(tot >= 10000) {
				System.out.println("합이 10000이상일 때 i값은? "+i);
				//break;
				//return; // 메소드를 탈출해서 프로그램이 종료됨. (그러나 중괄호 블록을 제대로 끝내지 않았기 때문에 JVM이 헷갈릴 수도...) 
				System.exit(0); //return과의 결과는 똑같음. (JVM에서 끝내버림)
			}
		}
		System.out.println("작업끝");
	}
}
