package api8_Date;

import java.util.Calendar;

public class T2_Calendar {
	public static void main(String[] args) {
		// Calendar cal = new Calendar(); : 이렇게 생성할 수 없음 - 싱글톤패턴
		Calendar cal = Calendar.getInstance();
		System.out.println("년도 : "+cal.get(Calendar.YEAR)); // 'Calendar' 클래스명으로 호출(열거형 참고)
		System.out.println("월 : "+(cal.get(Calendar.MONTH)+1)); // calendar 에서는 월을 0월부터 시작함
		System.out.println("일 : "+cal.get(Calendar.DATE));
		System.out.println("시 : "+cal.get(Calendar.HOUR_OF_DAY)); // hour랑 hour of day 차이점 인식
		System.out.println("분 : "+cal.get(Calendar.MINUTE));
		System.out.println("초 : "+cal.get(Calendar.SECOND));
		System.out.println("오늘이 몇 번째 주 : "+cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("오늘이 몇 번째 일 : "+cal.get(Calendar.DAY_OF_WEEK)); // 일요일부터 시작 일(1), 월(2) ~~ ,토(7)
		System.out.println(cal.get(Calendar.AM_PM)); // AM : 0, PM : 1
		
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = "";
		if(amPm == 0) strAmPm = "오전";
		else strAmPm = "오후";
		System.out.println("지금은 "+strAmPm+" 입니다.");
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String strWeek = "";
		switch(week) {
			case 1: strWeek = "일"; break;
			case 2: strWeek = "월"; break;
			case 3: strWeek = "화"; break;
			case 4: strWeek = "수"; break;
			case 5: strWeek = "목"; break;
			case 6: strWeek = "금"; break;
			case 7: strWeek = "토"; break;
//			case Calendar.SUNDAY: strWeek = "일"; break;
//			case Calendar.MONDAY: strWeek = "월"; break;
//			case Calendar.TUESDAY: strWeek = "화"; break;
//			case Calendar.WEDNESDAY: strWeek = "수"; break;
//			case Calendar.THURSDAY: strWeek = "목"; break;
//			case Calendar.FRIDAY: strWeek = "금"; break;
//			case Calendar.SATURDAY: strWeek = "토"; break;
		}
		System.out.println("오늘은 "+strWeek+"요일 입니다.");
	}
}
