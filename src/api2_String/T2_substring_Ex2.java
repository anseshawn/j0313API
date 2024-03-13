package api2_String;

import java.util.Scanner;
//indexOf(찾고자하는문자, 시작위치)

public class T2_substring_Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//            0         1         2
		//            012345678901234567890
		String msg = "Welcome to Korea!!!";
		String str = "";
		int position=-1, cnt=0; // 2. 0번부터 찾아야하기 때문에 초기값 -1
		System.out.println("입력된 문자열 : " + msg);
		System.out.print("찾고자 하는 문자를 입력하세요? ");
		str = sc.next();
		
		while(true) {
			position = msg.indexOf(str, position+1); // 1. 찾은 위치 이후부터 찾아야하니까 +1
			if(position == -1) break;
			System.out.println((cnt+1) + "번째 위치(색인번지) : " + position);
			cnt++;
		}
		System.out.println(str + "문자는 총 "+cnt+" 개 있습니다.");
		sc.next();
	}
}
