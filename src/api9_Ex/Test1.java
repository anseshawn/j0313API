package api9_Ex;

import java.util.Scanner;

/*
  콘솔을 통해서 파일명을 입력받은후, 입력받은 파일의 성격을 구해서 화면에 출력하시오.
  예) 화일명을 입력하세요? abc.jpg
     abc.jpg ==> 그림파일
     계속할까요?(Y/N) Y
     ================================
     화일명을 입력하세요? atom.txt
     atom.txt ==> 텍스트파일
     계속할까요?(Y/N) y
     ================================
     화일명을 입력하세요? mbc.zip
     mbc.zip ==> 압축파일
     계속할까요?(Y/N) Y
     ================================
     화일명을 입력하세요? sbs.xlsx
     sbs.xlsx ==> 엑셀파일
     계속할까요?(Y/N) y
     ================================
     화일명을 입력하세요? seoul.hwp
     seoul.hwp ==> 한글파일
     계속할까요?(Y/N) Y
     ================================
     화일명을 입력하세요? busan.gif
     busan.hwp ==> 그림파일
     계속할까요?(Y/N) n
     ================================
     수고하셨습니다.
*/
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] extName = {"jpg","gif","png","hwp","txt","xlsx","zip","pptx"};
		String[] content = {"그림","그림","그림","한글","텍스트","엑셀","압축","파워포인트"};
		
		while(true) {
			System.out.println("==================");
			System.out.print("파일명을 입력하세요? ");
			String fileName = sc.next();
			
			int cnt = 0;
			String ext = fileName.substring(fileName.lastIndexOf(".")+1).toLowerCase();
			for(int i=0; i<extName.length; i++) {
				if(ext.equals(extName[i])) {
					System.out.println(content[i] + "파일 입니다.");
					break;
				}
				cnt++;
			}
			if(cnt == extName.length) System.out.println("잘못된 파일입니다.");
			
			System.out.print("계속하시겠습니까?(Y/N) ");
			String ans = sc.next();
			if(ans.toUpperCase().equals("N")) break;
		}
		System.out.println("=> 작업을 종료합니다.");
		sc.close();
	}
}
