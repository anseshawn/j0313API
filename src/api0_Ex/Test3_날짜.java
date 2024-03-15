package api0_Ex;

import java.time.LocalDate;
import java.util.Scanner;

/*
  ========================
  회원명  회원가입일자
  ========================
  홍길동 2000-1-1
  김말숙 2020-12-31
  이기자 2019-5-20
  소나무 2024-3-14
  아톰맨 2022-11-22
  에이맨 2023-12-11
  오하늘 2024-3-14
  최고봉 2021-3-14
  으뜸맨 2023-5-2
  사랑이 2024-3-13
  감나무 2022-10-10
  행복맨 2000-12-12
  가나다 2024-2-28
  오솔길 2024-3-1
  ========================
	(문제1)앞의 자료는 회원들의 등록일을 기억하고 있다.(모두 오늘 날짜를 기준으로 처리한다.)
	1. 등록된 회원들이 1년이상된 회원들의 명단출력?(단, 지금부터 몇개월이 지났는지와 함께 출력)
	2. 최근 1달안에 등록된 회원들의 명단과 경과된 일수를 함께 출력?
	3. 오늘 등록한 회원들의 명단과 경과된 시간을 함께 출력?
	
  (문제2) 문제1에서 주어진 내용을 임의의 날짜를 입력받아서 처리할 수 있도록 한다. 
  단, 입력날짜보다 이후에 등록된 회원은 '가입승인 대기중'이라고 출력한다.
*/
public class Test3_날짜 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate now = LocalDate.now();
		Test3_service service = new Test3_service();
		String[][] members = {
				{"홍길동", "2000-1-1"},
				{"김말숙", "2020-12-31"},
				{"이기자", "2019-5-20"},
				{"소나무", "2024-3-14"},
				{"아톰맨", "2022-11-22"},
				{"에이맨", "2023-12-11"},
				{"오하늘", "2024-3-14"},
				{"최고봉", "2021-3-14"},
				{"으뜸맨", "2023-5-2"},
				{"사랑이", "2024-3-13"},
				{"감나무", "2022-10-10"},
				{"행복맨", "2000-12-12"},
				{"가나다", "2024-2-28"},
				{"오솔길", "2024-3-15"}
		};
		boolean run = true;
		int choice;
		
		while(run) {
			System.out.println("\n==============================================================");
			System.out.println("** 다음 작업을 선택하세요 **(오늘날짜:"+now+")");
			System.out.println("==============================================================");
			System.out.print("1.전체회원 2.일년이상된회원 3.한달이내 등록한회원 4.오늘등록한회원, 0:종료 ==> ");
			choice = sc.nextInt();
			System.out.println("--------------------------------------------------------------");
			
			switch(choice) {
				case 1:
					service.memberList(members);
					break;
				case 2:
					service.oneYearList(members);
					break;
				case 3:
					service.oneMonthList(members);
					break;
				case 4:
					service.todayList(members);
					break;
				default:
					run = false;
			}
		}
		System.out.println("작업끝... 감사합니다.");
		sc.close();
	}
}
