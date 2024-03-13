package api2_String;

import java.util.Scanner;

public class T2_substring_Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//            0         1         2
		//            012345678901234567890
		String msg = "Welcome to Korea!!!";
		String str = "";
		int position, totPosition=0, cnt=0;
		System.out.println("입력된 문자열 : " + msg);
		System.out.print("찾고자 하는 문자를 입력하세요? ");
		str = sc.nextLine();
		
		while(true) {
			position = msg.indexOf(str);
			if(position == -1) break; // 4. 출력한 위치 이후부터 찾다가 없으면 반복문 탈출
			totPosition += position; // 3. 번지수는 앞에서부터 찍어야하기 때문에 누적으로 처리
			System.out.println((cnt+1) + "번째 위치(색인번지) : " + totPosition);
			msg = msg.substring(position + 1); // 1. 출력한 위치 이후부터로 문장 출력
			cnt++;
			totPosition++; // 2. 출력한 위치 이후부터의 문장도 0번부터 시작하기 때문에 +1
		}
		System.out.println(str + "문자는 총 "+cnt+" 개 있습니다.");
		sc.next();
	}
}
