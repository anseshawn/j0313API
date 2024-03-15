package api10_Pattern;

import java.util.regex.Pattern;

// 문자열 정규식...(?는 0번이나 1번, +는 1번 이상, *는 0번 이상)
// w: 영문대소문자 및 숫자, _(밑줄) 허용
public class Test5 {
	public static void main(String[] args) {
		String regEx1 = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9]+\\.[a-z]+$"; // . 이 제어코드가 아니라는 걸 의미하기 위해 \\
		String regEx2 = "^[a-zA-Z0-9_-]{3,}@[a-zA-Z0-9]+\\.[a-z]+$"; // +: 1개이상을 뜻하므로 길이 제한을 위해 + 대신 {숫자,} (최소 숫자 개)
		String regEx3 = "^[a-zA-Z0-9_-]{3,12}@[a-zA-Z0-9]+\\.[a-z]+$"; // {숫자1,숫자2} (숫자1~숫자2 개)
		String regEx4 = "^[a-zA-Z0-9_-]{3,12}@[a-zA-Z0-9]+\\.[a-z]+\\.[a-z]*$"; // .co.kr 형식 메일주소를 위한 조건 ('.'이 무조건 두개 들어가야 하기 때문에 앞부분이 false가 된다)
		String regEx5 = "^[a-zA-Z0-9_-]{3,12}@[a-zA-Z0-9]+\\.[a-z]+(\\.[a-z])*$"; // ?
		String regEx6 = "^[a-zA-Z0-9_-]{3,12}@[a-zA-Z0-9]+(\\.[a-z]+)+$"; // O ('.'+알파벳이 1번이상) 의 조건이 1번 이상 나와야 한다 는 의미
		String regEx7 = "\\w+@\\w+\\.\\w+"; //w가 한번이상 @ w가 한번이상 . w가 한번이상
		String regEx8 = "\\w+@[a-zA-Z0-9]+\\.[a-z]+";
		String regEx9 = "\\w{3,}@[a-zA-Z0-9]{1,8}\\.[a-z]{1,4}";
		
		String str00 = "";
		String str01 = "atom@naver.com";
		String str02 = "atom1234@naver.com";
		String str03 = "atom_1234@naver.com";
		String str04 = "atom!1234@naver.com";
		String str05 = "atom 1234@naver.com";
		String str06 = "atOM1234123412341234@naver.com";
		String str07 = "a@naver.com";
		String str08 = "at_OM1234@naver.com";
		String str09 = "atom@naver.co.kr";
		String str10 = "_at-om@naver.co.kr";
		String str11 = "_at-om@naver.COM";
		String str12 = "_at-om@naver!.COM";
		String str13 = "_atom@na_ver.com";
		String str14 = "_at-om@na_ver1234.com";
		String str15 = "atom@naverasdfasdfasdfasdf.com";
		
		System.out.println("1:00= "+Pattern.matches(regEx1, str00));
		System.out.println("1:01= "+Pattern.matches(regEx1, str01));
		System.out.println("1:02= "+Pattern.matches(regEx1, str02));
		System.out.println("1:03= "+Pattern.matches(regEx1, str03));
		System.out.println("1:04= "+Pattern.matches(regEx1, str04));
		System.out.println("1:05= "+Pattern.matches(regEx1, str05));
		System.out.println("1:06= "+Pattern.matches(regEx1, str06));
		System.out.println("1:07= "+Pattern.matches(regEx1, str07));
		System.out.println("1:08= "+Pattern.matches(regEx1, str08));
		System.out.println("1:09= "+Pattern.matches(regEx1, str09));
		System.out.println("1:10= "+Pattern.matches(regEx1, str10));
		System.out.println("1:11= "+Pattern.matches(regEx1, str11));
		System.out.println("1:12= "+Pattern.matches(regEx1, str12));
		System.out.println("1:13= "+Pattern.matches(regEx1, str13));
		System.out.println("1:14= "+Pattern.matches(regEx1, str14));
		System.out.println("1:15= "+Pattern.matches(regEx1, str15));
		System.out.println();
		
		System.out.println("2:00= "+Pattern.matches(regEx2, str00));
		System.out.println("2:01= "+Pattern.matches(regEx2, str01));
		System.out.println("2:02= "+Pattern.matches(regEx2, str02));
		System.out.println("2:03= "+Pattern.matches(regEx2, str03));
		System.out.println("2:04= "+Pattern.matches(regEx2, str04));
		System.out.println("2:05= "+Pattern.matches(regEx2, str05));
		System.out.println("2:06= "+Pattern.matches(regEx2, str06));
		System.out.println("2:07= "+Pattern.matches(regEx2, str07));
		System.out.println("2:08= "+Pattern.matches(regEx2, str08));
		System.out.println("2:09= "+Pattern.matches(regEx2, str09));
		System.out.println("2:10= "+Pattern.matches(regEx2, str10));
		System.out.println("2:11= "+Pattern.matches(regEx2, str11));
		System.out.println("2:12= "+Pattern.matches(regEx2, str12));
		System.out.println("2:13= "+Pattern.matches(regEx2, str13));
		System.out.println("2:14= "+Pattern.matches(regEx2, str14));
		System.out.println("2:15= "+Pattern.matches(regEx2, str15));
		System.out.println();
		
		System.out.println("3:00= "+Pattern.matches(regEx3, str00));
		System.out.println("3:01= "+Pattern.matches(regEx3, str01));
		System.out.println("3:02= "+Pattern.matches(regEx3, str02));
		System.out.println("3:03= "+Pattern.matches(regEx3, str03));
		System.out.println("3:04= "+Pattern.matches(regEx3, str04));
		System.out.println("3:05= "+Pattern.matches(regEx3, str05));
		System.out.println("3:06= "+Pattern.matches(regEx3, str06));
		System.out.println("3:07= "+Pattern.matches(regEx3, str07));
		System.out.println("3:08= "+Pattern.matches(regEx3, str08));
		System.out.println("3:09= "+Pattern.matches(regEx3, str09));
		System.out.println("3:10= "+Pattern.matches(regEx3, str10));
		System.out.println("3:11= "+Pattern.matches(regEx3, str11));
		System.out.println("3:12= "+Pattern.matches(regEx3, str12));
		System.out.println("3:13= "+Pattern.matches(regEx3, str13));
		System.out.println("3:14= "+Pattern.matches(regEx3, str14));
		System.out.println("3:15= "+Pattern.matches(regEx3, str15));
		System.out.println();
		
		System.out.println("4:00= "+Pattern.matches(regEx4, str00));
		System.out.println("4:01= "+Pattern.matches(regEx4, str01));
		System.out.println("4:02= "+Pattern.matches(regEx4, str02));
		System.out.println("4:03= "+Pattern.matches(regEx4, str03));
		System.out.println("4:04= "+Pattern.matches(regEx4, str04));
		System.out.println("4:05= "+Pattern.matches(regEx4, str05));
		System.out.println("4:06= "+Pattern.matches(regEx4, str06));
		System.out.println("4:07= "+Pattern.matches(regEx4, str07));
		System.out.println("4:08= "+Pattern.matches(regEx4, str08));
		System.out.println("4:09= "+Pattern.matches(regEx4, str09));
		System.out.println("4:10= "+Pattern.matches(regEx4, str10));
		System.out.println("4:11= "+Pattern.matches(regEx4, str11));
		System.out.println("4:12= "+Pattern.matches(regEx4, str12));
		System.out.println("4:13= "+Pattern.matches(regEx4, str13));
		System.out.println("4:14= "+Pattern.matches(regEx4, str14));
		System.out.println("4:15= "+Pattern.matches(regEx4, str15));
		System.out.println();
		
		System.out.println("5:00= "+Pattern.matches(regEx5, str00));
		System.out.println("5:01= "+Pattern.matches(regEx5, str01));
		System.out.println("5:02= "+Pattern.matches(regEx5, str02));
		System.out.println("5:03= "+Pattern.matches(regEx5, str03));
		System.out.println("5:04= "+Pattern.matches(regEx5, str04));
		System.out.println("5:05= "+Pattern.matches(regEx5, str05));
		System.out.println("5:06= "+Pattern.matches(regEx5, str06));
		System.out.println("5:07= "+Pattern.matches(regEx5, str07));
		System.out.println("5:08= "+Pattern.matches(regEx5, str08));
		System.out.println("5:09= "+Pattern.matches(regEx5, str09));
		System.out.println("5:10= "+Pattern.matches(regEx5, str10));
		System.out.println("5:11= "+Pattern.matches(regEx5, str11));
		System.out.println("5:12= "+Pattern.matches(regEx5, str12));
		System.out.println("5:13= "+Pattern.matches(regEx5, str13));
		System.out.println("5:14= "+Pattern.matches(regEx5, str14));
		System.out.println("5:15= "+Pattern.matches(regEx5, str15));
		System.out.println();
		
		System.out.println("6:00= "+Pattern.matches(regEx6, str00));
		System.out.println("6:01= "+Pattern.matches(regEx6, str01));
		System.out.println("6:02= "+Pattern.matches(regEx6, str02));
		System.out.println("6:03= "+Pattern.matches(regEx6, str03));
		System.out.println("6:04= "+Pattern.matches(regEx6, str04));
		System.out.println("6:05= "+Pattern.matches(regEx6, str05));
		System.out.println("6:06= "+Pattern.matches(regEx6, str06));
		System.out.println("6:07= "+Pattern.matches(regEx6, str07));
		System.out.println("6:08= "+Pattern.matches(regEx6, str08));
		System.out.println("6:09= "+Pattern.matches(regEx6, str09));
		System.out.println("6:10= "+Pattern.matches(regEx6, str10));
		System.out.println("6:11= "+Pattern.matches(regEx6, str11));
		System.out.println("6:12= "+Pattern.matches(regEx6, str12));
		System.out.println("6:13= "+Pattern.matches(regEx6, str13));
		System.out.println("6:14= "+Pattern.matches(regEx6, str14));
		System.out.println("6:15= "+Pattern.matches(regEx6, str15));
		System.out.println();
		
		System.out.println("7:00= "+Pattern.matches(regEx7, str00));
		System.out.println("7:01= "+Pattern.matches(regEx7, str01));
		System.out.println("7:02= "+Pattern.matches(regEx7, str02));
		System.out.println("7:03= "+Pattern.matches(regEx7, str03));
		System.out.println("7:04= "+Pattern.matches(regEx7, str04));
		System.out.println("7:05= "+Pattern.matches(regEx7, str05));
		System.out.println("7:06= "+Pattern.matches(regEx7, str06));
		System.out.println("7:07= "+Pattern.matches(regEx7, str07));
		System.out.println("7:08= "+Pattern.matches(regEx7, str08));
		System.out.println("7:09= "+Pattern.matches(regEx7, str09));
		System.out.println("7:10= "+Pattern.matches(regEx7, str10));
		System.out.println("7:11= "+Pattern.matches(regEx7, str11));
		System.out.println("7:12= "+Pattern.matches(regEx7, str12));
		System.out.println("7:13= "+Pattern.matches(regEx7, str13));
		System.out.println("7:14= "+Pattern.matches(regEx7, str14));
		System.out.println("7:15= "+Pattern.matches(regEx7, str15));
		System.out.println();
		
		System.out.println("8:00= "+Pattern.matches(regEx8, str00));
		System.out.println("8:01= "+Pattern.matches(regEx8, str01));
		System.out.println("8:02= "+Pattern.matches(regEx8, str02));
		System.out.println("8:03= "+Pattern.matches(regEx8, str03));
		System.out.println("8:04= "+Pattern.matches(regEx8, str04));
		System.out.println("8:05= "+Pattern.matches(regEx8, str05));
		System.out.println("8:06= "+Pattern.matches(regEx8, str06));
		System.out.println("8:07= "+Pattern.matches(regEx8, str07));
		System.out.println("8:08= "+Pattern.matches(regEx8, str08));
		System.out.println("8:09= "+Pattern.matches(regEx8, str09));
		System.out.println("8:10= "+Pattern.matches(regEx8, str10));
		System.out.println("8:11= "+Pattern.matches(regEx8, str11));
		System.out.println("8:12= "+Pattern.matches(regEx8, str12));
		System.out.println("8:13= "+Pattern.matches(regEx8, str13));
		System.out.println("8:14= "+Pattern.matches(regEx8, str14));
		System.out.println("8:15= "+Pattern.matches(regEx8, str15));
		System.out.println();
		
		System.out.println("9:00= "+Pattern.matches(regEx9, str00));
		System.out.println("9:01= "+Pattern.matches(regEx9, str01));
		System.out.println("9:02= "+Pattern.matches(regEx9, str02));
		System.out.println("9:03= "+Pattern.matches(regEx9, str03));
		System.out.println("9:04= "+Pattern.matches(regEx9, str04));
		System.out.println("9:05= "+Pattern.matches(regEx9, str05));
		System.out.println("9:06= "+Pattern.matches(regEx9, str06));
		System.out.println("9:07= "+Pattern.matches(regEx9, str07));
		System.out.println("9:08= "+Pattern.matches(regEx9, str08));
		System.out.println("9:09= "+Pattern.matches(regEx9, str09));
		System.out.println("9:10= "+Pattern.matches(regEx9, str10));
		System.out.println("9:11= "+Pattern.matches(regEx9, str11));
		System.out.println("9:12= "+Pattern.matches(regEx9, str12));
		System.out.println("9:13= "+Pattern.matches(regEx9, str13));
		System.out.println("9:14= "+Pattern.matches(regEx9, str14));
		System.out.println("9:15= "+Pattern.matches(regEx9, str15));
		System.out.println();
		
		
	}
}
