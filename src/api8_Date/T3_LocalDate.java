package api8_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class T3_LocalDate {
	public static void main(String[] args) {
		// LocalDate 객체
		LocalDate currentDate = LocalDate.now(); // 싱글톤은 아니지만 클래스명으로 불러 써야 함 (정적멤버)
		System.out.println("오늘 날짜 : "+currentDate); // 간단하게 기본 포맷 날짜 출력
		
		// 날짜 지정 셋팅
		currentDate = LocalDate.of(2024, 12, 25);
		System.out.println("지정 날짜 : "+currentDate);
		
		// 시스템의 현재 시간정보 가져오기
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시각 : "+currentTime); //millisecond로 표시
		System.out.println("현재 시각 : "+currentTime.toString().substring(0,8));
		
		// 시간 지정 셋팅
		LocalTime targetTime = LocalTime.of(12, 50, 30);
		System.out.println("설정 시각 : "+targetTime);
		
		// 날짜 시간
		LocalDateTime currentTime2 = LocalDateTime.now();
		System.out.println("오늘 날짜 시간 : "+currentTime2);
		
		//날짜와 시간 분리하기
//		int num = currentTime2.toString().indexOf("T");
//		System.out.println("오늘 날짜: "+currentTime2.toString().substring(0,num));
//		System.out.println("오늘 시간: "+currentTime2.toString().substring(num+1, currentTime2.toString().length()));
		String[] strToday = currentTime2.toString().split("T");
		System.out.println("오늘 날짜: "+strToday[0]);
		System.out.println("오늘 시간: "+strToday[1].substring(0,8));
		
		// 날짜 시간 지정 셋팅
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 3, 14, 13, 5, 10);
		System.out.println("설정 날짜/시간 : " + targetDateTime);
		System.out.println();
		
		// 날짜 연산하기
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		System.out.println("현재 날짜/시간 : "+now.format(dtf)); //위에 설정한 형식대로 내용 출력
		
		
		LocalDateTime res = now.plusYears(1); //날짜 계산
		System.out.println("1년 더하기 : "+res.format(dtf).substring(0,4) +"년");
		
		res = now.minusYears(1);
		System.out.println("1년 빼기 : "+res.toString().substring(0,4)+"년");
		
		
		res = now.plusMonths(2);
		System.out.println("2개월 더하기 : "+res.toString().substring(5,7)+"월");
		
		res = now.minusMonths(2);
		System.out.println("2개월 빼기 : "+res.toString().substring(5,7)+"월");
		
		res = now.plusDays(7);
		System.out.println("7일 더하기 : "+res.toString().substring(8,10)+"일");
		
		res = now.minusDays(7);
		System.out.println("7일 빼기 : "+res.toString().substring(8,10)+"일");
		System.out.println();
		
	}
}
