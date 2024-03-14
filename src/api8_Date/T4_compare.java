package api8_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class T4_compare {
	public static void main(String[] args) {
		// 날짜 시간 비교 (주의: 시간비교시는 ns(나노초)까지 비교된다)
		LocalDateTime startDateTime = LocalDateTime.now();
		System.out.println("오늘(현재) 날짜/시간: "+startDateTime);
		System.out.println();
		
		// . 을 기준으로 바깥을 잘라서 나노초를 제외하고 시작하는게 편함
		String tempToday = startDateTime.toString();
		String strToday = tempToday.substring(0,tempToday.indexOf("."));
		System.out.println("오늘(현재) 날짜/시간: "+strToday);
		
		// 날짜와 시간 구분하기('T' 문자를 기준으로 split()메소드 이용하여 자르기)
		String strDate = strToday.split("T")[0];
		String strTime = strToday.split("T")[1];
		System.out.println("오늘 날짜: "+strDate);
		System.out.println("오늘 시간: "+strTime);	
		System.out.println("=============================================");
		
		// 비교할 날짜/시간
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 1, 14, 14, 30, 20);
		System.out.println("타겟(비교) 날짜/시간: "+targetDateTime);
		System.out.println();
		
		// 지정 시간이기 때문에 나노초가 출력되지 않음
		String strTempToday = targetDateTime.toString();
		//String bigyoToday = strTempToday.substring(0,strTempToday.indexOf("."));
		System.out.println("오늘(현재) 날짜/시간: "+strTempToday);
		
		// 날짜와 시간 구분하기('T' 문자를 기준으로 split()메소드 이용하여 자르기)
		String bigyoDate = strTempToday.split("T")[0];
		String bigyoTime = strTempToday.split("T")[1];
		System.out.println("비교 날짜: "+bigyoDate);
		System.out.println("비교 시간: "+bigyoTime);	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		if(strDate.equals(bigyoDate)) System.out.println("같은날");
		else System.out.println("다른 날");
		
		// 날짜를 날짜 형식으로 비교하고자 한다면? isEqual(): 동일날짜비교, isBefore(): 이전날짜비교, isAfter(): 이후날짜비교, 날짜차이 : Period
		System.out.println("isEqual() : "+ startDateTime.isEqual(targetDateTime));
		System.out.println("isBefore() : "+ startDateTime.isBefore(targetDateTime)); // start는 target의 이전 날짜인가?
		System.out.println("isAfter() : "+ startDateTime.isAfter(targetDateTime)); // 이후 날짜인가?
		
		// 날짜 차이 계산(Period 클래스)
		LocalDate startDate = LocalDate.now();
		LocalDate targetDate = LocalDate.of(2024,1,14);//Period.between은 두개의 형식을 맞춰줘야 함
		Period period = Period.between(startDate, targetDate); // 뒤에서 앞에거 빼기
		System.out.println(period.getYears());
		System.out.println(period.getMonths()); // 총기간으로 계산이 됨
		System.out.println(period.getDays());
		System.out.println();
		
		// 해당월의 마지막 날짜 찾기 : __.atEndOfMonth()
		// 예) 2024년 2월 달력 출력하기 시작일-1 끝일-??
		String lastDay = "2024-02-10";
//		LocalDate bigyoDate2 = LocalDate.parse(lastDay, DateTimeFormatter.ofPattern("yyyy-MM-dd")); // 날짜형식 바꾸기
//		System.out.println(lastDay + "달의 마지막 일자? "+YearMonth.from(bigyoDate2).atEndOfMonth());
		
		// 한번에 저장해서 볼수 있도록 묶어보기
		System.out.println(lastDay + "달의 마지막 일자? "+YearMonth.from(LocalDate.parse(lastDay, DateTimeFormatter.ofPattern("yyyy-MM-dd"))).atEndOfMonth());
		// DateTimeFormatter를 이용해서 "yyyy-MM-dd" 형식으로 lastday가 들어간 달을 출력 후 YearMonth만 남김 -> 그 달의 마지막 날짜를 구하는 함수
		
		String lastDay2 = "2024-03-24";
		System.out.println(lastDay2 + "달의 마지막 일자? "+YearMonth.from(LocalDate.parse(lastDay2, DateTimeFormatter.ofPattern("yyyy-MM-dd"))).atEndOfMonth());
		// DateTimeFormatter -> 연(yyyy), 월(MM), 일(dd) 따로 혹은 연-월-일(yyyy-MM-dd) 같이 밖에 안됨(연-월 x)
		
	}
}
